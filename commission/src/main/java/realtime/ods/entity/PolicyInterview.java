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
    private String list_id;
    private String switch_list_id;
    private String policy_id;
    private String policy_code;
    private String benefit_code;
    private String interview_type;
    private String next_due_date;
    private String lapse_date;
    private String csr;
    private String interview_status;
    private String interview_time;
    private String syn_status;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String case_status;
    private String case_processing_time;
    private String interview_case;
    private String interview_cause;
    private String interview_detail;
    private String interview_way;
    private String interview_way_real;
    private String agent_star_level;
}
