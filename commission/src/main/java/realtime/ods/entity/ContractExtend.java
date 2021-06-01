package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午4:15
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractExtend implements Serializable {
    private String item_id;
    private String due_date;
    private String policy_year;
    private String policy_period;
    private String strgy_due_date;
    private String prem_status;
    private String sa_due_date;
    private String ems_version;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String policy_id;
    private String billing_date;
    private String reminder_date;
    private String indx_due_date;
    private String indx_reject;
}
