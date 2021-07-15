package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午3:27
 * company: gientech
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuredList implements Serializable {
    public String list_id;
    public String policy_id;
    public String party_id;
    public String medical_exam_indi;
    public String address_id;
    public String relation_to_ph;
    public String parent_sa;
    public String stand_life;
    public String ems_version;
    public String inserted_by;
    public String updated_by;
    public String insert_time;
    public String update_time;
    public String insert_timestamp;
    public String update_timestamp;
    public String insured_status;
    public String active_status;
    public String birth_date;
    public String em_value;
    public String gender;
    public String housekeeper;
    public String industry_type;
    public String live_range;
    public String move_range;
    public String job_cate_id;
    public String job_1;
    public String job_2;
    public String retired;
    public String smoking;
    public String mobile_tel;
    public String telephone;
    public String plan_id;
    public String insured_num;
    public String master_num;
    public String is_same_address;
    public String signature_file_name;
    public String agent_id_1;
    public String agent_id_2;
    public String new_policy_date;
    public String social_security;
    public String job_company;
    public String work_content;
    public String usual_address;
    public String income_source;
    public String is_long_term;
    public String is_personal_tax_status;
    public String marriage_id;
    public String is_same_address1;
    public String declaration_flag;
    public String health_questionnaire_no;
    public String risk_level;
    public String tooth_service_status;
    public String tooth_oper_status;
    public String flight_number;
    public String flight_time;
    public String certi_type;
    public String certi_code;
    public String expiry_date;
    public String is_pregnancy;
    public String mobile2;
    public String medical_exam_reason;
    public String medical_exam_reason_desc;
    public String financial_flag;
    public String experience_flag;
}
