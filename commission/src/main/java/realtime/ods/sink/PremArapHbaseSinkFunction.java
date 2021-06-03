package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.PremArap;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:28
 */
public class PremArapHbaseSinkFunction extends AbstractHbaseSinkFunction<PremArap>{
public PremArapHbaseSinkFunction(){
    tableName = "t_prem_arap";}
    @Override
    public void handle(PremArap value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("list_id"), Bytes.toBytes(value.getList_id()));
        put.addColumn(cf, Bytes.toBytes("head_id"), Bytes.toBytes(value.getHead_id()));
        put.addColumn(cf, Bytes.toBytes("branch_id"), Bytes.toBytes(value.getBranch_id()));
        put.addColumn(cf, Bytes.toBytes("organ_id"), Bytes.toBytes(value.getOrgan_id()));
        put.addColumn(cf, Bytes.toBytes("policy_type"), Bytes.toBytes(value.getPolicy_type()));
        put.addColumn(cf, Bytes.toBytes("happen_time"), Bytes.toBytes(value.getHappen_time()));
        put.addColumn(cf, Bytes.toBytes("due_time"), Bytes.toBytes(value.getDue_time()));
        put.addColumn(cf, Bytes.toBytes("agent_id"), Bytes.toBytes(value.getAgent_id()));
        put.addColumn(cf, Bytes.toBytes("grade_id"), Bytes.toBytes(value.getGrade_id()));
        put.addColumn(cf, Bytes.toBytes("commision_rate"), Bytes.toBytes(value.getCommision_rate()));
        put.addColumn(cf, Bytes.toBytes("normal_commision"), Bytes.toBytes(value.getNormal_commision()));
        put.addColumn(cf, Bytes.toBytes("discount_rate"), Bytes.toBytes(value.getDiscount_rate()));
        put.addColumn(cf, Bytes.toBytes("commision"), Bytes.toBytes(value.getCommision()));
        put.addColumn(cf, Bytes.toBytes("commision_id"), Bytes.toBytes(value.getCommision_id()));
        put.addColumn(cf, Bytes.toBytes("is_pay"), Bytes.toBytes(value.getIs_pay()));
        put.addColumn(cf, Bytes.toBytes("policy_year"), Bytes.toBytes(value.getPolicy_year()));
        put.addColumn(cf, Bytes.toBytes("assign_rate"), Bytes.toBytes(value.getAssign_rate()));
        put.addColumn(cf, Bytes.toBytes("sign_id"), Bytes.toBytes(value.getSign_id()));
        put.addColumn(cf, Bytes.toBytes("mgr_rate"), Bytes.toBytes(value.getMgr_rate()));
        put.addColumn(cf, Bytes.toBytes("agent_cate"), Bytes.toBytes(value.getAgent_cate()));
        put.addColumn(cf, Bytes.toBytes("commision_type_id"), Bytes.toBytes(value.getCommision_type_id()));
        put.addColumn(cf, Bytes.toBytes("derivation"), Bytes.toBytes(value.getDerivation()));
        put.addColumn(cf, Bytes.toBytes("fee_type"), Bytes.toBytes(value.getFee_type()));
        put.addColumn(cf, Bytes.toBytes("gst_commision"), Bytes.toBytes(value.getGst_commision()));
        put.addColumn(cf, Bytes.toBytes("suspend_cause"), Bytes.toBytes(value.getSuspend_cause()));
        put.addColumn(cf, Bytes.toBytes("issue_mode"), Bytes.toBytes(value.getIssue_mode()));
        put.addColumn(cf, Bytes.toBytes("payment_id"), Bytes.toBytes(value.getPayment_id()));
        put.addColumn(cf, Bytes.toBytes("posted"), Bytes.toBytes(value.getPosted()));
        put.addColumn(cf, Bytes.toBytes("cred_id"), Bytes.toBytes(value.getCred_id()));
        put.addColumn(cf, Bytes.toBytes("post_id"), Bytes.toBytes(value.getPost_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("money_id"), Bytes.toBytes(value.getMoney_id()));
        put.addColumn(cf, Bytes.toBytes("comm_status"), Bytes.toBytes(value.getComm_status()));
        put.addColumn(cf, Bytes.toBytes("aggregation_id"), Bytes.toBytes(value.getAggregation_id()));
        put.addColumn(cf, Bytes.toBytes("benefit_item_id"), Bytes.toBytes(value.getBenefit_item_id()));
        put.addColumn(cf, Bytes.toBytes("product_id"), Bytes.toBytes(value.getProduct_id()));
        put.addColumn(cf, Bytes.toBytes("related_id"), Bytes.toBytes(value.getRelated_id()));
        put.addColumn(cf, Bytes.toBytes("reversal_policy_chg_id"), Bytes.toBytes(value.getReversal_policy_chg_id()));
        put.addColumn(cf, Bytes.toBytes("comm_source"), Bytes.toBytes(value.getComm_source()));
        put.addColumn(cf, Bytes.toBytes("comm_comment"), Bytes.toBytes(value.getComm_comment()));
        put.addColumn(cf, Bytes.toBytes("exchange_rate"), Bytes.toBytes(value.getExchange_rate()));
        put.addColumn(cf, Bytes.toBytes("confirm_date"), Bytes.toBytes(value.getConfirm_date()));
        put.addColumn(cf, Bytes.toBytes("accounting_date"), Bytes.toBytes(value.getAccounting_date()));
        put.addColumn(cf, Bytes.toBytes("je_posting_id"), Bytes.toBytes(value.getJe_posting_id()));
        put.addColumn(cf, Bytes.toBytes("je_creator_id"), Bytes.toBytes(value.getJe_creator_id()));
        put.addColumn(cf, Bytes.toBytes("dr_seg1"), Bytes.toBytes(value.getDr_seg1()));
        put.addColumn(cf, Bytes.toBytes("dr_seg2"), Bytes.toBytes(value.getDr_seg2()));
        put.addColumn(cf, Bytes.toBytes("dr_seg3"), Bytes.toBytes(value.getDr_seg3()));
        put.addColumn(cf, Bytes.toBytes("dr_seg4"), Bytes.toBytes(value.getDr_seg4()));
        put.addColumn(cf, Bytes.toBytes("dr_seg5"), Bytes.toBytes(value.getDr_seg5()));
        put.addColumn(cf, Bytes.toBytes("dr_seg6"), Bytes.toBytes(value.getDr_seg6()));
        put.addColumn(cf, Bytes.toBytes("dr_seg7"), Bytes.toBytes(value.getDr_seg7()));
        put.addColumn(cf, Bytes.toBytes("dr_seg8"), Bytes.toBytes(value.getDr_seg8()));
        put.addColumn(cf, Bytes.toBytes("cr_seg1"), Bytes.toBytes(value.getCr_seg1()));
        put.addColumn(cf, Bytes.toBytes("cr_seg2"), Bytes.toBytes(value.getCr_seg2()));
        put.addColumn(cf, Bytes.toBytes("cr_seg3"), Bytes.toBytes(value.getCr_seg3()));
        put.addColumn(cf, Bytes.toBytes("cr_seg4"), Bytes.toBytes(value.getCr_seg4()));
        put.addColumn(cf, Bytes.toBytes("cr_seg5"), Bytes.toBytes(value.getCr_seg5()));
        put.addColumn(cf, Bytes.toBytes("cr_seg6"), Bytes.toBytes(value.getCr_seg6()));
        put.addColumn(cf, Bytes.toBytes("cr_seg7"), Bytes.toBytes(value.getCr_seg7()));
        put.addColumn(cf, Bytes.toBytes("cr_seg8"), Bytes.toBytes(value.getCr_seg8()));
        put.addColumn(cf, Bytes.toBytes("confirm_emp"), Bytes.toBytes(value.getConfirm_emp()));
        put.addColumn(cf, Bytes.toBytes("child_level"), Bytes.toBytes(value.getChild_level()));
        put.addColumn(cf, Bytes.toBytes("dr_seg9"), Bytes.toBytes(value.getDr_seg9()));
        put.addColumn(cf, Bytes.toBytes("dr_seg10"), Bytes.toBytes(value.getDr_seg10()));
        put.addColumn(cf, Bytes.toBytes("dr_seg11"), Bytes.toBytes(value.getDr_seg11()));
        put.addColumn(cf, Bytes.toBytes("dr_seg12"), Bytes.toBytes(value.getDr_seg12()));
        put.addColumn(cf, Bytes.toBytes("dr_seg13"), Bytes.toBytes(value.getDr_seg13()));
        put.addColumn(cf, Bytes.toBytes("dr_seg14"), Bytes.toBytes(value.getDr_seg14()));
        put.addColumn(cf, Bytes.toBytes("dr_seg15"), Bytes.toBytes(value.getDr_seg15()));
        put.addColumn(cf, Bytes.toBytes("dr_seg16"), Bytes.toBytes(value.getDr_seg16()));
        put.addColumn(cf, Bytes.toBytes("dr_seg17"), Bytes.toBytes(value.getDr_seg17()));
        put.addColumn(cf, Bytes.toBytes("dr_seg18"), Bytes.toBytes(value.getDr_seg18()));
        put.addColumn(cf, Bytes.toBytes("dr_seg19"), Bytes.toBytes(value.getDr_seg19()));
        put.addColumn(cf, Bytes.toBytes("dr_seg20"), Bytes.toBytes(value.getDr_seg20()));
        put.addColumn(cf, Bytes.toBytes("cr_seg9"), Bytes.toBytes(value.getCr_seg9()));
        put.addColumn(cf, Bytes.toBytes("cr_seg10"), Bytes.toBytes(value.getCr_seg10()));
        put.addColumn(cf, Bytes.toBytes("cr_seg11"), Bytes.toBytes(value.getCr_seg11()));
        put.addColumn(cf, Bytes.toBytes("cr_seg12"), Bytes.toBytes(value.getCr_seg12()));
        put.addColumn(cf, Bytes.toBytes("cr_seg13"), Bytes.toBytes(value.getCr_seg13()));
        put.addColumn(cf, Bytes.toBytes("cr_seg14"), Bytes.toBytes(value.getCr_seg14()));
        put.addColumn(cf, Bytes.toBytes("cr_seg15"), Bytes.toBytes(value.getCr_seg15()));
        put.addColumn(cf, Bytes.toBytes("cr_seg16"), Bytes.toBytes(value.getCr_seg16()));
        put.addColumn(cf, Bytes.toBytes("cr_seg17"), Bytes.toBytes(value.getCr_seg17()));
        put.addColumn(cf, Bytes.toBytes("cr_seg18"), Bytes.toBytes(value.getCr_seg18()));
        put.addColumn(cf, Bytes.toBytes("cr_seg19"), Bytes.toBytes(value.getCr_seg19()));
        put.addColumn(cf, Bytes.toBytes("cr_seg20"), Bytes.toBytes(value.getCr_seg20()));
        put.addColumn(cf, Bytes.toBytes("channel_org_id"), Bytes.toBytes(value.getChannel_org_id()));
        put.addColumn(cf, Bytes.toBytes("stream_id"), Bytes.toBytes(value.getStream_id()));
        put.addColumn(cf, Bytes.toBytes("prem_type"), Bytes.toBytes(value.getPrem_type()));
        put.addColumn(cf, Bytes.toBytes("change_id"), Bytes.toBytes(value.getChange_id()));
        put.addColumn(cf, Bytes.toBytes("policy_chg_id"), Bytes.toBytes(value.getPolicy_chg_id()));
        put.addColumn(cf, Bytes.toBytes("policy_period"), Bytes.toBytes(value.getPolicy_period()));
        put.addColumn(cf, Bytes.toBytes("aggre_rate_bf"), Bytes.toBytes(value.getAggre_rate_bf()));
        put.addColumn(cf, Bytes.toBytes("aggre_rate_af"), Bytes.toBytes(value.getAggre_rate_af()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("is_extra_commision"), Bytes.toBytes(value.getIs_extra_commision()));

        table.put(put);
    }
}
