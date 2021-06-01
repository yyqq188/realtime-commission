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
    private String policy_chg_id;
    private String policy_id;
    private String service_id;
    private String change_record;
    private String insert_time;
    private String validate_time;
    private String need_underwrite;
    private String apply_time;
    private String change_cause;
    private String cancel_id;
    private String cancel_time;
    private String rejecter_id;
    private String reject_time;
    private String reject_note;
    private String update_time;
    private String master_chg_id;
    private String cancel_cause;
    private String cancel_note;
    private String reject_cause;
    private String last_handler_id;
    private String last_entry_time;
    private String last_uw_disp_id;
    private String last_uw_disp_time;
    private String order_id;
    private String policy_chg_status;
    private String dispatch_emp;
    private String letter_effect_type;
    private String dispatch_type;
    private String dispatch_letter;
    private String sub_service_id;
    private String change_note;
    private String ri_processed;
    private String inserted_by;
    private String inserted_timestamp;
    private String updated_by;
    private String updated_timestamp;
    private String pre_policy_chg;
    private String change_seq;
    private String finish_time;
    private String org_id;
    private String request_effect_date;
    private String task_due_date;
    private String item_opened;
    private String reg_time;
    private String source_type;
}

