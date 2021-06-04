package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午3:26
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractBene {
    public String list_id;
    public String party_id;
    public String policy_id;
    public String insurant;
    public String bene_type;
    public String share_order;
    public String share_rate;
    public String designation;
    public String legal_bene;
    public String address_id;
    public String telephone;
    public String mobile_tel;
    public String active_status;
    public String ems_version;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String irrevocable_indi;
    public String is_same_address;
    public String job_company;
    public String work_content;
    public String usual_address;
    public String income_source;
    public String is_long_term;
    public String marriage_id;
    public String certi_type;
    public String certi_code;
    public String is_personal_tax_status;
//    public String expiry_date;
}
