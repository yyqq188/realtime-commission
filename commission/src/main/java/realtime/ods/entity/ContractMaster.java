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
    public String policy_id;
    public String policy_code;
    public String apply_code;
    public String policy_type;
    public String head_id;
    public String branch_id;
    public String organ_id;
    public String over_manage;
    public String overdue_manage;
    public String apply_date;
    public String validate_date;
    public String expiry_date;
    public String liability_state;
    public String suspend;
    public String suspend_cause;
    public String end_cause;
    public String derivation;
    public String former_id;
    public String initial_vali_date;
    public String campaign_code;
    public String money_id;
    public String submission_date;
    public String advance_prem_indi;
    public String entity_fund_indi;
    public String spouse_child_indi;
    public String submit_channel;
    public String introducer_no;
    public String vesting_indi;
    public String suspend_chg_id;
    public String fut_child_indi;
    public String assignment_type;
    public String cpf_policy;
    public String servi_tax_indi;
    public String issue_date;
    public String lapse_cause;
    public String trust_policy_indi;
    public String policy_section;
    public String p_lapse_date;
    public String pj_lapse_date;
    public String misc_debt;
    public String discount_type;
    public String service_agent;
    public String bereavement_indi;
    public String risk_backdating_indi;
    public String reg_date;
    public String holiday_indi;
    public String prem_collect_indi;
    public String foreign_pol_indi;
    public String ri_processed;
    public String misc_debt_pld;
    public String inforcing_date;
    public String apilp_maximum_limit;
    public String apilp_desc;
    public String auto_trust_ind;
    public String apl_permit;
    public String ems_version;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String liability_state_cause;
    public String liability_state_date;
    public String annuitant_type;
    public String channel_staff_code;
    public String channel_type;
    public String language_id;
    public String channel_org_id;
    public String std_bene_indi_dth;
    public String std_bene_indi_life;
    public String group_policy_id;
    public String service_agent_tel;
    public String service_bank;
    public String service_bank_branch;
    public String service_handler;
    public String bill_checked;
    public String legal_bene;
    public String wsm_contract_id;
    public String autoapl_indi;
    public String service_handler_code;
    public String service_company;
    public String service_company_branch;
    public String orphan_policy;
    public String orphan_status;
    public String orphan_assign_date;
    public String orphan_type;
    public String is_complicated_policy;
    public String star_name;
    public String star_certi_code;
    public String is_agent_submit;
    public String is_ag_pay;
    public String is_debitoverrun;
    public String is_over_time;
    public String issue_organ;
}
