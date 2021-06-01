package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午3:33
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractProduct implements Serializable {
    private String item_id;
    private String master_id;
    private String policy_id;
    private String product_id;
    private String amount;
    private String unit;
    private String apply_date;
    private String expiry_date;
    private String validate_date;
    private String paidup_date;
    private String liability_state;
    private String end_cause;
    private String initial_type;
    private String renewal_type;
    private String charge_period;
    private String charge_year;
    private String coverage_period;
    private String coverage_year;
    private String short_end_time;
    private String except_value;
    private String benefit_level;
    private String insured_category;
    private String decision_id;
    private String suspend;
    private String suspend_cause;
    private String pay_mode;
    private String expiry_cash_value;
    private String count_way;
    private String renew_decision;
    private String bonus_sa;
    private String pay_next;
    private String origin_sa;
    private String origin_bonus_sa;
    private String anni_balance;
    private String fix_increment;
    private String cpf_cost;
    private String cash_cost;
    private String derivation;
    private String risk_code;
    private String exposure_rate;
    private String reins_rate;
    private String next_amount;
    private String waiver_start;
    private String waiver_end;
    private String auto_permnt_lapse;
    private String permnt_lapse_notice_date;
    private String master_product;
    private String waiver;
    private String waived_sa;
    private String issue_agent;
    private String strategy_code;
    private String loan_type;
    private String ben_period_type;
    private String benefit_period;
    private String gurnt_start_date;
    private String gurnt_perd_type;
    private String gurnt_period;
    private String invest_horizon;
    private String manual_sa;
    private String defer_period;
    private String sa_factor;
    private String std_prem_bf;
    private String discnt_prem_bf;
    private String discnted_prem_bf;
    private String policy_fee_bf;
    private String extra_prem_bf;
    private String std_prem_af;
    private String discnt_prem_af;
    private String policy_fee_af;
    private String gross_prem_af;
    private String extra_prem_af;
    private String total_prem_af;
    private String std_prem_an;
    private String discnt_prem_an;
    private String discnted_prem_an;
    private String policy_fee_an;
    private String extra_prem_an;
    private String next_std_prem_bf;
    private String next_discnt_prem_bf;
    private String next_discnted_prem_bf;
    private String next_policy_fee_bf;
    private String next_extra_prem_bf;
    private String next_std_prem_af;
    private String next_discnt_prem_af;
    private String next_discnted_prem_af;
    private String next_policy_fee_af;
    private String next_gross_prem_af;
    private String next_extra_prem_af;
    private String next_total_prem_af;
    private String next_std_prem_an;
    private String next_discnt_prem_an;
    private String next_discnted_prem_an;
    private String next_policy_fee_an;
    private String next_extra_prem_an;
    private String wait_period;
    private String waiv_anul_benefit;
    private String waiv_anul_prem;
    private String suspend_chg_id;
    private String lapse_cause;
    private String prem_change_time;
    private String submission_date;
    private String discnted_prem_af;
    private String policy_prem_source;
    private String ilp_calc_sa;
    private String actual_validate;
    private String entity_fund;
    private String car_reg_no;
    private String manu_surr_value;
    private String p_lapse_date;
    private String next_count_way;
    private String next_unit;
    private String initial_vali_date;
    private String age_increase_indi;
    private String paidup_option;
    private String last_statement_date;
    private String insur_prem_af;
    private String insur_prem_an;
    private String next_insur_prem_af;
    private String next_insur_prem_an;
    private String origin_product_id;
    private String car_reg_no_start;
    private String phd_period;
    private String pre_war_indi;
    private String waiver_claim_type;
    private String advantage_indi;
    private String issue_date;
    private String ri_processed;
    private String risk_commence_date;
    private String ems_version;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String liability_state_cause;
    private String liability_state_date;
    private String invest_scheme;
    private String tariff_type;
    private String indx_suspend_cause;
    private String indx_type;
    private String indx_calc_basis;
    private String indx_indi;
    private String cooling_off_option;
    private String postpone_period;
    private String next_benefit_level;
    private String travel_type;
    private String free_object;
    private String ismortgage;
    private String end_cause_desc;
    private String ph_ag_rela;
    private String ph_ag_reladesc;
    private String over_fl_cause;
    private String over_fl_causedesc;
    private String real_lapse_date;
    private String next_due_date;
    private String next_due_prem;
    private String uw_decision;
    private String claim_amount;
    private String is_pledge;
    private String uw_decision_channel;
    private String all_add_amout;
    private String all_add_prem;
}
