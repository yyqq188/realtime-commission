package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 上午9:35
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyChange implements Serializable {
    public String policy_chg_id;
    public String policy_id;
    public String service_id;
    public String change_record;
    public String insert_time;
    public String validate_time;
    public String need_underwrite;
    public String apply_time;
    public String change_cause;
    public String cancel_id;
    public String cancel_time;
    public String rejecter_id;
    public String reject_time;
    public String reject_note;
    public String update_time;
    public String master_chg_id;
    public String cancel_cause;
    public String cancel_note;
    public String reject_cause;
    public String last_handler_id;
    public String last_entry_time;
    public String last_uw_disp_id;
    public String last_uw_disp_time;
    public String order_id;
    public String policy_chg_status;
    public String dispatch_emp;
    public String letter_effect_type;
    public String dispatch_type;
    public String dispatch_letter;
    public String sub_service_id;
    public String change_note;
    public String ri_processed;
    public String inserted_by;
    public String inserted_timestamp;
    public String updated_by;
    public String updated_timestamp;
    public String pre_policy_chg;
    public String change_seq;
    public String finish_time;
    public String org_id;
    public String request_effect_date;
    public String task_due_date;
    public String item_opened;
    public String reg_time;
    public String source_type;
}

