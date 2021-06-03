package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ContractMasterOther;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 13:24
 */
public class ContractMasterOtherHbaseSinkFunction extends AbstractHbaseSinkFunction<ContractMasterOther> {
    public ContractMasterOtherHbaseSinkFunction() {
        tableName = "t_contract_master_other";
    }

    @Override
    public void handle(ContractMasterOther value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("policy_mark"), Bytes.toBytes(value.getPolicy_mark()));
        put.addColumn(cf, Bytes.toBytes("is_os_input"), Bytes.toBytes(value.getIs_os_input()));
        put.addColumn(cf, Bytes.toBytes("freelook_period"), Bytes.toBytes(value.getFreelook_period()));
        put.addColumn(cf, Bytes.toBytes("contract_id"), Bytes.toBytes(value.getContract_id()));
        put.addColumn(cf, Bytes.toBytes("is_mep"), Bytes.toBytes(value.getIs_mep()));
        put.addColumn(cf, Bytes.toBytes("rec_agent"), Bytes.toBytes(value.getRec_agent()));
        put.addColumn(cf, Bytes.toBytes("is_open_red"), Bytes.toBytes(value.getIs_open_red()));
        put.addColumn(cf, Bytes.toBytes("product_plan_id"), Bytes.toBytes(value.getProduct_plan_id()));
        put.addColumn(cf, Bytes.toBytes("is_back_data"), Bytes.toBytes(value.getIs_back_data()));
        put.addColumn(cf, Bytes.toBytes("operation_terminal"), Bytes.toBytes(value.getOperation_terminal()));
        put.addColumn(cf, Bytes.toBytes("sum_amount"), Bytes.toBytes(value.getSum_amount()));
        put.addColumn(cf, Bytes.toBytes("split_commission_indi"), Bytes.toBytes(value.getSplit_commission_indi()));
        put.addColumn(cf, Bytes.toBytes("is_os_input_print"), Bytes.toBytes(value.getIs_os_input_print()));
        put.addColumn(cf, Bytes.toBytes("cancel_print_date"), Bytes.toBytes(value.getCancel_print_date()));
        put.addColumn(cf, Bytes.toBytes("closed_status"), Bytes.toBytes(value.getClosed_status()));
        put.addColumn(cf, Bytes.toBytes("closed_time"), Bytes.toBytes(value.getClosed_time()));
        put.addColumn(cf, Bytes.toBytes("reopen_time"), Bytes.toBytes(value.getReopen_time()));
        put.addColumn(cf, Bytes.toBytes("is_force_mark"), Bytes.toBytes(value.getIs_force_mark()));
        put.addColumn(cf, Bytes.toBytes("is_double_record"), Bytes.toBytes(value.getIs_double_record()));
        put.addColumn(cf, Bytes.toBytes("trans_fapiao_flag"), Bytes.toBytes(value.getTrans_fapiao_flag()));
        put.addColumn(cf, Bytes.toBytes("need_advance_inforce"), Bytes.toBytes(value.getNeed_advance_inforce()));
        put.addColumn(cf, Bytes.toBytes("real_lapse_date"), Bytes.toBytes(value.getReal_lapse_date()));
        put.addColumn(cf, Bytes.toBytes("policy_print_type"), Bytes.toBytes(value.getPolicy_print_type()));
        put.addColumn(cf, Bytes.toBytes("is_stick_reason"), Bytes.toBytes(value.getIs_stick_reason()));
        put.addColumn(cf, Bytes.toBytes("back_desc"), Bytes.toBytes(value.getBack_desc()));
        put.addColumn(cf, Bytes.toBytes("is_stick_reason_bak"), Bytes.toBytes(value.getIs_stick_reason_bak()));
        put.addColumn(cf, Bytes.toBytes("policysign_province"), Bytes.toBytes(value.getPolicysign_province()));
        put.addColumn(cf, Bytes.toBytes("policysign_city"), Bytes.toBytes(value.getPolicysign_city()));
        put.addColumn(cf, Bytes.toBytes("is_need_uw"), Bytes.toBytes(value.getIs_need_uw()));
        put.addColumn(cf, Bytes.toBytes("auto_uw_decision"), Bytes.toBytes(value.getAuto_uw_decision()));
        put.addColumn(cf, Bytes.toBytes("is_related_trans"), Bytes.toBytes(value.getIs_related_trans()));
        put.addColumn(cf, Bytes.toBytes("related_trans_add_time"), Bytes.toBytes(value.getRelated_trans_add_time()));
        put.addColumn(cf, Bytes.toBytes("plan_number"), Bytes.toBytes(value.getPlan_number()));
        put.addColumn(cf, Bytes.toBytes("agent_star_level"), Bytes.toBytes(value.getAgent_star_level()));
        put.addColumn(cf, Bytes.toBytes("has_medi_record"), Bytes.toBytes(value.getHas_medi_record()));
        put.addColumn(cf, Bytes.toBytes("auto_proposal"), Bytes.toBytes(value.getAuto_proposal()));
        put.addColumn(cf, Bytes.toBytes("apply_area"), Bytes.toBytes(value.getApply_area()));
        put.addColumn(cf, Bytes.toBytes("sf_licensed_no"), Bytes.toBytes(value.getSf_licensed_no()));
        put.addColumn(cf, Bytes.toBytes("is_trust"), Bytes.toBytes(value.getIs_trust()));
        put.addColumn(cf, Bytes.toBytes("reinsu_upgrade_flag"), Bytes.toBytes(value.getReinsu_upgrade_flag()));
        put.addColumn(cf, Bytes.toBytes("reinsu_source_policy_code"), Bytes.toBytes(value.getReinsu_source_policy_code()));
        put.addColumn(cf, Bytes.toBytes("interview_way"), Bytes.toBytes(value.getInterview_way()));
        put.addColumn(cf, Bytes.toBytes("back_reg_declare"), Bytes.toBytes(value.getBack_reg_declare()));
        put.addColumn(cf, Bytes.toBytes("pre_withdraw_date"), Bytes.toBytes(value.getPre_withdraw_date()));
        put.addColumn(cf, Bytes.toBytes("service_type"), Bytes.toBytes(value.getService_type()));
        put.addColumn(cf, Bytes.toBytes("allot_stytle"), Bytes.toBytes(value.getAllot_stytle()));
        put.addColumn(cf, Bytes.toBytes("supervision_persion"), Bytes.toBytes(value.getSupervision_persion()));
        put.addColumn(cf, Bytes.toBytes("renew_persion"), Bytes.toBytes(value.getRenew_persion()));
        put.addColumn(cf, Bytes.toBytes("lock_state"), Bytes.toBytes(value.getLock_state()));
        put.addColumn(cf, Bytes.toBytes("lock_startdate"), Bytes.toBytes(value.getLock_startdate()));
        put.addColumn(cf, Bytes.toBytes("lock_enddate"), Bytes.toBytes(value.getLock_enddate()));
        put.addColumn(cf, Bytes.toBytes("lock_reason"), Bytes.toBytes(value.getLock_reason()));
        put.addColumn(cf, Bytes.toBytes("operator"), Bytes.toBytes(value.getOperator()));
        put.addColumn(cf, Bytes.toBytes("service_persion"), Bytes.toBytes(value.getService_persion()));
        put.addColumn(cf, Bytes.toBytes("oldservice_type"), Bytes.toBytes(value.getOldservice_type()));
        put.addColumn(cf, Bytes.toBytes("stchangedate"), Bytes.toBytes(value.getStchangedate()));
        put.addColumn(cf, Bytes.toBytes("bank_private"), Bytes.toBytes(value.getBank_private()));
        put.addColumn(cf, Bytes.toBytes("insurance_source"), Bytes.toBytes(value.getInsurance_source()));
        put.addColumn(cf, Bytes.toBytes("is_pre_reg"), Bytes.toBytes(value.getIs_pre_reg()));
        put.addColumn(cf, Bytes.toBytes("prem_col_date"), Bytes.toBytes(value.getPrem_col_date()));
        put.addColumn(cf, Bytes.toBytes("policy_place"), Bytes.toBytes(value.getPolicy_place()));


        table.put(put);
    }
}
