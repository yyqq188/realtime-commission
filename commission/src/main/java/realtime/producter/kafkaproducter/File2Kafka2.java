package realtime.producter.kafkaproducter;

import com.alibaba.fastjson.JSON;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import realtime.ods.entity.ContractBene;
import realtime.ods.entity.PremArap;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * author: yhl
 * time: 2021/5/26 下午5:32
 * company: gientech
 * kafka 0.10的命令
 * bin/zookeeper-server-start.sh config/zookeeper.properties
 * bin/kafka-server-start.sh config/server.properties
 * bin/kafka-topics.sh --list --zookeeper 127.0.0.1:2181
 * bin/kafka-topics.sh --create --topic test --zookeeper 127.0.0.1:2181 --partitions 3 --replication-factor 1
 * bin/kafka-console-consumer.sh --bootstrap-server 127.0.0.1:9092 --topic test
 */
public class File2Kafka2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        Properties props = new Properties();
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.setProperty(ProducerConfig.BATCH_SIZE_CONFIG,"100");
        props.setProperty(ProducerConfig.LINGER_MS_CONFIG,"500");
        //todo
        String topic = "test2";

        FlinkKafkaProducer<String> kafkaSink = new FlinkKafkaProducer<>(topic,
                new ProducerStringSerializationSchema(topic),
                props,
                FlinkKafkaProducer.Semantic.EXACTLY_ONCE);
        //todo 这里要改
        DataStreamSource<String> source = env
                .readTextFile(Contrant.PREM_ARAPCsvPath);

        //todo 这里输入的数据要和java的类型相匹配,也要改
        source
//                .filter(data ->data.split(",").length== 32)
                .map(data -> {

            String[] datas = data.replace("\"","").split(",");
            Field[] fields = PremArap.class.getDeclaredFields();
            PremArap premArap = new PremArap();
            for(int i = 0;i< fields.length - 1;i++){
                Field f = fields[i];
                f.setAccessible(true);
                f.set(premArap,datas[i]);
            }
            String jsonStr = JSON.toJSONString(premArap);
            System.out.println(data);
            System.out.println(jsonStr);
            Thread.sleep(1000);
            return jsonStr;
        }).addSink(kafkaSink);
        env.execute(File2Kafka2.class.getSimpleName());
    }
}
