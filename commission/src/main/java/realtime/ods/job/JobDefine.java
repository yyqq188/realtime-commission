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
import realtime.ods.kafkaschema.AgentSchema;
import realtime.ods.kafkaschema.BenefitInsuredSchema;
import realtime.ods.kafkaschema.ContractBeneSchema;
import realtime.ods.sink.AgentHbaseSinkFunction;
import realtime.ods.sink.BenefitInsuredHbaseSinkFunction;
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


    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
    }

    public static void benefitInsuredHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<BenefitInsured> source = env.addSource(new FlinkKafkaConsumer<>(topic, new BenefitInsuredSchema(), properties));
        source.addSink(new BenefitInsuredHbaseSinkFunction()).name("BenefitInsuredHbaseSinkFunction");
    }

//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }
//    public static void agentHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
//        DataStreamSource<Agent> source = env.addSource(new FlinkKafkaConsumer<>(topic, new AgentSchema(), properties));
//        source.addSink(new AgentHbaseSinkFunction()).name("AgentHbaseSinkFunction");
//    }


//    public static final String AGENTCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_AGENT_NEW.csv";
//    public static final String BENEFIT_INSUREDCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_BENEFIT_INSURED.csv";
//    public static final String CONTRACTBENECsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_CONTRACT_BENE.csv";
//    public static final String CONTRACT_PRODUCTCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_CONTRACT_PRODUCT1.csv";
//    public static final String CUSTOMERCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_CUSTOMER1.csv";
//    public static final String INSURED_LISTCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_INSURED_LIST1.csv";
//    public static final String POLICY_CHANGECsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_POLICY_CHANGE.csv";
//    public static final String PREM_ARAPCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_PREM_ARAP.csv";
//    public static final String PRODUCT_COMMISIONCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_PRODUCT_COMMISION.csv";
//    public static final String PRODUCTION_DETAILCsvPath = "/home/yhl/下载/realtime-commission/realtimecommssion-basedata/T_PRODUCTION_DETAIL_01.csv";
//    public static final String PRODUCT_LIFECsvPath












    public static void contractBeneHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ContractBene> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractBeneSchema(), properties));
        source.addSink(new ContractBeneHbaseSinkFunction()).name("ContractBeneHbaseSinkFunction");
    }


}
