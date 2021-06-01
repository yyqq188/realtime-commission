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
    private String policy_id;
    private String policy_mark;
    private String is_os_input;
    private String freelook_period;
    private String contract_id;
    private String is_mep;
    private String rec_agent;
    private String is_open_red;
    private String product_plan_id;
    private String is_back_data;
    private String operation_terminal;
    private String sum_amount;
    private String split_commission_indi;
    private String is_os_input_print;
    private String cancel_print_date;
    private String closed_status;
    private String closed_time;
    private String reopen_time;
    private String is_force_mark;
    private String is_double_record;
    private String trans_fapiao_flag;
    private String need_advance_inforce;
    private String real_lapse_date;
    private String policy_print_type;
    private String is_stick_reason;
    private String back_desc;
    private String is_stick_reason_bak;
    private String policysign_province;
    private String policysign_city;
    private String is_need_uw;
    private String auto_uw_decision;
    private String is_related_trans;
    private String related_trans_add_time;
    private String plan_number;
    private String agent_star_level;
    private String has_medi_record;
    private String auto_proposal;
    private String apply_area;
    private String sf_licensed_no;
    private String is_trust;
    private String reinsu_upgrade_flag;
    private String reinsu_source_policy_code;
    private String interview_way;
    private String back_reg_declare;
    private String pre_withdraw_date;
    private String service_type;
    private String allot_stytle;
    private String supervision_persion;
    private String renew_persion;
    private String lock_state;
    private String lock_startdate;
    private String lock_enddate;
    private String lock_reason;
    private String operator;
    private String service_persion;
    private String oldservice_type;
    private String stchangedate;
    private String bank_private;
    private String insurance_source;
    private String is_pre_reg;
    private String prem_col_date;
    private String policy_place;
}
