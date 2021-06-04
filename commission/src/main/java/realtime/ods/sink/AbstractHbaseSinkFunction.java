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
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ContractBene;

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

    public void invoke(ContractBene value,Context context) throws Exception{

//        try{
//
//
//        }catch (Exception e){
//            log.error(e.toString());
//        }
        HTable table = null;
        table = (HTable) connection.getTable(TableName.valueOf(tableName));
        handle1(value,context,table);

    }
    public abstract void handle(OUT value, Context context, HTable table) throws Exception;
    public  void handle1(ContractBene value, Context context, HTable table) throws Exception{
        System.out.println("======================================================");
        System.out.println(value);
        Put put = new Put(Bytes.toBytes(value.getList_id()));
        put.addColumn(cf, Bytes.toBytes("party_id"), Bytes.toBytes(value.getParty_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("insurant"), Bytes.toBytes(value.getInsurant()));
        put.addColumn(cf, Bytes.toBytes("bene_type"), Bytes.toBytes(value.getBene_type()));
        put.addColumn(cf, Bytes.toBytes("share_order"), Bytes.toBytes(value.getShare_order()));
        put.addColumn(cf, Bytes.toBytes("share_rate"), Bytes.toBytes(value.getShare_rate()));
        put.addColumn(cf, Bytes.toBytes("designation"), Bytes.toBytes(value.getDesignation()));
        put.addColumn(cf, Bytes.toBytes("legal_bene"), Bytes.toBytes(value.getLegal_bene()));
        put.addColumn(cf, Bytes.toBytes("address_id"), Bytes.toBytes(value.getAddress_id()));
        put.addColumn(cf, Bytes.toBytes("telephone"), Bytes.toBytes(value.getTelephone()));
        put.addColumn(cf, Bytes.toBytes("mobile_tel"), Bytes.toBytes(value.getMobile_tel()));
        put.addColumn(cf, Bytes.toBytes("active_status"), Bytes.toBytes(value.getActive_status()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("irrevocable_indi"), Bytes.toBytes(value.getIrrevocable_indi()));
        put.addColumn(cf, Bytes.toBytes("is_same_address"), Bytes.toBytes(value.getIs_same_address()));
        put.addColumn(cf, Bytes.toBytes("job_company"), Bytes.toBytes(value.getJob_company()));
        put.addColumn(cf, Bytes.toBytes("work_content"), Bytes.toBytes(value.getWork_content()));
        put.addColumn(cf, Bytes.toBytes("usual_address"), Bytes.toBytes(value.getUsual_address()));
        put.addColumn(cf, Bytes.toBytes("income_source"), Bytes.toBytes(value.getIncome_source()));
        put.addColumn(cf, Bytes.toBytes("is_long_term"), Bytes.toBytes(value.getIs_long_term()));
        put.addColumn(cf, Bytes.toBytes("marriage_id"), Bytes.toBytes(value.getMarriage_id()));
        put.addColumn(cf, Bytes.toBytes("certi_type"), Bytes.toBytes(value.getCerti_type()));
        put.addColumn(cf, Bytes.toBytes("certi_code"), Bytes.toBytes(value.getCerti_code()));
        put.addColumn(cf, Bytes.toBytes("is_personal_tax_status"), Bytes.toBytes(value.getIs_personal_tax_status()));
//        put.addColumn(cf, Bytes.toBytes("expiry_date"), Bytes.toBytes(value.getExpiry_date()));

        table.put(put);
    };

    public byte[] getBytes(Object value){
        if(value == null){
            return Bytes.toBytes("");
        }else{
            return Bytes.toBytes(value.toString());
        }
    }
}