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
    private String policy_id;
    private String dispatch_date;
    private String branch_receive_date;
    private String dc_collect_date;
    private String return_reason;
    private String return_desc;
    private String acknowledge_date;
    private String nondeliver_reason;
    private String nondeliver_desc;
    private String nondeliver_begin_date;
    private String nondeliver_end_date;
    private String reminder_date;
    private String operator_id;
    private String update_time;
    private String inserted_by;
    private String inserted_timestamp;
    private String updated_by;
    private String updated_timestamp;
    private String disp_date_updated_time;
    private String is_same_with_ph;
    private String ack_way;
}
