package realtime.ods.sink;

import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ContractExtend;

/**
 * author: yhl
 * time: 2021/6/1 下午3:18
 * company: gientech
 */
public class ContractExtendHbaseSinkFunction extends AbstractHbaseSinkFunction<ContractExtend> {

    public ContractExtendHbaseSinkFunction() {
        tableName = "t_contract_extend";
    }

    @Override
    public void handle(ContractExtend value, SinkFunction.Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("due_date"), Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("policy_year"), Bytes.toBytes(value.getPolicy_year()));
        put.addColumn(cf, Bytes.toBytes("policy_period"), Bytes.toBytes(value.getPolicy_period()));
        put.addColumn(cf, Bytes.toBytes("strgy_due_date"), Bytes.toBytes(value.getStrgy_due_date()));
        put.addColumn(cf, Bytes.toBytes("prem_status"), Bytes.toBytes(value.getPrem_status()));
        put.addColumn(cf, Bytes.toBytes("sa_due_date"), Bytes.toBytes(value.getSa_due_date()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("billing_date"), Bytes.toBytes(value.getBilling_date()));
        put.addColumn(cf, Bytes.toBytes("reminder_date"), Bytes.toBytes(value.getReminder_date()));
        put.addColumn(cf, Bytes.toBytes("indx_due_date"), Bytes.toBytes(value.getIndx_due_date()));
        put.addColumn(cf, Bytes.toBytes("indx_reject"), Bytes.toBytes(value.getIndx_reject()));

        table.put(put);

    }
}