package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 14:07
 */
public class DefineInsuredListHbaseTable {

        public static void defineInsuredList(StreamTableEnvironment tableEnv, Configuration conf){
            HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_insured_list");

            hBaseTableSource.setRowKey("list_id",String.class);
            hBaseTableSource.addColumn("f","policy_id",String.class);
            hBaseTableSource.addColumn("f","party_id",String.class);
            hBaseTableSource.addColumn("f","medical_exam_indi",String.class);
            hBaseTableSource.addColumn("f","address_id",String.class);
            hBaseTableSource.addColumn("f","relation_to_ph",String.class);
            hBaseTableSource.addColumn("f","parent_sa",String.class);
            hBaseTableSource.addColumn("f","stand_life",String.class);
            hBaseTableSource.addColumn("f","ems_version",String.class);
            hBaseTableSource.addColumn("f","inserted_by",String.class);
            hBaseTableSource.addColumn("f","updated_by",String.class);
            hBaseTableSource.addColumn("f","insert_time",String.class);
            hBaseTableSource.addColumn("f","update_time",String.class);
            hBaseTableSource.addColumn("f","insert_timestamp",String.class);
            hBaseTableSource.addColumn("f","update_timestamp",String.class);
            hBaseTableSource.addColumn("f","insured_status",String.class);
            hBaseTableSource.addColumn("f","active_status",String.class);
            hBaseTableSource.addColumn("f","birth_date",String.class);
            hBaseTableSource.addColumn("f","em_value",String.class);
            hBaseTableSource.addColumn("f","gender",String.class);
            hBaseTableSource.addColumn("f","housekeeper",String.class);
            hBaseTableSource.addColumn("f","industry_type",String.class);
            hBaseTableSource.addColumn("f","live_range",String.class);
            hBaseTableSource.addColumn("f","move_range",String.class);
            hBaseTableSource.addColumn("f","job_cate_id",String.class);
            hBaseTableSource.addColumn("f","job_1",String.class);
            hBaseTableSource.addColumn("f","job_2",String.class);
            hBaseTableSource.addColumn("f","retired",String.class);
            hBaseTableSource.addColumn("f","smoking",String.class);
            hBaseTableSource.addColumn("f","mobile_tel",String.class);
            hBaseTableSource.addColumn("f","telephone",String.class);
            hBaseTableSource.addColumn("f","plan_id",String.class);
            hBaseTableSource.addColumn("f","insured_num",String.class);
            hBaseTableSource.addColumn("f","master_num",String.class);
            hBaseTableSource.addColumn("f","is_same_address",String.class);
            hBaseTableSource.addColumn("f","signature_file_name",String.class);
            hBaseTableSource.addColumn("f","agent_id_1",String.class);
            hBaseTableSource.addColumn("f","agent_id_2",String.class);
            hBaseTableSource.addColumn("f","new_policy_date",String.class);
            hBaseTableSource.addColumn("f","social_security",String.class);
            hBaseTableSource.addColumn("f","job_company",String.class);
            hBaseTableSource.addColumn("f","work_content",String.class);
            hBaseTableSource.addColumn("f","usual_address",String.class);
            hBaseTableSource.addColumn("f","income_source",String.class);
            hBaseTableSource.addColumn("f","is_long_term",String.class);
            hBaseTableSource.addColumn("f","is_personal_tax_status",String.class);
            hBaseTableSource.addColumn("f","marriage_id",String.class);
            hBaseTableSource.addColumn("f","is_same_address1",String.class);
            hBaseTableSource.addColumn("f","declaration_flag",String.class);
            hBaseTableSource.addColumn("f","health_questionnaire_no",String.class);
            hBaseTableSource.addColumn("f","risk_level",String.class);
            hBaseTableSource.addColumn("f","tooth_service_status",String.class);
            hBaseTableSource.addColumn("f","tooth_oper_status",String.class);
            hBaseTableSource.addColumn("f","flight_number",String.class);
            hBaseTableSource.addColumn("f","flight_time",String.class);
            hBaseTableSource.addColumn("f","certi_type",String.class);
            hBaseTableSource.addColumn("f","certi_code",String.class);
            hBaseTableSource.addColumn("f","expiry_date",String.class);
            hBaseTableSource.addColumn("f","is_pregnancy",String.class);
            hBaseTableSource.addColumn("f","mobile2",String.class);
            hBaseTableSource.addColumn("f","medical_exam_reason",String.class);
            hBaseTableSource.addColumn("f","medical_exam_reason_desc",String.class);
            hBaseTableSource.addColumn("f","financial_flag",String.class);
            hBaseTableSource.addColumn("f","experience_flag",String.class);


            tableEnv.registerFunction("t_lookup_list_id",hBaseTableSource.getLookupFunction(new String[]{"list_id"}));
}}
