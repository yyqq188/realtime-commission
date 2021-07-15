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
    public String item_id;
    public String due_date;
    public String policy_year;
    public String policy_period;
    public String strgy_due_date;
    public String prem_status;
    public String sa_due_date;
    public String ems_version;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String policy_id;
    public String billing_date;
    public String reminder_date;
    public String indx_due_date;
    public String indx_reject;
}
