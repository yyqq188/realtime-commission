package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
//import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 9:56
 */
public class DefineAgentHbaseTable {
    public static void defineAgent(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_agent");


        hBaseTableSource.setRowKey("agent_id",String.class);
        hBaseTableSource.addColumn("f","real_name",String.class);
        hBaseTableSource.addColumn("f","gender",String.class);
        hBaseTableSource.addColumn("f","birthday",String.class);
        hBaseTableSource.addColumn("f","certi_type",String.class);
        hBaseTableSource.addColumn("f","certi_code",String.class);
        hBaseTableSource.addColumn("f","agent_code",String.class);
        hBaseTableSource.addColumn("f","organ_id",String.class);
        hBaseTableSource.addColumn("f","head_id",String.class);
        hBaseTableSource.addColumn("f","branch_id",String.class);
        hBaseTableSource.addColumn("f","bp",String.class);
        hBaseTableSource.addColumn("f","email",String.class);
        hBaseTableSource.addColumn("f","agent_status",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","updater_id",String.class);
        hBaseTableSource.addColumn("f","address_id",String.class);
        hBaseTableSource.addColumn("f","comm_account_id",String.class);
        hBaseTableSource.addColumn("f","prem_account_id",String.class);
        hBaseTableSource.addColumn("f","agent_cate",String.class);
        hBaseTableSource.addColumn("f","agent_substatus",String.class);
        hBaseTableSource.addColumn("f","status_reason",String.class);
        hBaseTableSource.addColumn("f","email_2",String.class);
        hBaseTableSource.addColumn("f","office_tel",String.class);
        hBaseTableSource.addColumn("f","home_tel",String.class);
        hBaseTableSource.addColumn("f","mobile",String.class);
        hBaseTableSource.addColumn("f","appoinment_date",String.class);
        hBaseTableSource.addColumn("f","mail_box",String.class);
        hBaseTableSource.addColumn("f","special_group",String.class);
        hBaseTableSource.addColumn("f","title",String.class);
        hBaseTableSource.addColumn("f","nationality",String.class);
        hBaseTableSource.addColumn("f","marriage_id",String.class);
        hBaseTableSource.addColumn("f","lang_id",String.class);
        hBaseTableSource.addColumn("f","nation_code",String.class);
        hBaseTableSource.addColumn("f","bumi_indi",String.class);
        hBaseTableSource.addColumn("f","fax",String.class);
        hBaseTableSource.addColumn("f","alias_name",String.class);
        hBaseTableSource.addColumn("f","appointment_type",String.class);
        hBaseTableSource.addColumn("f","asu_type",String.class);
        hBaseTableSource.addColumn("f","agent_grade",String.class);
        hBaseTableSource.addColumn("f","status_date",String.class);
        hBaseTableSource.addColumn("f","substatus_date",String.class);
        hBaseTableSource.addColumn("f","agent_pt_indi",String.class);
        hBaseTableSource.addColumn("f","hrchy_lvl",String.class);
        hBaseTableSource.addColumn("f","hrchy_eff_date",String.class);
        hBaseTableSource.addColumn("f","unfavorable_indi",String.class);
        hBaseTableSource.addColumn("f","green_passport",String.class);
        hBaseTableSource.addColumn("f","reenter_flag",String.class);
        hBaseTableSource.addColumn("f","init_agent_grade",String.class);
        hBaseTableSource.addColumn("f","enter_company_date",String.class);
        hBaseTableSource.addColumn("f","leave_company_date",String.class);
        hBaseTableSource.addColumn("f","probation_date",String.class);
        hBaseTableSource.addColumn("f","turn_date",String.class);
        hBaseTableSource.addColumn("f","sign_date",String.class);
        hBaseTableSource.addColumn("f","sign_end_date",String.class);
        hBaseTableSource.addColumn("f","recommender_id",String.class);
        hBaseTableSource.addColumn("f","trainer_id",String.class);
        hBaseTableSource.addColumn("f","ind_trainer_id",String.class);
        hBaseTableSource.addColumn("f","dept_trainer_id",String.class);
        hBaseTableSource.addColumn("f","ind_dept_trainer_id",String.class);
        hBaseTableSource.addColumn("f","dept_train_date",String.class);
        hBaseTableSource.addColumn("f","group_trainer_id",String.class);
        hBaseTableSource.addColumn("f","ind_group_trainer_id",String.class);
        hBaseTableSource.addColumn("f","group_train_date",String.class);
        hBaseTableSource.addColumn("f","area_trainer_id",String.class);
        hBaseTableSource.addColumn("f","area_train_date",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","education_id",String.class);
        hBaseTableSource.addColumn("f","school",String.class);
        hBaseTableSource.addColumn("f","major",String.class);
        hBaseTableSource.addColumn("f","degree_id",String.class);
        hBaseTableSource.addColumn("f","language_level_id",String.class);
        hBaseTableSource.addColumn("f","spouse_id",String.class);
        hBaseTableSource.addColumn("f","special_favor",String.class);
        hBaseTableSource.addColumn("f","computer_level",String.class);
        hBaseTableSource.addColumn("f","begin_job_date",String.class);
        hBaseTableSource.addColumn("f","old_job_id",String.class);
        hBaseTableSource.addColumn("f","old_job_company",String.class);
        hBaseTableSource.addColumn("f","senior_agent",String.class);
        hBaseTableSource.addColumn("f","company_agent",String.class);
        hBaseTableSource.addColumn("f","direct_appointment",String.class);
        hBaseTableSource.addColumn("f","agreement_date",String.class);
        hBaseTableSource.addColumn("f","qualification_certi_code",String.class);
        hBaseTableSource.addColumn("f","practice_certi_code",String.class);
        hBaseTableSource.addColumn("f","invest_certi_code",String.class);
        hBaseTableSource.addColumn("f","holdback_indi",String.class);
        hBaseTableSource.addColumn("f","holdback_period",String.class);
        hBaseTableSource.addColumn("f","holdback_rate",String.class);
        hBaseTableSource.addColumn("f","payment_mode",String.class);
        hBaseTableSource.addColumn("f","payment_period",String.class);
        hBaseTableSource.addColumn("f","bank_branch_code",String.class);
        hBaseTableSource.addColumn("f","party_id",String.class);
        hBaseTableSource.addColumn("f","recorder_id",String.class);
        hBaseTableSource.addColumn("f","channel_org_id",String.class);
        hBaseTableSource.addColumn("f","physical_location",String.class);
        hBaseTableSource.addColumn("f","other_income_indi",String.class);
        hBaseTableSource.addColumn("f","job_nature_id",String.class);
        hBaseTableSource.addColumn("f","position_date",String.class);
        hBaseTableSource.addColumn("f","teminate_date",String.class);
        hBaseTableSource.addColumn("f","native_place",String.class);
        hBaseTableSource.addColumn("f","hukou",String.class);
        hBaseTableSource.addColumn("f","quality_level",String.class);
        hBaseTableSource.addColumn("f","need_calc_comm",String.class);
        hBaseTableSource.addColumn("f","manual_adjust_indi",String.class);
        hBaseTableSource.addColumn("f","greenlane_indi",String.class);
        hBaseTableSource.addColumn("f","blacklist_indi",String.class);
        hBaseTableSource.addColumn("f","max_bonus_months",String.class);
        hBaseTableSource.addColumn("f","staff_code",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","margin_fee",String.class);
        hBaseTableSource.addColumn("f","margin_fee_status",String.class);
        hBaseTableSource.addColumn("f","account_id",String.class);
        hBaseTableSource.addColumn("f","officer_leader",String.class);
        hBaseTableSource.addColumn("f","is_end_authorize",String.class);
        hBaseTableSource.addColumn("f","cca_agent_id",String.class);
        hBaseTableSource.addColumn("f","turn_division_type",String.class);
        hBaseTableSource.addColumn("f","agent_type",String.class);
        hBaseTableSource.addColumn("f","tax_deductions",String.class);
        hBaseTableSource.addColumn("f","effect_type",String.class);
        hBaseTableSource.addColumn("f","is_turn_division",String.class);
        hBaseTableSource.addColumn("f","prepare_agent",String.class);
        hBaseTableSource.addColumn("f","agent_sleeve",String.class);
        hBaseTableSource.addColumn("f","recruit_mark",String.class);
        hBaseTableSource.addColumn("f","feature_code",String.class);
        hBaseTableSource.addColumn("f","is_elite",String.class);
        hBaseTableSource.addColumn("f","topgun_flag",String.class);
        hBaseTableSource.addColumn("f","is_agent_qualified",String.class);
        hBaseTableSource.addColumn("f","contract_agent_control",String.class);
        hBaseTableSource.addColumn("f","escrow_code",String.class);

//        tableEnv.registerFunction("lookup_agent_id",hBaseTableSource.getLookupFunction(new String[]{"agent_id"}));
        tableEnv.createTemporarySystemFunction("lookup_agent_id",hBaseTableSource.getLookupFunction(new String[]{"agent_id"}));

    }
}
