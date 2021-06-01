package realtime.ods.kafkaproducter;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

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
        String topic = "test";

        FlinkKafkaProducer<String> kafkaSink = new FlinkKafkaProducer<>(topic,
                new ProducerStringSerializationSchema(topic),
                props,
                FlinkKafkaProducer.Semantic.EXACTLY_ONCE);


//        DataStreamSource<String> source = env.readTextFile(File2Kafka2.class
//                .getResource("/T_AGENT_NEW.csv").getPath());
        DataStreamSource<String> source = env.readTextFile("/home/yhl/下载/realtimecommssion-basedata/T_CONTRACT_BENE.csv");

        source.filter(data ->data.split(",").length== 32).map(data -> {

            Thread.sleep(1000);
            return data;
        }).addSink(kafkaSink);

        env.execute(File2Kafka2.class.getSimpleName());
    }
}
