package demo.demo1;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.types.Row;

import java.util.Properties;

/**
 * author: yhl
 * time: 2021/6/16 下午2:14
 * company: gientech
 */
public class RegisterTable {
    public static void registerSourceTable(TableInfo tableInfo, StreamExecutionEnvironment env){
        Properties properties = tableInfo.getProps();
        String tableName = tableInfo.getTableName();

        if("kafka".equals(properties.getProperty("type"))){
            Properties kafkaProps = new Properties();
            properties.forEach((k,v) ->{
                if(k.toString().startsWith("kafka.")){
                    kafkaProps.setProperty(k.toString().replace("kafka.",""),
                            v.toString());
                }
            });
            String topic = properties.getProperty("kafka.topic");
//            FlinkKafkaConsumer<Row>(topic,new SimpleStringSchema(),kafkaProps);
//            env.addSource(flinkKafkasource);
           //开始注册源表


        }
    }
    public static void registerSinkTable(TableInfo tableInfo,StreamTableEnvironment tableEnv){
        Properties props = new Properties();
        String tableName = tableInfo.getTableName();
        if("console".equals(props.getProperty("type"))){
            //开始注册各种sink表
//            ConsoleTableSink
        }
    }


}
