package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.PolicyProducerRole;

/**
 * author: yhl
 * time: 2021/6/1 下午3:48
 * company: gientech
 */
public class PolicyProducerRoleHbaseSinkFunction extends AbstractHbaseSinkFunction<PolicyProducerRole> {
    public PolicyProducerRoleHbaseSinkFunction(){
        tableName = "t_policy_producer_role";
    }
    @Override
    public void handle(PolicyProducerRole value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getRole_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("item_id"), Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("producer_role"), Bytes.toBytes(value.getProducer_role()));
        put.addColumn(cf, Bytes.toBytes("producer_id"), Bytes.toBytes(value.getProducer_id()));
        put.addColumn(cf, Bytes.toBytes("producer_position"), Bytes.toBytes(value.getProducer_position()));
        put.addColumn(cf, Bytes.toBytes("active_indi"), Bytes.toBytes(value.getActive_indi()));
        put.addColumn(cf, Bytes.toBytes("assign_rate"), Bytes.toBytes(value.getAssign_rate()));
        put.addColumn(cf, Bytes.toBytes("start_date"), Bytes.toBytes(value.getStart_date()));
        put.addColumn(cf, Bytes.toBytes("end_date"), Bytes.toBytes(value.getEnd_date()));
        put.addColumn(cf, Bytes.toBytes("hierarchy_date"), Bytes.toBytes(value.getHierarchy_date()));
        put.addColumn(cf, Bytes.toBytes("change_id"), Bytes.toBytes(value.getChange_id()));
        put.addColumn(cf, Bytes.toBytes("policy_chg_id"), Bytes.toBytes(value.getPolicy_chg_id()));
        put.addColumn(cf, Bytes.toBytes("change_type"), Bytes.toBytes(value.getChange_type()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("change_comment"), Bytes.toBytes(value.getChange_comment()));
        put.addColumn(cf, Bytes.toBytes("pre_change_id"), Bytes.toBytes(value.getPre_change_id()));


    }
}
