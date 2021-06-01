package realtime.ods.sink;

import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.ExecutionConfig;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * author: yhl
 * time: 2021/6/1 下午2:49
 * company: gientech
 */
@Slf4j
public abstract class AbstractHbaseSinkFunction<OUT> extends RichSinkFunction<OUT> {
    protected static String cfString = "f";
    protected static byte[] cf = Bytes.toBytes(cfString);
    protected String tableName = null;
    private Connection connection;
    public void open(Configuration params) throws Exception{
        super.open(params);
        ExecutionConfig.GlobalJobParameters globalJobParameters = getRuntimeContext().getExecutionConfig().getGlobalJobParameters();
//        org.apache.hadoop.conf.Configuration hbaseConf = HBaseConfiguration.create();
//        hbaseConf.set("hbase.zookeeper.quorum",globalJobParameters.toMap().getOrDefault("hbase.zookeeper.quorum",""));

        String zkUrl = getRuntimeContext().getExecutionConfig().getGlobalJobParameters().toMap().getOrDefault("hbase.zookeeper.quorum","");
        String zkPort = getRuntimeContext().getExecutionConfig().getGlobalJobParameters().toMap().getOrDefault("zookeeper.port","2181");
        org.apache.hadoop.conf.Configuration hbaseConf = HBaseConfiguration.create();
        hbaseConf.set(HConstants.ZOOKEEPER_QUORUM,zkUrl);
        hbaseConf.set(HConstants.ZOOKEEPER_CLIENT_PORT,zkPort);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
        hbaseConf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);



        if(null == connection){
            connection = ConnectionFactory.createConnection(hbaseConf);
        }
    }

    public void close() throws Exception{
        connection.close();
    }

    public void invoke(OUT value,Context context) throws Exception{
        HTable table = null;
        try{
            table = (HTable) connection.getTable(TableName.valueOf(tableName));
            handle(value,context,table);
        }catch (Exception e){
            log.error(e.toString());
        }

    }

    public abstract void handle(OUT value, Context context, HTable table) throws Exception;

    public byte[] getBytes(Object value){
        if(value == null){
            return Bytes.toBytes("");
        }else{
            return Bytes.toBytes(value.toString());
        }
    }
}