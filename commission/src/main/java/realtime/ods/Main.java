package realtime.ods;

import org.apache.flink.api.common.restartstrategy.RestartStrategies;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;

//import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import realtime.ods.hbasetable.*;
import realtime.ods.job.JobDefine;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * author: yhl
 * time: 2021/6/1 下午1:11
 * company: gientech
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        EnvironmentSettings settings = EnvironmentSettings.newInstance().useBlinkPlanner().build();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env, settings);
//        env.enableCheckpointing(60000, CheckpointingMode.EXACTLY_ONCE);
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
//        CheckpointConfig checkpointConfig = env.getCheckpointConfig();
//        checkpointConfig.enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
//        checkpointConfig.setTolerableCheckpointFailureNumber(0);

//        env.getConfig().setAutoWatermarkInterval(60000);
        //配置参数
        Map<String,String> map = new HashMap<>();
        map.put("kafka.url", "localhost:9092");
        map.put("hbase.zookeeper.quorum", "192.168.33.10");
        map.put("zookeeper.port","2181");
        env.getConfig().setGlobalJobParameters(ParameterTool.fromMap(map));


        String zkUrl = map.getOrDefault("hbase.zookeeper.quorum","");
        String zkPort = map.getOrDefault("zookeeper.port","2181");
        org.apache.hadoop.conf.Configuration hbaseConf = HBaseConfiguration.create();
        hbaseConf.set(HConstants.ZOOKEEPER_QUORUM,zkUrl);
        hbaseConf.set(HConstants.ZOOKEEPER_CLIENT_PORT,zkPort);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);
        //注册flink的hbase表
        DefineAgentHbaseTable.defineAgent(tableEnv,hbaseConf);
        DefineBenefitInsuredHbaseTable.defineBenefitInsured(tableEnv,hbaseConf);
        DefineContractBeneHbaseTable.defineContractBene(tableEnv,hbaseConf);
        DefineContractExtendHbaseTable.defineContractExtend(tableEnv,hbaseConf);
        DefineContractMasterHbaseTable.defineContractMaster(tableEnv,hbaseConf);
        DefineContractMasterOtherHbaseTable.defineContractMasterOther(tableEnv,hbaseConf);
        DefineContractProductHbaseTable.defineContractProduct(tableEnv,hbaseConf);
        DefineCustomerHbaseTable.defineCustomer(tableEnv,hbaseConf);
        DefineInsuredListHbaseTable.defineInsuredList(tableEnv,hbaseConf);
        DefinePolicyAcknowledgementHbaseTable.definePolicyAcknowledgement(tableEnv,hbaseConf);
        DefinePolicyChangeHbaseTable.definePolicyChange(tableEnv,hbaseConf);
        DefinePolicyHolderHbaseTable.definePolicyHolder(tableEnv,hbaseConf);
        DefinePolicyInterviewHbaseTable.definePolicyInterview(tableEnv,hbaseConf);
        DefinePolicyProducerRoleHbaseTable.definePolicyProducerRole(tableEnv,hbaseConf);
        DefinePremArapHbaseTable.definePremArap(tableEnv,hbaseConf);
        DefineProductCommisionHbaseTable.defineProductCommision(tableEnv,hbaseConf);
        DefineProductionDetailHbaseTable.defineProductionDetail(tableEnv,hbaseConf);
        DefineProductLifeHbaseTable.defineProductLife(tableEnv,hbaseConf);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        String kafkaUrl = env.getConfig().getGlobalJobParameters().toMap().getOrDefault("kafka.url","");
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers",kafkaUrl);
        properties.setProperty("group.id","gourp1");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

//        JobDefine.contractBeneHbaseTableJob(env,properties,"test");
        JobDefine.premArapHbaseTableJob(env,properties,"test");


        //驱动关联
        env.execute("aa");
    }
}
