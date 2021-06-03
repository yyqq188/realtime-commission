package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.PolicyHolder;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:04
 */
public class PolicyHolderHbaseSinkFunction extends AbstractHbaseSinkFunction<PolicyHolder> {
    public PolicyHolderHbaseSinkFunction() {
        tableName = "t_policy_holder";
    }

    @Override
    public void handle(PolicyHolder value, Context context, HTable table) throws Exception {

        Put put = new Put(Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("dispatch_date"), Bytes.toBytes(value.getDispatch_date()));
        put.addColumn(cf, Bytes.toBytes("branch_receive_date"), Bytes.toBytes(value.getBranch_receive_date()));
        put.addColumn(cf, Bytes.toBytes("dc_collect_date"), Bytes.toBytes(value.getDc_collect_date()));
        put.addColumn(cf, Bytes.toBytes("return_reason"), Bytes.toBytes(value.getReturn_reason()));
        put.addColumn(cf, Bytes.toBytes("return_desc"), Bytes.toBytes(value.getReturn_desc()));
        put.addColumn(cf, Bytes.toBytes("acknowledge_date"), Bytes.toBytes(value.getAcknowledge_date()));
        put.addColumn(cf, Bytes.toBytes("nondeliver_reason"), Bytes.toBytes(value.getNondeliver_reason()));
        put.addColumn(cf, Bytes.toBytes("nondeliver_desc"), Bytes.toBytes(value.getNondeliver_desc()));
        put.addColumn(cf, Bytes.toBytes("nondeliver_begin_date"), Bytes.toBytes(value.getNondeliver_begin_date()));
        put.addColumn(cf, Bytes.toBytes("nondeliver_end_date"), Bytes.toBytes(value.getNondeliver_end_date()));
        put.addColumn(cf, Bytes.toBytes("reminder_date"), Bytes.toBytes(value.getReminder_date()));
        put.addColumn(cf, Bytes.toBytes("operator_id"), Bytes.toBytes(value.getOperator_id()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("inserted_timestamp"), Bytes.toBytes(value.getInserted_timestamp()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("updated_timestamp"), Bytes.toBytes(value.getUpdated_timestamp()));
        put.addColumn(cf, Bytes.toBytes("disp_date_updated_time"), Bytes.toBytes(value.getDisp_date_updated_time()));
        put.addColumn(cf, Bytes.toBytes("is_same_with_ph"), Bytes.toBytes(value.getIs_same_with_ph()));
        put.addColumn(cf, Bytes.toBytes("ack_way"), Bytes.toBytes(value.getAck_way()));


        table.put(put);
    }
}
