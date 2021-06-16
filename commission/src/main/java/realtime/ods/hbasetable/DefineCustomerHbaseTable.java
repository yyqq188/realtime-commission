package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
//import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 13:51
 */
public class DefineCustomerHbaseTable {
    public static void defineCustomer(StreamTableEnvironment tableEnv, Configuration conf){
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_customer");

        hBaseTableSource.setRowKey("customer_id",String.class);

        hBaseTableSource.addColumn("f","gender",String.class);
        hBaseTableSource.addColumn("f","birthday",String.class);
        hBaseTableSource.addColumn("f","certi_type",String.class);
        hBaseTableSource.addColumn("f","certi_code",String.class);
        hBaseTableSource.addColumn("f","marriage_id",String.class);
        hBaseTableSource.addColumn("f","education_id",String.class);
        hBaseTableSource.addColumn("f","job_com",String.class);
        hBaseTableSource.addColumn("f","height",String.class);
        hBaseTableSource.addColumn("f","weight",String.class);
        hBaseTableSource.addColumn("f","email",String.class);
        hBaseTableSource.addColumn("f","income",String.class);
        hBaseTableSource.addColumn("f","job_1",String.class);
        hBaseTableSource.addColumn("f","job_2",String.class);
        hBaseTableSource.addColumn("f","job_cate_id",String.class);
        hBaseTableSource.addColumn("f","nationality",String.class);
        hBaseTableSource.addColumn("f","job_kind",String.class);
        hBaseTableSource.addColumn("f","title",String.class);
        hBaseTableSource.addColumn("f","smoking",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","status",String.class);
        hBaseTableSource.addColumn("f","death_time",String.class);
        hBaseTableSource.addColumn("f","job_cate_id_2",String.class);
        hBaseTableSource.addColumn("f","bp",String.class);
        hBaseTableSource.addColumn("f","driving_licence",String.class);
        hBaseTableSource.addColumn("f","ss_code",String.class);
        hBaseTableSource.addColumn("f","retired",String.class);
        hBaseTableSource.addColumn("f","lang_id",String.class);
        hBaseTableSource.addColumn("f","homeplace",String.class);
        hBaseTableSource.addColumn("f","nation_code",String.class);
        hBaseTableSource.addColumn("f","accident_status",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","householder",String.class);
        hBaseTableSource.addColumn("f","honor_title",String.class);
        hBaseTableSource.addColumn("f","cust_grade",String.class);
        hBaseTableSource.addColumn("f","ori_certi_code",String.class);
        hBaseTableSource.addColumn("f","focus_type",String.class);
        hBaseTableSource.addColumn("f","employed",String.class);
        hBaseTableSource.addColumn("f","emp_id",String.class);
        hBaseTableSource.addColumn("f","country_code",String.class);
        hBaseTableSource.addColumn("f","blacklist_cause",String.class);
        hBaseTableSource.addColumn("f","email_2",String.class);
        hBaseTableSource.addColumn("f","address_id",String.class);
        hBaseTableSource.addColumn("f","mobile",String.class);
        hBaseTableSource.addColumn("f","office_tel",String.class);
        hBaseTableSource.addColumn("f","home_tel",String.class);
        hBaseTableSource.addColumn("f","first_name",String.class);
        hBaseTableSource.addColumn("f","mid_name",String.class);
        hBaseTableSource.addColumn("f","last_name",String.class);
        hBaseTableSource.addColumn("f","alias_name",String.class);
        hBaseTableSource.addColumn("f","industry_id",String.class);
        hBaseTableSource.addColumn("f","religion_code",String.class);
        hBaseTableSource.addColumn("f","data_level",String.class);
        hBaseTableSource.addColumn("f","suspend",String.class);
        hBaseTableSource.addColumn("f","suspend_chg_id",String.class);
        hBaseTableSource.addColumn("f","office_tel_ext",String.class);
        hBaseTableSource.addColumn("f","fax",String.class);
        hBaseTableSource.addColumn("f","insured_status",String.class);
        hBaseTableSource.addColumn("f","pr_indi",String.class);
        hBaseTableSource.addColumn("f","claim_indi",String.class);
        hBaseTableSource.addColumn("f","em_value",String.class);
        hBaseTableSource.addColumn("f","medi_claim_indi",String.class);
        hBaseTableSource.addColumn("f","is_econnect_user",String.class);
        hBaseTableSource.addColumn("f","cpf_account_no",String.class);
        hBaseTableSource.addColumn("f","vip_indi",String.class);
        hBaseTableSource.addColumn("f","special_tag_1",String.class);
        hBaseTableSource.addColumn("f","bankruptcy_order_no",String.class);
        hBaseTableSource.addColumn("f","bankruptcy_order_date",String.class);
        hBaseTableSource.addColumn("f","bankruptcy_status",String.class);
        hBaseTableSource.addColumn("f","discharge_date",String.class);
        hBaseTableSource.addColumn("f","bumi_indi",String.class);
        hBaseTableSource.addColumn("f","update_status_date",String.class);
        hBaseTableSource.addColumn("f","operator_id",String.class);
        hBaseTableSource.addColumn("f","operator_dept_id",String.class);
        hBaseTableSource.addColumn("f","merged_id",String.class);
        hBaseTableSource.addColumn("f","birthday_valid",String.class);
        hBaseTableSource.addColumn("f","proof_age",String.class);
        hBaseTableSource.addColumn("f","email1_use_indi",String.class);
        hBaseTableSource.addColumn("f","email2_use_indi",String.class);
        hBaseTableSource.addColumn("f","previous_id_number",String.class);
        hBaseTableSource.addColumn("f","child_count",String.class);
        hBaseTableSource.addColumn("f","easi_cash_indi",String.class);
        hBaseTableSource.addColumn("f","alive_status",String.class);
        hBaseTableSource.addColumn("f","recorder_id",String.class);
        hBaseTableSource.addColumn("f","updater_id",String.class);
        hBaseTableSource.addColumn("f","blacklist_code",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","other_income_indi",String.class);
        hBaseTableSource.addColumn("f","full_name",String.class);
        hBaseTableSource.addColumn("f","income_source",String.class);
        hBaseTableSource.addColumn("f","job_company",String.class);
        hBaseTableSource.addColumn("f","political_id",String.class);
        hBaseTableSource.addColumn("f","is_cc_copy",String.class);
        hBaseTableSource.addColumn("f","expiry_date",String.class);
        hBaseTableSource.addColumn("f","is_sms",String.class);
        hBaseTableSource.addColumn("f","risk_class",String.class);
        hBaseTableSource.addColumn("f","comments",String.class);
        hBaseTableSource.addColumn("f","family_income",String.class);
        hBaseTableSource.addColumn("f","live_place",String.class);
        hBaseTableSource.addColumn("f","is_foreign",String.class);
        hBaseTableSource.addColumn("f","is_false_paper",String.class);
        hBaseTableSource.addColumn("f","false_paper_remark",String.class);
        hBaseTableSource.addColumn("f","is_refuse_surey",String.class);
        hBaseTableSource.addColumn("f","refuse_surey_remark",String.class);
        hBaseTableSource.addColumn("f","remark",String.class);
        hBaseTableSource.addColumn("f","social_security",String.class);
        hBaseTableSource.addColumn("f","employee_id",String.class);
        hBaseTableSource.addColumn("f","feature_code",String.class);
        hBaseTableSource.addColumn("f","work_content",String.class);
        hBaseTableSource.addColumn("f","usual_address",String.class);
        hBaseTableSource.addColumn("f","resident_type",String.class);
        hBaseTableSource.addColumn("f","is_personal_tax_status",String.class);
        hBaseTableSource.addColumn("f","is_long_term",String.class);
        hBaseTableSource.addColumn("f","is_same_address1",String.class);
        hBaseTableSource.addColumn("f","area_code",String.class);
        hBaseTableSource.addColumn("f","is_high_value",String.class);
        hBaseTableSource.addColumn("f","complaint_mark",String.class);
        hBaseTableSource.addColumn("f","is_fraud",String.class);
        hBaseTableSource.addColumn("f","mobile2",String.class);

        tableEnv.registerFunction("t_lookup_customer_id",hBaseTableSource.getLookupFunction(new String[]{"customer_id"}));
}}
