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

    private String list_id;
    private String item_id;
    private String insured_id;
    private String entry_age;
    private String entry_age_month;
    private String policy_id;
    private String order_id;
    private String ems_version;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String inserted_by;
    private String updated_by;
    private String job_class;
}
