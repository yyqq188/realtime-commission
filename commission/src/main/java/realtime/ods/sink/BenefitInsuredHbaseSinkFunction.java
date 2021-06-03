package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.BenefitInsured;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 11:19
 */
public class BenefitInsuredHbaseSinkFunction extends AbstractHbaseSinkFunction<BenefitInsured> {
    public BenefitInsuredHbaseSinkFunction(){
        tableName = "t_benefit_insured";
    }
    @Override
    public void handle(BenefitInsured value, Context context, HTable table) throws Exception {

        Put put = new Put(Bytes.toBytes(value.getList_id()));

        put.addColumn(cf, Bytes.toBytes("item_id"), Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("insured_id"), Bytes.toBytes(value.getInsured_id()));
        put.addColumn(cf, Bytes.toBytes("entry_age"), Bytes.toBytes(value.getEntry_age()));
        put.addColumn(cf, Bytes.toBytes("entry_age_month"), Bytes.toBytes(value.getEntry_age_month()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("order_id"), Bytes.toBytes(value.getOrder_id()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("job_class"), Bytes.toBytes(value.getJob_class()));

        table.put(put);
    }
}
