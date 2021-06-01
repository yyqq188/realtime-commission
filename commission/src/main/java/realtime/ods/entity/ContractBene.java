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
public class ContractBene implements Serializable {
    private String list_id;
    private String party_id;
    private String policy_id;
    private String insurant;
    private String bene_type;
    private String share_order;
    private String share_rate;
    private String designation;
    private String legal_bene;
    private String address_id;
    private String telephone;
    private String mobile_tel;
    private String active_status;
    private String ems_version;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String irrevocable_indi;
    private String is_same_address;
    private String job_company;
    private String work_content;
    private String usual_address;
    private String income_source;
    private String is_long_term;
    private String marriage_id;
    private String certi_type;
    private String certi_code;
    private String is_personal_tax_status;
    private String expiry_date;
}
