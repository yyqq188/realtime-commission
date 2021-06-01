package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:16
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractMaster implements Serializable {
    private String policy_id;
    private String policy_code;
    private String apply_code;
    private String policy_type;
    private String head_id;
    private String branch_id;
    private String organ_id;
    private String over_manage;
    private String overdue_manage;
    private String apply_date;
    private String validate_date;
    private String expiry_date;
    private String liability_state;
    private String suspend;
    private String suspend_cause;
    private String end_cause;
    private String derivation;
    private String former_id;
    private String initial_vali_date;
    private String campaign_code;
    private String money_id;
    private String submission_date;
    private String advance_prem_indi;
    private String entity_fund_indi;
    private String spouse_child_indi;
    private String submit_channel;
    private String introducer_no;
    private String vesting_indi;
    private String suspend_chg_id;
    private String fut_child_indi;
    private String assignment_type;
    private String cpf_policy;
    private String servi_tax_indi;
    private String issue_date;
    private String lapse_cause;
    private String trust_policy_indi;
    private String policy_section;
    private String p_lapse_date;
    private String pj_lapse_date;
    private String misc_debt;
    private String discount_type;
    private String service_agent;
    private String bereavement_indi;
    private String risk_backdating_indi;
    private String reg_date;
    private String holiday_indi;
    private String prem_collect_indi;
    private String foreign_pol_indi;
    private String ri_processed;
    private String misc_debt_pld;
    private String inforcing_date;
    private String apilp_maximum_limit;
    private String apilp_desc;
    private String auto_trust_ind;
    private String apl_permit;
    private String ems_version;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String liability_state_cause;
    private String liability_state_date;
    private String annuitant_type;
    private String channel_staff_code;
    private String channel_type;
    private String language_id;
    private String channel_org_id;
    private String std_bene_indi_dth;
    private String std_bene_indi_life;
    private String group_policy_id;
    private String service_agent_tel;
    private String service_bank;
    private String service_bank_branch;
    private String service_handler;
    private String bill_checked;
    private String legal_bene;
    private String wsm_contract_id;
    private String autoapl_indi;
    private String service_handler_code;
    private String service_company;
    private String service_company_branch;
    private String orphan_policy;
    private String orphan_status;
    private String orphan_assign_date;
    private String orphan_type;
    private String is_complicated_policy;
    private String star_name;
    private String star_certi_code;
    private String is_agent_submit;
    private String is_ag_pay;
    private String is_debitoverrun;
    private String is_over_time;
    private String issue_organ;
}
