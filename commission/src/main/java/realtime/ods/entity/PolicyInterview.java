package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:30
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyInterview implements Serializable {
    public String list_id;
    public String switch_list_id;
    public String policy_id;
    public String policy_code;
    public String benefit_code;
    public String interview_type;
    public String next_due_date;
    public String lapse_date;
    public String csr;
    public String interview_status;
    public String interview_time;
    public String syn_status;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String case_status;
    public String case_processing_time;
    public String interview_case;
    public String interview_cause;
    public String interview_detail;
    public String interview_way;
    public String interview_way_real;
    public String agent_star_level;
}
