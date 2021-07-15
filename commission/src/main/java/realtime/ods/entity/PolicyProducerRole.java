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
    public String role_id;
    public String policy_id;
    public String item_id;
    public String producer_role;
    public String producer_id;
    public String producer_position;
    public String active_indi;
    public String assign_rate;
    public String start_date;
    public String end_date;
    public String hierarchy_date;
    public String change_id;
    public String policy_chg_id;
    public String change_type;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String change_comment;
    public String pre_change_id;
}
