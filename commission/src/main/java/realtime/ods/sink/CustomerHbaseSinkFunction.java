package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.Customer;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 13:56
 */
public class CustomerHbaseSinkFunction extends AbstractHbaseSinkFunction<Customer> {
    public CustomerHbaseSinkFunction() {
        tableName = "Customer";
    }

    @Override
    public void handle(Customer value, Context context, HTable table) throws Exception {

        Put put = new Put(Bytes.toBytes(value.getCustomer_id()));
        put.addColumn(cf, Bytes.toBytes("gender"), Bytes.toBytes(value.getGender()));
        put.addColumn(cf, Bytes.toBytes("birthday"), Bytes.toBytes(value.getBirthday()));
        put.addColumn(cf, Bytes.toBytes("certi_type"), Bytes.toBytes(value.getCerti_type()));
        put.addColumn(cf, Bytes.toBytes("certi_code"), Bytes.toBytes(value.getCerti_code()));
        put.addColumn(cf, Bytes.toBytes("marriage_id"), Bytes.toBytes(value.getMarriage_id()));
        put.addColumn(cf, Bytes.toBytes("education_id"), Bytes.toBytes(value.getEducation_id()));
        put.addColumn(cf, Bytes.toBytes("job_com"), Bytes.toBytes(value.getJob_com()));
        put.addColumn(cf, Bytes.toBytes("height"), Bytes.toBytes(value.getHeight()));
        put.addColumn(cf, Bytes.toBytes("weight"), Bytes.toBytes(value.getWeight()));
        put.addColumn(cf, Bytes.toBytes("email"), Bytes.toBytes(value.getEmail()));
        put.addColumn(cf, Bytes.toBytes("income"), Bytes.toBytes(value.getIncome()));
        put.addColumn(cf, Bytes.toBytes("job_1"), Bytes.toBytes(value.getJob_1()));
        put.addColumn(cf, Bytes.toBytes("job_2"), Bytes.toBytes(value.getJob_2()));
        put.addColumn(cf, Bytes.toBytes("job_cate_id"), Bytes.toBytes(value.getJob_cate_id()));
        put.addColumn(cf, Bytes.toBytes("nationality"), Bytes.toBytes(value.getNationality()));
        put.addColumn(cf, Bytes.toBytes("job_kind"), Bytes.toBytes(value.getJob_kind()));
        put.addColumn(cf, Bytes.toBytes("title"), Bytes.toBytes(value.getTitle()));
        put.addColumn(cf, Bytes.toBytes("smoking"), Bytes.toBytes(value.getSmoking()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("status"), Bytes.toBytes(value.getStatus()));
        put.addColumn(cf, Bytes.toBytes("death_time"), Bytes.toBytes(value.getDeath_time()));
        put.addColumn(cf, Bytes.toBytes("job_cate_id_2"), Bytes.toBytes(value.getJob_cate_id_2()));
        put.addColumn(cf, Bytes.toBytes("bp"), Bytes.toBytes(value.getBp()));
        put.addColumn(cf, Bytes.toBytes("driving_licence"), Bytes.toBytes(value.getDriving_licence()));
        put.addColumn(cf, Bytes.toBytes("ss_code"), Bytes.toBytes(value.getSs_code()));
        put.addColumn(cf, Bytes.toBytes("retired"), Bytes.toBytes(value.getRetired()));
        put.addColumn(cf, Bytes.toBytes("lang_id"), Bytes.toBytes(value.getLang_id()));
        put.addColumn(cf, Bytes.toBytes("homeplace"), Bytes.toBytes(value.getHomeplace()));
        put.addColumn(cf, Bytes.toBytes("nation_code"), Bytes.toBytes(value.getNation_code()));
        put.addColumn(cf, Bytes.toBytes("accident_status"), Bytes.toBytes(value.getAccident_status()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("householder"), Bytes.toBytes(value.getHouseholder()));
        put.addColumn(cf, Bytes.toBytes("honor_title"), Bytes.toBytes(value.getHonor_title()));
        put.addColumn(cf, Bytes.toBytes("cust_grade"), Bytes.toBytes(value.getCust_grade()));
        put.addColumn(cf, Bytes.toBytes("ori_certi_code"), Bytes.toBytes(value.getOri_certi_code()));
        put.addColumn(cf, Bytes.toBytes("focus_type"), Bytes.toBytes(value.getFocus_type()));
        put.addColumn(cf, Bytes.toBytes("employed"), Bytes.toBytes(value.getEmployed()));
        put.addColumn(cf, Bytes.toBytes("emp_id"), Bytes.toBytes(value.getEmp_id()));
        put.addColumn(cf, Bytes.toBytes("country_code"), Bytes.toBytes(value.getCountry_code()));
        put.addColumn(cf, Bytes.toBytes("blacklist_cause"), Bytes.toBytes(value.getBlacklist_cause()));
        put.addColumn(cf, Bytes.toBytes("email_2"), Bytes.toBytes(value.getEmail_2()));
        put.addColumn(cf, Bytes.toBytes("address_id"), Bytes.toBytes(value.getAddress_id()));
        put.addColumn(cf, Bytes.toBytes("mobile"), Bytes.toBytes(value.getMobile()));
        put.addColumn(cf, Bytes.toBytes("office_tel"), Bytes.toBytes(value.getOffice_tel()));
        put.addColumn(cf, Bytes.toBytes("home_tel"), Bytes.toBytes(value.getHome_tel()));
        put.addColumn(cf, Bytes.toBytes("first_name"), Bytes.toBytes(value.getFirst_name()));
        put.addColumn(cf, Bytes.toBytes("mid_name"), Bytes.toBytes(value.getMid_name()));
        put.addColumn(cf, Bytes.toBytes("last_name"), Bytes.toBytes(value.getLast_name()));
        put.addColumn(cf, Bytes.toBytes("alias_name"), Bytes.toBytes(value.getAlias_name()));
        put.addColumn(cf, Bytes.toBytes("industry_id"), Bytes.toBytes(value.getIndustry_id()));
        put.addColumn(cf, Bytes.toBytes("religion_code"), Bytes.toBytes(value.getReligion_code()));
        put.addColumn(cf, Bytes.toBytes("data_level"), Bytes.toBytes(value.getData_level()));
        put.addColumn(cf, Bytes.toBytes("suspend"), Bytes.toBytes(value.getSuspend()));
        put.addColumn(cf, Bytes.toBytes("suspend_chg_id"), Bytes.toBytes(value.getSuspend_chg_id()));
        put.addColumn(cf, Bytes.toBytes("office_tel_ext"), Bytes.toBytes(value.getOffice_tel_ext()));
        put.addColumn(cf, Bytes.toBytes("fax"), Bytes.toBytes(value.getFax()));
        put.addColumn(cf, Bytes.toBytes("insured_status"), Bytes.toBytes(value.getInsured_status()));
        put.addColumn(cf, Bytes.toBytes("pr_indi"), Bytes.toBytes(value.getPr_indi()));
        put.addColumn(cf, Bytes.toBytes("claim_indi"), Bytes.toBytes(value.getClaim_indi()));
        put.addColumn(cf, Bytes.toBytes("em_value"), Bytes.toBytes(value.getEm_value()));
        put.addColumn(cf, Bytes.toBytes("medi_claim_indi"), Bytes.toBytes(value.getMedi_claim_indi()));
        put.addColumn(cf, Bytes.toBytes("is_econnect_user"), Bytes.toBytes(value.getIs_econnect_user()));
        put.addColumn(cf, Bytes.toBytes("cpf_account_no"), Bytes.toBytes(value.getCpf_account_no()));
        put.addColumn(cf, Bytes.toBytes("vip_indi"), Bytes.toBytes(value.getVip_indi()));
        put.addColumn(cf, Bytes.toBytes("special_tag_1"), Bytes.toBytes(value.getSpecial_tag_1()));
        put.addColumn(cf, Bytes.toBytes("bankruptcy_order_no"), Bytes.toBytes(value.getBankruptcy_order_no()));
        put.addColumn(cf, Bytes.toBytes("bankruptcy_order_date"), Bytes.toBytes(value.getBankruptcy_order_date()));
        put.addColumn(cf, Bytes.toBytes("bankruptcy_status"), Bytes.toBytes(value.getBankruptcy_status()));
        put.addColumn(cf, Bytes.toBytes("discharge_date"), Bytes.toBytes(value.getDischarge_date()));
        put.addColumn(cf, Bytes.toBytes("bumi_indi"), Bytes.toBytes(value.getBumi_indi()));
        put.addColumn(cf, Bytes.toBytes("update_status_date"), Bytes.toBytes(value.getUpdate_status_date()));
        put.addColumn(cf, Bytes.toBytes("operator_id"), Bytes.toBytes(value.getOperator_id()));
        put.addColumn(cf, Bytes.toBytes("operator_dept_id"), Bytes.toBytes(value.getOperator_dept_id()));
        put.addColumn(cf, Bytes.toBytes("merged_id"), Bytes.toBytes(value.getMerged_id()));
        put.addColumn(cf, Bytes.toBytes("birthday_valid"), Bytes.toBytes(value.getBirthday_valid()));
        put.addColumn(cf, Bytes.toBytes("proof_age"), Bytes.toBytes(value.getProof_age()));
        put.addColumn(cf, Bytes.toBytes("email1_use_indi"), Bytes.toBytes(value.getEmail1_use_indi()));
        put.addColumn(cf, Bytes.toBytes("email2_use_indi"), Bytes.toBytes(value.getEmail2_use_indi()));
        put.addColumn(cf, Bytes.toBytes("previous_id_number"), Bytes.toBytes(value.getPrevious_id_number()));
        put.addColumn(cf, Bytes.toBytes("child_count"), Bytes.toBytes(value.getChild_count()));
        put.addColumn(cf, Bytes.toBytes("easi_cash_indi"), Bytes.toBytes(value.getEasi_cash_indi()));
        put.addColumn(cf, Bytes.toBytes("alive_status"), Bytes.toBytes(value.getAlive_status()));
        put.addColumn(cf, Bytes.toBytes("recorder_id"), Bytes.toBytes(value.getRecorder_id()));
        put.addColumn(cf, Bytes.toBytes("updater_id"), Bytes.toBytes(value.getUpdater_id()));
        put.addColumn(cf, Bytes.toBytes("blacklist_code"), Bytes.toBytes(value.getBlacklist_code()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("other_income_indi"), Bytes.toBytes(value.getOther_income_indi()));
        put.addColumn(cf, Bytes.toBytes("full_name"), Bytes.toBytes(value.getFull_name()));
        put.addColumn(cf, Bytes.toBytes("income_source"), Bytes.toBytes(value.getIncome_source()));
        put.addColumn(cf, Bytes.toBytes("job_company"), Bytes.toBytes(value.getJob_company()));
        put.addColumn(cf, Bytes.toBytes("political_id"), Bytes.toBytes(value.getPolitical_id()));
        put.addColumn(cf, Bytes.toBytes("is_cc_copy"), Bytes.toBytes(value.getIs_cc_copy()));
        put.addColumn(cf, Bytes.toBytes("expiry_date"), Bytes.toBytes(value.getExpiry_date()));
        put.addColumn(cf, Bytes.toBytes("is_sms"), Bytes.toBytes(value.getIs_sms()));
        put.addColumn(cf, Bytes.toBytes("risk_class"), Bytes.toBytes(value.getRisk_class()));
        put.addColumn(cf, Bytes.toBytes("comments"), Bytes.toBytes(value.getComments()));
        put.addColumn(cf, Bytes.toBytes("family_income"), Bytes.toBytes(value.getFamily_income()));
        put.addColumn(cf, Bytes.toBytes("live_place"), Bytes.toBytes(value.getLive_place()));
        put.addColumn(cf, Bytes.toBytes("is_foreign"), Bytes.toBytes(value.getIs_foreign()));
        put.addColumn(cf, Bytes.toBytes("is_false_paper"), Bytes.toBytes(value.getIs_false_paper()));
        put.addColumn(cf, Bytes.toBytes("false_paper_remark"), Bytes.toBytes(value.getFalse_paper_remark()));
        put.addColumn(cf, Bytes.toBytes("is_refuse_surey"), Bytes.toBytes(value.getIs_refuse_surey()));
        put.addColumn(cf, Bytes.toBytes("refuse_surey_remark"), Bytes.toBytes(value.getRefuse_surey_remark()));
        put.addColumn(cf, Bytes.toBytes("remark"), Bytes.toBytes(value.getRemark()));
        put.addColumn(cf, Bytes.toBytes("social_security"), Bytes.toBytes(value.getSocial_security()));
        put.addColumn(cf, Bytes.toBytes("employee_id"), Bytes.toBytes(value.getEmployee_id()));
        put.addColumn(cf, Bytes.toBytes("feature_code"), Bytes.toBytes(value.getFeature_code()));
        put.addColumn(cf, Bytes.toBytes("work_content"), Bytes.toBytes(value.getWork_content()));
        put.addColumn(cf, Bytes.toBytes("usual_address"), Bytes.toBytes(value.getUsual_address()));
        put.addColumn(cf, Bytes.toBytes("resident_type"), Bytes.toBytes(value.getResident_type()));
        put.addColumn(cf, Bytes.toBytes("is_personal_tax_status"), Bytes.toBytes(value.getIs_personal_tax_status()));
        put.addColumn(cf, Bytes.toBytes("is_long_term"), Bytes.toBytes(value.getIs_long_term()));
        put.addColumn(cf, Bytes.toBytes("is_same_address1"), Bytes.toBytes(value.getIs_same_address1()));
        put.addColumn(cf, Bytes.toBytes("area_code"), Bytes.toBytes(value.getArea_code()));
        put.addColumn(cf, Bytes.toBytes("is_high_value"), Bytes.toBytes(value.getIs_high_value()));
        put.addColumn(cf, Bytes.toBytes("complaint_mark"), Bytes.toBytes(value.getComplaint_mark()));
        put.addColumn(cf, Bytes.toBytes("is_fraud"), Bytes.toBytes(value.getIs_fraud()));
        put.addColumn(cf, Bytes.toBytes("mobile2"), Bytes.toBytes(value.getMobile2()));


        table.put(put);
    }
}
