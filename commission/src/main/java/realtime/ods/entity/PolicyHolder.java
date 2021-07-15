package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:28
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyHolder implements Serializable {
    public String policy_id;
    public String dispatch_date;
    public String branch_receive_date;
    public String dc_collect_date;
    public String return_reason;
    public String return_desc;
    public String acknowledge_date;
    public String nondeliver_reason;
    public String nondeliver_desc;
    public String nondeliver_begin_date;
    public String nondeliver_end_date;
    public String reminder_date;
    public String operator_id;
    public String update_time;
    public String inserted_by;
    public String inserted_timestamp;
    public String updated_by;
    public String updated_timestamp;
    public String disp_date_updated_time;
    public String is_same_with_ph;
    public String ack_way;
}
