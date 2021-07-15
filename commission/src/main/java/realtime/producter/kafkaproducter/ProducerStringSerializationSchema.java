package realtime.producter.kafkaproducter;

import org.apache.flink.streaming.connectors.kafka.KafkaSerializationSchema;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.annotation.Nullable;
import java.nio.charset.StandardCharsets;

/**
 * author: yhl
 * time: 2021/5/27 下午4:55
 * company: gientech
 */
public class ProducerStringSerializationSchema implements KafkaSerializationSchema<String> {
    private String topic;
    public ProducerStringSerializationSchema(String topic){
        super();
        this.topic = topic;
    }
    @Override
    public ProducerRecord<byte[],byte[]> serialize(String element, @Nullable Long timestamp) {

        return new ProducerRecord<byte[], byte[]>(topic,element.getBytes(StandardCharsets.UTF_8));
    }
}
