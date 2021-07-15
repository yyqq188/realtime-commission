package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:22
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractMasterOther implements Serializable {
    public String policy_id;
    public String policy_mark;
    public String is_os_input;
    public String freelook_period;
    public String contract_id;
    public String is_mep;
    public String rec_agent;
    public String is_open_red;
    public String product_plan_id;
    public String is_back_data;
    public String operation_terminal;
    public String sum_amount;
    public String split_commission_indi;
    public String is_os_input_print;
    public String cancel_print_date;
    public String closed_status;
    public String closed_time;
    public String reopen_time;
    public String is_force_mark;
    public String is_double_record;
    public String trans_fapiao_flag;
    public String need_advance_inforce;
    public String real_lapse_date;
    public String policy_print_type;
    public String is_stick_reason;
    public String back_desc;
    public String is_stick_reason_bak;
    public String policysign_province;
    public String policysign_city;
    public String is_need_uw;
    public String auto_uw_decision;
    public String is_related_trans;
    public String related_trans_add_time;
    public String plan_number;
    public String agent_star_level;
    public String has_medi_record;
    public String auto_proposal;
    public String apply_area;
    public String sf_licensed_no;
    public String is_trust;
    public String reinsu_upgrade_flag;
    public String reinsu_source_policy_code;
    public String interview_way;
    public String back_reg_declare;
    public String pre_withdraw_date;
    public String service_type;
    public String allot_stytle;
    public String supervision_persion;
    public String renew_persion;
    public String lock_state;
    public String lock_startdate;
    public String lock_enddate;
    public String lock_reason;
    public String operator;
    public String service_persion;
    public String oldservice_type;
    public String stchangedate;
    public String bank_public;
    public String insurance_source;
    public String is_pre_reg;
    public String prem_col_date;
    public String policy_place;
}
