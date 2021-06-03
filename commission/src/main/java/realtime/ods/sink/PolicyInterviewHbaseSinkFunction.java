package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.PolicyInterview;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:15
 */
public class PolicyInterviewHbaseSinkFunction extends AbstractHbaseSinkFunction<PolicyInterview>{
    public PolicyInterviewHbaseSinkFunction(){
        tableName = "t_policy_interview";
    }
    @Override
    public void handle(PolicyInterview value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getList_id()));
        put.addColumn(cf, Bytes.toBytes("switch_list_id"), Bytes.toBytes(value.getSwitch_list_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("policy_code"), Bytes.toBytes(value.getPolicy_code()));
        put.addColumn(cf, Bytes.toBytes("benefit_code"), Bytes.toBytes(value.getBenefit_code()));
        put.addColumn(cf, Bytes.toBytes("interview_type"), Bytes.toBytes(value.getInterview_type()));
        put.addColumn(cf, Bytes.toBytes("next_due_date"), Bytes.toBytes(value.getNext_due_date()));
        put.addColumn(cf, Bytes.toBytes("lapse_date"), Bytes.toBytes(value.getLapse_date()));
        put.addColumn(cf, Bytes.toBytes("csr"), Bytes.toBytes(value.getCsr()));
        put.addColumn(cf, Bytes.toBytes("interview_status"), Bytes.toBytes(value.getInterview_status()));
        put.addColumn(cf, Bytes.toBytes("interview_time"), Bytes.toBytes(value.getInterview_time()));
        put.addColumn(cf, Bytes.toBytes("syn_status"), Bytes.toBytes(value.getSyn_status()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("case_status"), Bytes.toBytes(value.getCase_status()));
        put.addColumn(cf, Bytes.toBytes("case_processing_time"), Bytes.toBytes(value.getCase_processing_time()));
        put.addColumn(cf, Bytes.toBytes("interview_case"), Bytes.toBytes(value.getInterview_case()));
        put.addColumn(cf, Bytes.toBytes("interview_cause"), Bytes.toBytes(value.getInterview_cause()));
        put.addColumn(cf, Bytes.toBytes("interview_detail"), Bytes.toBytes(value.getInterview_detail()));
        put.addColumn(cf, Bytes.toBytes("interview_way"), Bytes.toBytes(value.getInterview_way()));
        put.addColumn(cf, Bytes.toBytes("interview_way_real"), Bytes.toBytes(value.getInterview_way_real()));
        put.addColumn(cf, Bytes.toBytes("agent_star_level"), Bytes.toBytes(value.getAgent_star_level()));


        table.put(put);
    }
}
