package realtime.ods.kafkaproducter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import realtime.ods.entity.ContractBene;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * author: yhl
 * time: 2021/5/26 下午5:32
 * company: gientech
 */
public class File2Kafka2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        Properties props = new Properties();
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.setProperty(ProducerConfig.BATCH_SIZE_CONFIG,"100");
        props.setProperty(ProducerConfig.LINGER_MS_CONFIG,"500");
        String topic = "test3";

        FlinkKafkaProducer<String> kafkaSink = new FlinkKafkaProducer<>(topic,
                new ProducerStringSerializationSchema(topic),
                props,
                FlinkKafkaProducer.Semantic.EXACTLY_ONCE);


//        DataStreamSource<String> source = env.readTextFile(File2Kafka2.class
//                .getResource("/T_AGENT_NEW.csv").getPath());
        DataStreamSource<String> source = env.readTextFile(
                Contrant.CONTRACTBENECsvPath);

        //这里输入的数据要和java的类型相匹配
        source.filter(data ->data.split(",").length== 32).map(data -> {

            String[] datas = data.replace("\"","").split(",");
            Field[] fields = ContractBene.class.getDeclaredFields();
            ContractBene contractBene = new ContractBene();
            for(int i = 0;i< fields.length - 1;i++){
                Field f = fields[i];
                f.setAccessible(true);
                f.set(contractBene,datas[i]);
            }
            String jsonStr = JSON.toJSONString(contractBene);
            System.out.println(data);
            System.out.println(jsonStr);
//            String jsonStr = JSONObject.toJSON(contractBene).toString()
//                    .replace("\\","")
//                    .replace("\"\"","\"")
//                    .replace(":\"\",",":\"weizhi\",");

//            JSONObject middle = JSONObject.parseObject(jsonStr);
//            middle.put("ts",String.valueOf(System.currentTimeMillis()));
//            String res = JSONObject.toJSON(middle).toString();
            Thread.sleep(1000);
            return jsonStr;
        }).addSink(kafkaSink);

        env.execute(File2Kafka2.class.getSimpleName());
    }
}
