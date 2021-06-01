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
    private String list_id;
    private String policy_id;
    private String party_id;
    private String medical_exam_indi;
    private String address_id;
    private String relation_to_ph;
    private String parent_sa;
    private String stand_life;
    private String ems_version;
    private String inserted_by;
    private String updated_by;
    private String insert_time;
    private String update_time;
    private String insert_timestamp;
    private String update_timestamp;
    private String insured_status;
    private String active_status;
    private String birth_date;
    private String em_value;
    private String gender;
    private String housekeeper;
    private String industry_type;
    private String live_range;
    private String move_range;
    private String job_cate_id;
    private String job_1;
    private String job_2;
    private String retired;
    private String smoking;
    private String mobile_tel;
    private String telephone;
    private String plan_id;
    private String insured_num;
    private String master_num;
    private String is_same_address;
    private String signature_file_name;
    private String agent_id_1;
    private String agent_id_2;
    private String new_policy_date;
    private String social_security;
    private String job_company;
    private String work_content;
    private String usual_address;
    private String income_source;
    private String is_long_term;
    private String is_personal_tax_status;
    private String marriage_id;
    private String is_same_address1;
    private String declaration_flag;
    private String health_questionnaire_no;
    private String risk_level;
    private String tooth_service_status;
    private String tooth_oper_status;
    private String flight_number;
    private String flight_time;
    private String certi_type;
    private String certi_code;
    private String expiry_date;
    private String is_pregnancy;
    private String mobile2;
    private String medical_exam_reason;
    private String medical_exam_reason_desc;
    private String financial_flag;
    private String experience_flag;
}
