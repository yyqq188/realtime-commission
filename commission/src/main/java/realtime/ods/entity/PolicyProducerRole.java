package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:33
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyProducerRole implements Serializable {
    private String role_id;
    private String policy_id;
    private String item_id;
    private String producer_role;
    private String producer_id;
    private String producer_position;
    private String active_indi;
    private String assign_rate;
    private String start_date;
    private String end_date;
    private String hierarchy_date;
    private String change_id;
    private String policy_chg_id;
    private String change_type;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String change_comment;
    private String pre_change_id;
}
