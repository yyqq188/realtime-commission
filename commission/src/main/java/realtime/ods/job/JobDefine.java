package realtime.ods.job;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

import java.util.Properties;
import realtime.ods.entity.*;
import realtime.ods.exec.MapKafkaRichFlatMapFunction;
import realtime.ods.sink.ContractBeneHbaseSinkFunction;
import realtime.ods.sink.ContractExtendHbaseSinkFunction;

/**
 * author: yhl
 * time: 2021/6/1 下午2:34
 * company: gientech
 */
public class JobDefine {
    public static void contractExtendHbaseTableJob(StreamExecutionEnvironment env, Properties properties,String topic){
        //获得kafka流数据
        SingleOutputStreamOperator<String> consumer = env.addSource(new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), properties));
        //把String 转化为 java 对象 ,自定义类,要用到return
        SingleOutputStreamOperator<ContractExtend> user = consumer.flatMap(new MapKafkaRichFlatMapFunction<ContractExtend>()).returns(ContractExtend.class);
        user.addSink(new ContractExtendHbaseSinkFunction()).name("ContractExtendHbaseSinkFunction");
    }
    public static void contractBeneHbaseTableJob(StreamExecutionEnvironment env, Properties properties,String topic){
        //获得kafka流数据
        SingleOutputStreamOperator<String> consumer =
                env.addSource(new FlinkKafkaConsumer<>(topic, new SimpleStringSchema(), properties));
        //把String 转化为 java 对象 ,自定义类,要用到return
        SingleOutputStreamOperator<ContractBene> user =
                consumer.flatMap(new MapKafkaRichFlatMapFunction<ContractBene>()).returns(ContractBene.class);
        user.addSink(new ContractBeneHbaseSinkFunction()).name("ContractBeneHbaseSinkFunction");
    }

}
