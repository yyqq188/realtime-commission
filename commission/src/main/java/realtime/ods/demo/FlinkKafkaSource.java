package realtime.ods.demo;

import demo.source.MyKafkaSource;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.ArrayList;
import java.util.Properties;

/**
 * author: yhl
 * time: 2021/5/31 上午7:40
 * company: gientech
 */
public class FlinkKafkaSource {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //checkpoint的配置
        env.enableCheckpointing(5000);
        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
        env.getCheckpointConfig().setMinPauseBetweenCheckpoints(500);
        env.getCheckpointConfig().setCheckpointTimeout(60000);
        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);

        String topic = "test";
        Properties prop = new Properties();
        prop.setProperty("bootstrap.servers","localhost:9092");
        prop.setProperty("group.id","con1");

        FlinkKafkaConsumer<String> consumer =  new FlinkKafkaConsumer<>(topic,new SimpleStringSchema(),prop);
        consumer.setStartFromGroupOffsets();

        DataStreamSource<String> source =  env.addSource(consumer);







//        source.addSink(new RichSinkFunction<String>() {
//            String zkServer = "192.168.33.10";
//            String port = "2181";
//            Connection conn = null;
//            @Override
//            public void open(Configuration parameters) throws Exception {
//                org.apache.hadoop.conf.Configuration conf = HBaseConfiguration.create();
//
//                conf.set(HConstants.ZOOKEEPER_QUORUM,zkServer);
//                conf.set(HConstants.ZOOKEEPER_CLIENT_PORT,port);
//                conf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
//                conf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);
//                conn = ConnectionFactory.createConnection(conf);
//
//
//
//                super.open(parameters);
//            }
//
//            @Override
//            public void close() throws Exception {
//                if(conn != null){
//                    conn.close();
//                }
//                super.close();
//            }
//
//            @Override
//            public void invoke(String value, Context context) throws Exception {
//                TableName tableName = TableName.valueOf("test");
//                String cf = "test";
//                String[] arrs = value.split(",");
//                Put put = new Put(Bytes.toBytes(arrs[0]));
//                put.addColumn(Bytes.toBytes(cf),Bytes.toBytes("name"),Bytes.toBytes(arrs[5]));
//                ArrayList<Put> lists = new ArrayList<>();
//                lists.add(put);
//                //设置缓存
//                BufferedMutatorParams params = new BufferedMutatorParams(tableName);
//                params.writeBufferSize(1024*1024);
//                BufferedMutator mutator = conn.getBufferedMutator(params);
//                mutator.mutate(lists);
//                mutator.flush();
//                lists.clear();
//
//            }
//        });




        String jobName = MyKafkaSource.class.getSimpleName();
        env.execute(jobName);
    }
}
