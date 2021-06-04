package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 11:37
 */
public class DefineContractMasterHbaseTable {
    public static void defineContractMaster(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_contract_master");

        hBaseTableSource.setRowKey("policy_id", String.class);
        hBaseTableSource.addColumn("f", "policy_code", String.class);
        hBaseTableSource.addColumn("f", "apply_code", String.class);
        hBaseTableSource.addColumn("f", "policy_type", String.class);
        hBaseTableSource.addColumn("f", "head_id", String.class);
        hBaseTableSource.addColumn("f", "branch_id", String.class);
        hBaseTableSource.addColumn("f", "organ_id", String.class);
        hBaseTableSource.addColumn("f", "over_manage", String.class);
        hBaseTableSource.addColumn("f", "overdue_manage", String.class);
        hBaseTableSource.addColumn("f", "apply_date", String.class);
        hBaseTableSource.addColumn("f", "validate_date", String.class);
        hBaseTableSource.addColumn("f", "expiry_date", String.class);
        hBaseTableSource.addColumn("f", "liability_state", String.class);
        hBaseTableSource.addColumn("f", "suspend", String.class);
        hBaseTableSource.addColumn("f", "suspend_cause", String.class);
        hBaseTableSource.addColumn("f", "end_cause", String.class);
        hBaseTableSource.addColumn("f", "derivation", String.class);
        hBaseTableSource.addColumn("f", "former_id", String.class);
        hBaseTableSource.addColumn("f", "initial_vali_date", String.class);
        hBaseTableSource.addColumn("f", "campaign_code", String.class);
        hBaseTableSource.addColumn("f", "money_id", String.class);
        hBaseTableSource.addColumn("f", "submission_date", String.class);
        hBaseTableSource.addColumn("f", "advance_prem_indi", String.class);
        hBaseTableSource.addColumn("f", "entity_fund_indi", String.class);
        hBaseTableSource.addColumn("f", "spouse_child_indi", String.class);
        hBaseTableSource.addColumn("f", "submit_channel", String.class);
        hBaseTableSource.addColumn("f", "introducer_no", String.class);
        hBaseTableSource.addColumn("f", "vesting_indi", String.class);
        hBaseTableSource.addColumn("f", "suspend_chg_id", String.class);
        hBaseTableSource.addColumn("f", "fut_child_indi", String.class);
        hBaseTableSource.addColumn("f", "assignment_type", String.class);
        hBaseTableSource.addColumn("f", "cpf_policy", String.class);
        hBaseTableSource.addColumn("f", "servi_tax_indi", String.class);
        hBaseTableSource.addColumn("f", "issue_date", String.class);
        hBaseTableSource.addColumn("f", "lapse_cause", String.class);
        hBaseTableSource.addColumn("f", "trust_policy_indi", String.class);
        hBaseTableSource.addColumn("f", "policy_section", String.class);
        hBaseTableSource.addColumn("f", "p_lapse_date", String.class);
        hBaseTableSource.addColumn("f", "pj_lapse_date", String.class);
        hBaseTableSource.addColumn("f", "misc_debt", String.class);
        hBaseTableSource.addColumn("f", "discount_type", String.class);
        hBaseTableSource.addColumn("f", "service_agent", String.class);
        hBaseTableSource.addColumn("f", "bereavement_indi", String.class);
        hBaseTableSource.addColumn("f", "risk_backdating_indi", String.class);
        hBaseTableSource.addColumn("f", "reg_date", String.class);
        hBaseTableSource.addColumn("f", "holiday_indi", String.class);
        hBaseTableSource.addColumn("f", "prem_collect_indi", String.class);
        hBaseTableSource.addColumn("f", "foreign_pol_indi", String.class);
        hBaseTableSource.addColumn("f", "ri_processed", String.class);
        hBaseTableSource.addColumn("f", "misc_debt_pld", String.class);
        hBaseTableSource.addColumn("f", "inforcing_date", String.class);
        hBaseTableSource.addColumn("f", "apilp_maximum_limit", String.class);
        hBaseTableSource.addColumn("f", "apilp_desc", String.class);
        hBaseTableSource.addColumn("f", "auto_trust_ind", String.class);
        hBaseTableSource.addColumn("f", "apl_permit", String.class);
        hBaseTableSource.addColumn("f", "ems_version", String.class);
        hBaseTableSource.addColumn("f", "inserted_by", String.class);
        hBaseTableSource.addColumn("f", "updated_by", String.class);
        hBaseTableSource.addColumn("f", "insert_time", String.class);
        hBaseTableSource.addColumn("f", "update_time", String.class);
        hBaseTableSource.addColumn("f", "insert_timestamp", String.class);
        hBaseTableSource.addColumn("f", "update_timestamp", String.class);
        hBaseTableSource.addColumn("f", "liability_state_cause", String.class);
        hBaseTableSource.addColumn("f", "liability_state_date", String.class);
        hBaseTableSource.addColumn("f", "annuitant_type", String.class);
        hBaseTableSource.addColumn("f", "channel_staff_code", String.class);
        hBaseTableSource.addColumn("f", "channel_type", String.class);
        hBaseTableSource.addColumn("f", "language_id", String.class);
        hBaseTableSource.addColumn("f", "channel_org_id", String.class);
        hBaseTableSource.addColumn("f", "std_bene_indi_dth", String.class);
        hBaseTableSource.addColumn("f", "std_bene_indi_life", String.class);
        hBaseTableSource.addColumn("f", "group_policy_id", String.class);
        hBaseTableSource.addColumn("f", "service_agent_tel", String.class);
        hBaseTableSource.addColumn("f", "service_bank", String.class);
        hBaseTableSource.addColumn("f", "service_bank_branch", String.class);
        hBaseTableSource.addColumn("f", "service_handler", String.class);
        hBaseTableSource.addColumn("f", "bill_checked", String.class);
        hBaseTableSource.addColumn("f", "legal_bene", String.class);
        hBaseTableSource.addColumn("f", "wsm_contract_id", String.class);
        hBaseTableSource.addColumn("f", "autoapl_indi", String.class);
        hBaseTableSource.addColumn("f", "service_handler_code", String.class);
        hBaseTableSource.addColumn("f", "service_company", String.class);
        hBaseTableSource.addColumn("f", "service_company_branch", String.class);
        hBaseTableSource.addColumn("f", "orphan_policy", String.class);
        hBaseTableSource.addColumn("f", "orphan_status", String.class);
        hBaseTableSource.addColumn("f", "orphan_assign_date", String.class);
        hBaseTableSource.addColumn("f", "orphan_type", String.class);
        hBaseTableSource.addColumn("f", "is_complicated_policy", String.class);
        hBaseTableSource.addColumn("f", "star_name", String.class);
        hBaseTableSource.addColumn("f", "star_certi_code", String.class);
        hBaseTableSource.addColumn("f", "is_agent_submit", String.class);
        hBaseTableSource.addColumn("f", "is_ag_pay", String.class);
        hBaseTableSource.addColumn("f", "is_debitoverrun", String.class);
        hBaseTableSource.addColumn("f", "is_over_time", String.class);
        hBaseTableSource.addColumn("f", "issue_organ", String.class);


        tableEnv.registerFunction("lookup_policy_id", hBaseTableSource.getLookupFunction(new String[]{"policy_id"}));
    }
}
