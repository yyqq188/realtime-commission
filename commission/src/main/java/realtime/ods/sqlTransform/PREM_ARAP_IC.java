package realtime.ods.sqlTransform;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
//import org.apache.flink.table.api.java.StreamTableEnvironment;

import java.util.Properties;

/**
 * author: yhl
 * time: 2021/6/8 下午3:48
 * company: gientech
 */
public class PREM_ARAP_IC {
    public void handle(StreamExecutionEnvironment env, StreamTableEnvironment tableEnv, Properties properties, String topic){

        FlinkKafkaConsumer<String> kafkasource = new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), properties);
        kafkasource.setCommitOffsetsOnCheckpoints(false);
        kafkasource.setStartFromLatest();
        kafkasource.setStartFromGroupOffsets();

        DataStreamSource<String> source = env.addSource(kafkasource);
        tableEnv.createTemporaryView("prem_arap_ic",source);
        Table preArapIC = tableEnv.from("prem_arap_ic");


    }

}
