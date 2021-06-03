package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.PolicyChange;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 14:55
 */
public class PolicyChangeHbaseSinkFunction extends AbstractHbaseSinkFunction<PolicyChange> {
    public PolicyChangeHbaseSinkFunction() {
        tableName = "t_policy_change";
    }

    @Override
    public void handle(PolicyChange value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getPolicy_chg_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("service_id"), Bytes.toBytes(value.getService_id()));
        put.addColumn(cf, Bytes.toBytes("change_record"), Bytes.toBytes(value.getChange_record()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("validate_time"), Bytes.toBytes(value.getValidate_time()));
        put.addColumn(cf, Bytes.toBytes("need_underwrite"), Bytes.toBytes(value.getNeed_underwrite()));
        put.addColumn(cf, Bytes.toBytes("apply_time"), Bytes.toBytes(value.getApply_time()));
        put.addColumn(cf, Bytes.toBytes("change_cause"), Bytes.toBytes(value.getChange_cause()));
        put.addColumn(cf, Bytes.toBytes("cancel_id"), Bytes.toBytes(value.getCancel_id()));
        put.addColumn(cf, Bytes.toBytes("cancel_time"), Bytes.toBytes(value.getCancel_time()));
        put.addColumn(cf, Bytes.toBytes("rejecter_id"), Bytes.toBytes(value.getRejecter_id()));
        put.addColumn(cf, Bytes.toBytes("reject_time"), Bytes.toBytes(value.getReject_time()));
        put.addColumn(cf, Bytes.toBytes("reject_note"), Bytes.toBytes(value.getReject_note()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("master_chg_id"), Bytes.toBytes(value.getMaster_chg_id()));
        put.addColumn(cf, Bytes.toBytes("cancel_cause"), Bytes.toBytes(value.getCancel_cause()));
        put.addColumn(cf, Bytes.toBytes("cancel_note"), Bytes.toBytes(value.getCancel_note()));
        put.addColumn(cf, Bytes.toBytes("reject_cause"), Bytes.toBytes(value.getReject_cause()));
        put.addColumn(cf, Bytes.toBytes("last_handler_id"), Bytes.toBytes(value.getLast_handler_id()));
        put.addColumn(cf, Bytes.toBytes("last_entry_time"), Bytes.toBytes(value.getLast_entry_time()));
        put.addColumn(cf, Bytes.toBytes("last_uw_disp_id"), Bytes.toBytes(value.getLast_uw_disp_id()));
        put.addColumn(cf, Bytes.toBytes("last_uw_disp_time"), Bytes.toBytes(value.getLast_uw_disp_time()));
        put.addColumn(cf, Bytes.toBytes("order_id"), Bytes.toBytes(value.getOrder_id()));
        put.addColumn(cf, Bytes.toBytes("policy_chg_status"), Bytes.toBytes(value.getPolicy_chg_status()));
        put.addColumn(cf, Bytes.toBytes("dispatch_emp"), Bytes.toBytes(value.getDispatch_emp()));
        put.addColumn(cf, Bytes.toBytes("letter_effect_type"), Bytes.toBytes(value.getLetter_effect_type()));
        put.addColumn(cf, Bytes.toBytes("dispatch_type"), Bytes.toBytes(value.getDispatch_type()));
        put.addColumn(cf, Bytes.toBytes("dispatch_letter"), Bytes.toBytes(value.getDispatch_letter()));
        put.addColumn(cf, Bytes.toBytes("sub_service_id"), Bytes.toBytes(value.getSub_service_id()));
        put.addColumn(cf, Bytes.toBytes("change_note"), Bytes.toBytes(value.getChange_note()));
        put.addColumn(cf, Bytes.toBytes("ri_processed"), Bytes.toBytes(value.getRi_processed()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("inserted_timestamp"), Bytes.toBytes(value.getInserted_timestamp()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("updated_timestamp"), Bytes.toBytes(value.getUpdated_timestamp()));
        put.addColumn(cf, Bytes.toBytes("pre_policy_chg"), Bytes.toBytes(value.getPre_policy_chg()));
        put.addColumn(cf, Bytes.toBytes("change_seq"), Bytes.toBytes(value.getChange_seq()));
        put.addColumn(cf, Bytes.toBytes("finish_time"), Bytes.toBytes(value.getFinish_time()));
        put.addColumn(cf, Bytes.toBytes("org_id"), Bytes.toBytes(value.getOrg_id()));
        put.addColumn(cf, Bytes.toBytes("request_effect_date"), Bytes.toBytes(value.getRequest_effect_date()));
        put.addColumn(cf, Bytes.toBytes("task_due_date"), Bytes.toBytes(value.getTask_due_date()));
        put.addColumn(cf, Bytes.toBytes("item_opened"), Bytes.toBytes(value.getItem_opened()));
        put.addColumn(cf, Bytes.toBytes("reg_time"), Bytes.toBytes(value.getReg_time()));
        put.addColumn(cf, Bytes.toBytes("source_type"), Bytes.toBytes(value.getSource_type()));


        table.put(put);
    }
}
