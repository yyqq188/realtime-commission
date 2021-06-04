package realtime.ods.job;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.time.Time;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.AscendingTimestampExtractor;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import java.util.Properties;
import realtime.ods.entity.*;
import realtime.ods.exec.MapKafkaRichFlatMapFunction;
import realtime.ods.kafkaschema.ContractBeneSchema;
import realtime.ods.sink.ContractBeneHbaseSinkFunction;
import realtime.ods.sink.ContractExtendHbaseSinkFunction;

/**
 * author: yhl
 * time: 2021/6/1 下午2:34
 * company: gientech
 */
public class JobDefine {
//    public static void contractExtendHbaseTableJob(StreamExecutionEnvironment env, Properties properties,String topic){
//        SingleOutputStreamOperator<String> consumer = env.addSource(new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), properties));
//        SingleOutputStreamOperator<ContractExtend> user = consumer.flatMap(new MapKafkaRichFlatMapFunction<ContractExtend>()).returns(ContractExtend.class);
//        user.addSink(new ContractExtendHbaseSinkFunction()).name("ContractExtendHbaseSinkFunction");
//    }

    public static void contractBeneHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ContractBene> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractBeneSchema(), properties));
        source.addSink(new ContractBeneHbaseSinkFunction()).name("ContractBeneHbaseSinkFunction");
    }


}
