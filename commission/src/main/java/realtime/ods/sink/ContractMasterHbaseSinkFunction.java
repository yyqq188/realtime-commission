package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ContractMaster;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 13:11
 */
public class ContractMasterHbaseSinkFunction extends AbstractHbaseSinkFunction<ContractMaster> {
    public ContractMasterHbaseSinkFunction() {
        tableName = "t_contract_master";
    }

    @Override
    public void handle(ContractMaster value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("policy_code"), Bytes.toBytes(value.getPolicy_code()));
        put.addColumn(cf, Bytes.toBytes("apply_code"), Bytes.toBytes(value.getApply_code()));
        put.addColumn(cf, Bytes.toBytes("policy_type"), Bytes.toBytes(value.getPolicy_type()));
        put.addColumn(cf, Bytes.toBytes("head_id"), Bytes.toBytes(value.getHead_id()));
        put.addColumn(cf, Bytes.toBytes("branch_id"), Bytes.toBytes(value.getBranch_id()));
        put.addColumn(cf, Bytes.toBytes("organ_id"), Bytes.toBytes(value.getOrgan_id()));
        put.addColumn(cf, Bytes.toBytes("over_manage"), Bytes.toBytes(value.getOver_manage()));
        put.addColumn(cf, Bytes.toBytes("overdue_manage"), Bytes.toBytes(value.getOverdue_manage()));
        put.addColumn(cf, Bytes.toBytes("apply_date"), Bytes.toBytes(value.getApply_date()));
        put.addColumn(cf, Bytes.toBytes("validate_date"), Bytes.toBytes(value.getValidate_date()));
        put.addColumn(cf, Bytes.toBytes("expiry_date"), Bytes.toBytes(value.getExpiry_date()));
        put.addColumn(cf, Bytes.toBytes("liability_state"), Bytes.toBytes(value.getLiability_state()));
        put.addColumn(cf, Bytes.toBytes("suspend"), Bytes.toBytes(value.getSuspend()));
        put.addColumn(cf, Bytes.toBytes("suspend_cause"), Bytes.toBytes(value.getSuspend_cause()));
        put.addColumn(cf, Bytes.toBytes("end_cause"), Bytes.toBytes(value.getEnd_cause()));
        put.addColumn(cf, Bytes.toBytes("derivation"), Bytes.toBytes(value.getDerivation()));
        put.addColumn(cf, Bytes.toBytes("former_id"), Bytes.toBytes(value.getFormer_id()));
        put.addColumn(cf, Bytes.toBytes("initial_vali_date"), Bytes.toBytes(value.getInitial_vali_date()));
        put.addColumn(cf, Bytes.toBytes("campaign_code"), Bytes.toBytes(value.getCampaign_code()));
        put.addColumn(cf, Bytes.toBytes("money_id"), Bytes.toBytes(value.getMoney_id()));
        put.addColumn(cf, Bytes.toBytes("submission_date"), Bytes.toBytes(value.getSubmission_date()));
        put.addColumn(cf, Bytes.toBytes("advance_prem_indi"), Bytes.toBytes(value.getAdvance_prem_indi()));
        put.addColumn(cf, Bytes.toBytes("entity_fund_indi"), Bytes.toBytes(value.getEntity_fund_indi()));
        put.addColumn(cf, Bytes.toBytes("spouse_child_indi"), Bytes.toBytes(value.getSpouse_child_indi()));
        put.addColumn(cf, Bytes.toBytes("submit_channel"), Bytes.toBytes(value.getSubmit_channel()));
        put.addColumn(cf, Bytes.toBytes("introducer_no"), Bytes.toBytes(value.getIntroducer_no()));
        put.addColumn(cf, Bytes.toBytes("vesting_indi"), Bytes.toBytes(value.getVesting_indi()));
        put.addColumn(cf, Bytes.toBytes("suspend_chg_id"), Bytes.toBytes(value.getSuspend_chg_id()));
        put.addColumn(cf, Bytes.toBytes("fut_child_indi"), Bytes.toBytes(value.getFut_child_indi()));
        put.addColumn(cf, Bytes.toBytes("assignment_type"), Bytes.toBytes(value.getAssignment_type()));
        put.addColumn(cf, Bytes.toBytes("cpf_policy"), Bytes.toBytes(value.getCpf_policy()));
        put.addColumn(cf, Bytes.toBytes("servi_tax_indi"), Bytes.toBytes(value.getServi_tax_indi()));
        put.addColumn(cf, Bytes.toBytes("issue_date"), Bytes.toBytes(value.getIssue_date()));
        put.addColumn(cf, Bytes.toBytes("lapse_cause"), Bytes.toBytes(value.getLapse_cause()));
        put.addColumn(cf, Bytes.toBytes("trust_policy_indi"), Bytes.toBytes(value.getTrust_policy_indi()));
        put.addColumn(cf, Bytes.toBytes("policy_section"), Bytes.toBytes(value.getPolicy_section()));
        put.addColumn(cf, Bytes.toBytes("p_lapse_date"), Bytes.toBytes(value.getP_lapse_date()));
        put.addColumn(cf, Bytes.toBytes("pj_lapse_date"), Bytes.toBytes(value.getPj_lapse_date()));
        put.addColumn(cf, Bytes.toBytes("misc_debt"), Bytes.toBytes(value.getMisc_debt()));
        put.addColumn(cf, Bytes.toBytes("discount_type"), Bytes.toBytes(value.getDiscount_type()));
        put.addColumn(cf, Bytes.toBytes("service_agent"), Bytes.toBytes(value.getService_agent()));
        put.addColumn(cf, Bytes.toBytes("bereavement_indi"), Bytes.toBytes(value.getBereavement_indi()));
        put.addColumn(cf, Bytes.toBytes("risk_backdating_indi"), Bytes.toBytes(value.getRisk_backdating_indi()));
        put.addColumn(cf, Bytes.toBytes("reg_date"), Bytes.toBytes(value.getReg_date()));
        put.addColumn(cf, Bytes.toBytes("holiday_indi"), Bytes.toBytes(value.getHoliday_indi()));
        put.addColumn(cf, Bytes.toBytes("prem_collect_indi"), Bytes.toBytes(value.getPrem_collect_indi()));
        put.addColumn(cf, Bytes.toBytes("foreign_pol_indi"), Bytes.toBytes(value.getForeign_pol_indi()));
        put.addColumn(cf, Bytes.toBytes("ri_processed"), Bytes.toBytes(value.getRi_processed()));
        put.addColumn(cf, Bytes.toBytes("misc_debt_pld"), Bytes.toBytes(value.getMisc_debt_pld()));
        put.addColumn(cf, Bytes.toBytes("inforcing_date"), Bytes.toBytes(value.getInforcing_date()));
        put.addColumn(cf, Bytes.toBytes("apilp_maximum_limit"), Bytes.toBytes(value.getApilp_maximum_limit()));
        put.addColumn(cf, Bytes.toBytes("apilp_desc"), Bytes.toBytes(value.getApilp_desc()));
        put.addColumn(cf, Bytes.toBytes("auto_trust_ind"), Bytes.toBytes(value.getAuto_trust_ind()));
        put.addColumn(cf, Bytes.toBytes("apl_permit"), Bytes.toBytes(value.getApl_permit()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("liability_state_cause"), Bytes.toBytes(value.getLiability_state_cause()));
        put.addColumn(cf, Bytes.toBytes("liability_state_date"), Bytes.toBytes(value.getLiability_state_date()));
        put.addColumn(cf, Bytes.toBytes("annuitant_type"), Bytes.toBytes(value.getAnnuitant_type()));
        put.addColumn(cf, Bytes.toBytes("channel_staff_code"), Bytes.toBytes(value.getChannel_staff_code()));
        put.addColumn(cf, Bytes.toBytes("channel_type"), Bytes.toBytes(value.getChannel_type()));
        put.addColumn(cf, Bytes.toBytes("language_id"), Bytes.toBytes(value.getLanguage_id()));
        put.addColumn(cf, Bytes.toBytes("channel_org_id"), Bytes.toBytes(value.getChannel_org_id()));
        put.addColumn(cf, Bytes.toBytes("std_bene_indi_dth"), Bytes.toBytes(value.getStd_bene_indi_dth()));
        put.addColumn(cf, Bytes.toBytes("std_bene_indi_life"), Bytes.toBytes(value.getStd_bene_indi_life()));
        put.addColumn(cf, Bytes.toBytes("group_policy_id"), Bytes.toBytes(value.getGroup_policy_id()));
        put.addColumn(cf, Bytes.toBytes("service_agent_tel"), Bytes.toBytes(value.getService_agent_tel()));
        put.addColumn(cf, Bytes.toBytes("service_bank"), Bytes.toBytes(value.getService_bank()));
        put.addColumn(cf, Bytes.toBytes("service_bank_branch"), Bytes.toBytes(value.getService_bank_branch()));
        put.addColumn(cf, Bytes.toBytes("service_handler"), Bytes.toBytes(value.getService_handler()));
        put.addColumn(cf, Bytes.toBytes("bill_checked"), Bytes.toBytes(value.getBill_checked()));
        put.addColumn(cf, Bytes.toBytes("legal_bene"), Bytes.toBytes(value.getLegal_bene()));
        put.addColumn(cf, Bytes.toBytes("wsm_contract_id"), Bytes.toBytes(value.getWsm_contract_id()));
        put.addColumn(cf, Bytes.toBytes("autoapl_indi"), Bytes.toBytes(value.getAutoapl_indi()));
        put.addColumn(cf, Bytes.toBytes("service_handler_code"), Bytes.toBytes(value.getService_handler_code()));
        put.addColumn(cf, Bytes.toBytes("service_company"), Bytes.toBytes(value.getService_company()));
        put.addColumn(cf, Bytes.toBytes("service_company_branch"), Bytes.toBytes(value.getService_company_branch()));
        put.addColumn(cf, Bytes.toBytes("orphan_policy"), Bytes.toBytes(value.getOrphan_policy()));
        put.addColumn(cf, Bytes.toBytes("orphan_status"), Bytes.toBytes(value.getOrphan_status()));
        put.addColumn(cf, Bytes.toBytes("orphan_assign_date"), Bytes.toBytes(value.getOrphan_assign_date()));
        put.addColumn(cf, Bytes.toBytes("orphan_type"), Bytes.toBytes(value.getOrphan_type()));
        put.addColumn(cf, Bytes.toBytes("is_complicated_policy"), Bytes.toBytes(value.getIs_complicated_policy()));
        put.addColumn(cf, Bytes.toBytes("star_name"), Bytes.toBytes(value.getStar_name()));
        put.addColumn(cf, Bytes.toBytes("star_certi_code"), Bytes.toBytes(value.getStar_certi_code()));
        put.addColumn(cf, Bytes.toBytes("is_agent_submit"), Bytes.toBytes(value.getIs_agent_submit()));
        put.addColumn(cf, Bytes.toBytes("is_ag_pay"), Bytes.toBytes(value.getIs_ag_pay()));
        put.addColumn(cf, Bytes.toBytes("is_debitoverrun"), Bytes.toBytes(value.getIs_debitoverrun()));
        put.addColumn(cf, Bytes.toBytes("is_over_time"), Bytes.toBytes(value.getIs_over_time()));
        put.addColumn(cf, Bytes.toBytes("issue_organ"), Bytes.toBytes(value.getIssue_organ()));


        table.put(put);
    }
}
