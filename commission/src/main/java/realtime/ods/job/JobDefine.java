package realtime.ods.job;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import java.util.Properties;

import org.apache.flink.table.api.Table;
//import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import realtime.ods.entity.*;
import realtime.ods.entity.result.Result;
import realtime.ods.exec.MyJoinFunction;
import realtime.ods.kafkaschema.*;
import realtime.ods.sink.*;

import org.apache.flink.table.api.*;
import realtime.ods.sink.result.ResultHbaseSinkFunction;

import static org.apache.flink.table.api.Expressions.*;


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

    public static void contractBeneHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ContractBene> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractBeneSchema(), properties));
        source.addSink(new ContractBeneHbaseSinkFunction()).name("ContractBeneHbaseSinkFunction");
    }

    public static void contractExtendHbaseTableJob(StreamExecutionEnvironment env, Properties properties, String
            topic) {
        DataStreamSource<ContractExtend> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractExtendSchema(), properties));
        source.addSink(new ContractExtendHbaseSinkFunction()).name("ContractExtendHbaseSinkFunction");
    }

    public static void contractMasterTableJob(StreamExecutionEnvironment env, Properties properties, String topic) {
        DataStreamSource<ContractMaster> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractMasterSchema(), properties));
        source.addSink(new ContractMasterHbaseSinkFunction()).name("ContractMasterHbaseSinkFunction");
    }

    public static void contractMasterOtherTableJob(StreamExecutionEnvironment env, Properties properties, String topic) {
        DataStreamSource<ContractMasterOther> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractMasterOtherSchema(), properties));
        source.addSink(new ContractMasterOtherHbaseSinkFunction()).name("ContractMasterOtherHbaseSinkFunction");
    }

    public static void contractProductTableJob(StreamExecutionEnvironment env, Properties properties, String topic) {
        DataStreamSource<ContractProduct> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ContractProductSchema(), properties));
        source.addSink(new ContractProductHbaseSinkFunction()).name("ContractProductHbaseSinkFunction");
    }

    public static void customerHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<Customer> source = env.addSource(new FlinkKafkaConsumer<>(topic, new CustomerSchema(), properties));
        source.addSink(new CustomerHbaseSinkFunction()).name("CustomerHbaseSinkFunction");
    }

    public static void insuredListHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<InsuredList> source = env.addSource(new FlinkKafkaConsumer<>(topic, new InsuredListSchema(), properties));
        source.addSink(new InsuredListHbaseSinkFunction()).name("InsuredListHbaseSinkFunction");
    }

    public static void policyAcknowledgementHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PolicyAcknowledgement> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PolicyAcknowledgementSchema(), properties));
        source.addSink(new PolicyAcknowledgementHbaseSinkFunction()).name("PolicyAcknowledgementHbaseSinkFunction");
    }
    public static void policyChangeHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PolicyChange> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PolicyChangeSchema(), properties));
        source.addSink(new PolicyChangeHbaseSinkFunction()).name("PolicyChangeHbaseSinkFunction");
    }
    public static void policyHolderHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PolicyHolder> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PolicyHolderSchema(), properties));
        source.addSink(new PolicyHolderHbaseSinkFunction()).name("PolicyHolderHbaseSinkFunction");
    }
    public static void policyInterviewHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PolicyInterview> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PolicyInterviewSchema(), properties));
        source.addSink(new PolicyInterviewHbaseSinkFunction()).name("PolicyInterviewHbaseSinkFunction");
    }
    public static void policyProducerRoleHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PolicyProducerRole> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PolicyProducerRoleSchema(), properties));
        source.addSink(new PolicyProducerRoleHbaseSinkFunction()).name("PolicyProducerRoleHbaseSinkFunction");
    }

    public static void premArapHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<PremArap> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PremArapSchema(), properties));
        source.addSink(new PremArapHbaseSinkFunction()).name("PremArapHbaseSinkFunction");
    }
    public static void productCommisionHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ProductCommision> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ProductCommisionSchema(), properties));
        source.addSink(new ProductCommisionHbaseSinkFunction()).name("ProductCommisionHbaseSinkFunction");
    }

    public static void productionDetailHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ProductionDetail> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ProductionDetailSchema(), properties));
        source.addSink(new ProductionDetailHbaseSinkFunction()).name("ProductionDetailHbaseSinkFunction");
    }

    public static void productLifeHbaseTableJob(StreamExecutionEnvironment env,Properties properties,String topic){
        DataStreamSource<ProductLife> source = env.addSource(new FlinkKafkaConsumer<>(topic, new ProductLifeSchema(), properties));
        source.addSink(new ProductLifeHbaseSinkFunction()).name("ProductLifeHbaseSinkFunction");
    }


    //  进行深入加工
    public static void premArapHbaseTableJob(StreamExecutionEnvironment env,StreamTableEnvironment tableEnv,Properties properties,String topic){
        DataStreamSource<PremArap> source = env.addSource(new FlinkKafkaConsumer<>(topic, new PremArapSchema(), properties));
        tableEnv.registerDataStream("test",source);
        Table test = tableEnv.from("test");
        Table result = test.filter(
                and(
                        $("Offset_Status").isEqual(1),
                        $("fee_type").in(41, 42),
                        $("Fee_Status").in(1, 11)


                ))
                .groupBy($("policy_id"),
                        $("item_id"))
                .select($("policy_id"),
                        $("item_id"),
                        $("due_time").distinct().count().as("discount_num"));

        DataStream<Result> resultDataStream = tableEnv.toAppendStream(result, Result.class);

        resultDataStream.addSink(new ResultHbaseSinkFunction()).name("ResultHbaseSinkFunction");
    }




    //驱动关联
    public static void joinWithHbaseJob(StreamExecutionEnvironment env, StreamTableEnvironment tableEnv, Properties properties, String topic){
        DataStreamSource<BenefitInsured> source = env.addSource(new FlinkKafkaConsumer<>(topic, new BenefitInsuredSchema(), properties));
        tableEnv.createTemporaryView("driverTable",source);
//        new MyJoinFunction().handle(source,env,tableEnv);
    }


}
