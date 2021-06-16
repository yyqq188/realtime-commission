package realtime.ods;

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
import realtime.ods.hbasetable.DefineContractBeneHbaseTable;
import realtime.ods.job.JobDefine;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;



/**
 * author: yhl
 * time: 2021/6/1 下午1:11
 * company: gientech
 */
public class MainBak {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        EnvironmentSettings settings = EnvironmentSettings.newInstance().useBlinkPlanner().build();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env, settings);
        env.enableCheckpointing(60000, CheckpointingMode.EXACTLY_ONCE);
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);
        CheckpointConfig checkpointConfig = env.getCheckpointConfig();
        checkpointConfig.enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
        checkpointConfig.setTolerableCheckpointFailureNumber(0);
        //设置重启策略  3次尝试,每次间隔1分钟
//        env.setRestartStrategy(RestartStrategies.fixedDelayRestart(3,60000));


        env.getConfig().setAutoWatermarkInterval(60000);
        Map<String,String> map = new HashMap<>();
//        map.put("kafka.url", args[0]);
//        map.put("hbase.zookeeper.quorum", args[1]);
//        map.put("zookeeper.port",args[2]);

        map.put("kafka.url", "localhost:9092");
        map.put("hbase.zookeeper.quorum", "192.168.33.10");
        map.put("zookeeper.port","2181");


        //把相关配置设置为全局变量
        env.getConfig().setGlobalJobParameters(ParameterTool.fromMap(map));
//        tableEnv.registerFunction("time_format",new DateFormatFunction());


        //从配置中获得hbase的配置
        String zkUrl = env.getConfig().getGlobalJobParameters().toMap().getOrDefault("hbase.zookeeper.quorum","");
        String zkPort = env.getConfig().getGlobalJobParameters().toMap().getOrDefault("zookeeper.port","2181");
        Configuration hbaseConf = HBaseConfiguration.create();
        hbaseConf.set(HConstants.ZOOKEEPER_QUORUM,zkUrl);
        hbaseConf.set(HConstants.ZOOKEEPER_CLIENT_PORT,zkPort);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);

//        DefineContractExtendHbaseTable.defineContractExtend(tableEnv,hbaseConf);
//        DefinePolicyProducerRoleHbaseTable.definePolicyProducerRole(tableEnv,hbaseConf);

        DefineContractBeneHbaseTable.defineContractBene(tableEnv,hbaseConf);

        //从配置中获得kafka的配置
        String kafkaUrl = env.getConfig().getGlobalJobParameters().toMap().getOrDefault("kafka.url","");
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers",kafkaUrl);
        properties.setProperty("group.id","gourp1");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("auto.offset.reset","latest");


//        JobDefine.contractExtendHbaseTableJob(env,properties,"test");
        JobDefine.contractBeneHbaseTableJob(env,properties,"test2");



        env.execute("aa");
    }
}
