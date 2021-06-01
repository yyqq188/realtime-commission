package realtime.ods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: yhl
 * time: 2021/5/27 下午3:22
 * company: gientech
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    private String customer_id;
    private String gender;
    private String birthday;
    private String certi_type;
    private String certi_code;
    private String marriage_id;
    private String education_id;
    private String job_com;
    private String height;
    private String weight;
    private String email;
    private String income;
    private String job_1;
    private String job_2;
    private String job_cate_id;
    private String nationality;
    private String job_kind;
    private String title;
    private String smoking;
    private String insert_time;
    private String status;
    private String death_time;
    private String job_cate_id_2;
    private String bp;
    private String driving_licence;
    private String ss_code;
    private String retired;
    private String lang_id;
    private String homeplace;
    private String nation_code;
    private String accident_status;
    private String update_time;
    private String householder;
    private String honor_title;
    private String cust_grade;
    private String ori_certi_code;
    private String focus_type;
    private String employed;
    private String emp_id;
    private String country_code;
    private String blacklist_cause;
    private String email_2;
    private String address_id;
    private String mobile;
    private String office_tel;
    private String home_tel;
    private String first_name;
    private String mid_name;
    private String last_name;
    private String alias_name;
    private String industry_id;
    private String religion_code;
    private String data_level;
    private String suspend;
    private String suspend_chg_id;
    private String office_tel_ext;
    private String fax;
    private String insured_status;
    private String pr_indi;
    private String claim_indi;
    private String em_value;
    private String medi_claim_indi;
    private String is_econnect_user;
    private String cpf_account_no;
    private String vip_indi;
    private String special_tag_1;
    private String bankruptcy_order_no;
    private String bankruptcy_order_date;
    private String bankruptcy_status;
    private String discharge_date;
    private String bumi_indi;
    private String update_status_date;
    private String operator_id;
    private String operator_dept_id;
    private String merged_id;
    private String birthday_valid;
    private String proof_age;
    private String email1_use_indi;
    private String email2_use_indi;
    private String previous_id_number;
    private String child_count;
    private String easi_cash_indi;
    private String alive_status;
    private String recorder_id;
    private String updater_id;
    private String blacklist_code;
    private String insert_timestamp;
    private String update_timestamp;
    private String inserted_by;
    private String updated_by;
    private String other_income_indi;
    private String full_name;
    private String income_source;
    private String job_company;
    private String political_id;
    private String is_cc_copy;
    private String expiry_date;
    private String is_sms;
    private String risk_class;
    private String comments;
    private String family_income;
    private String live_place;
    private String is_foreign;
    private String is_false_paper;
    private String false_paper_remark;
    private String is_refuse_surey;
    private String refuse_surey_remark;
    private String remark;
    private String social_security;
    private String employee_id;
    private String feature_code;
    private String work_content;
    private String usual_address;
    private String resident_type;
    private String is_personal_tax_status;
    private String is_long_term;
    private String is_same_address1;
    private String area_code;
    private String is_high_value;
    private String complaint_mark;
    private String is_fraud;
    private String mobile2;
}
