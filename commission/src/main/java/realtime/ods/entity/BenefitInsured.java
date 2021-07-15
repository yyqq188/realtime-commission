package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午3:30
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BenefitInsured  implements Serializable {

    public String list_id;
    public String item_id;
    public String insured_id;
    public String entry_age;
    public String entry_age_month;
    public String policy_id;
    public String order_id;
    public String ems_version;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String inserted_by;
    public String updated_by;
    public String job_class;
}
