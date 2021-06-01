package realtime.ods.demo;

import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.java.io.PojoCsvInputFormat;
import org.apache.flink.api.java.typeutils.PojoField;
import org.apache.flink.api.java.typeutils.PojoTypeInfo;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.FileProcessingMode;
import realtime.ods.entity.Agent;


import java.util.ArrayList;


/**
 * author: yhl
 * time: 2021/5/26 下午3:56
 * company: gientech
 *
 * 这里打算用readFile的方式来读取
 * todo 目前还不通
 */
public class File2Kafka {
//    public static void main(String[] args) throws Exception {
//
//        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
////        String path = File2Kafka.class.getClassLoader().getResource("T_AGENT_NEW.csv").getPath();
//
//        String path = File2Kafka.class.getClassLoader().getResource("test.csv").getPath();
//        Path filePath = new Path(path);
//        PojoField agent_id = new PojoField(Agent.class.getField("agent_id"), BasicTypeInfo.STRING_TYPE_INFO);
//
//        ArrayList<PojoField> fields = new ArrayList<>();
//        fields.add(agent_id);
//        PojoTypeInfo<Agent> agentPojoTypeInfo = new PojoTypeInfo<>(Agent.class, fields);
//
//        PojoCsvInputFormat<Agent> agentPojoCsvInputFormat = new PojoCsvInputFormat<>(filePath, agentPojoTypeInfo);
//
//        DataStreamSource<Agent> agentDataStreamSource = env.readFile(
//                agentPojoCsvInputFormat,
//                path,
//                FileProcessingMode.PROCESS_CONTINUOUSLY,
//                10000);
//
////        env.createInput()
//
//        agentDataStreamSource.map(data -> data.agent_id).print();
//        env.execute();
//        //        Path path = new File(resource.toURI()).toPath();
////        String[] fields = new String[]{"agent_id","real_name","gender","birthday","certi_type","certi_code","agent_code","organ_id","head_id","branch_id","bp","email","agent_status","update_time","updater_id","address_id","comm_account_id","prem_account_id","agent_cate","agent_substatus","status_reason","email_2","office_tel","home_tel","mobile","appoinment_date","mail_box","special_group","title","nationality","marriage_id","lang_id","nation_code","bumi_indi","fax","alias_name","appointment_type","asu_type","agent_grade","status_date","substatus_date","agent_pt_indi","hrchy_lvl","hrchy_eff_date","unfavorable_indi","green_passport","reenter_flag","init_agent_grade","enter_company_date","leave_company_date","probation_date","turn_date","sign_date","sign_end_date","recommender_id","trainer_id","ind_trainer_id","dept_trainer_id","ind_dept_trainer_id","dept_train_date","group_trainer_id","ind_group_trainer_id","group_train_date","area_trainer_id","area_train_date","insert_time","education_id","school","major","degree_id","language_level_id","spouse_id","special_favor","computer_level","begin_job_date","old_job_id","old_job_company","senior_agent","company_agent","direct_appointment","agreement_date","qualification_certi_code","practice_certi_code","invest_certi_code","holdback_indi","holdback_period","holdback_rate","payment_mode","payment_period","bank_branch_code","party_id","recorder_id","channel_org_id","physical_location","other_income_indi","job_nature_id","position_date","teminate_date","native_place","hukou","quality_level","need_calc_comm","manual_adjust_indi","greenlane_indi","blacklist_indi","max_bonus_months","staff_code","inserted_by","updated_by","insert_timestamp","update_timestamp","margin_fee","margin_fee_status","account_id","officer_leader","is_end_authorize","cca_agent_id","turn_division_type","agent_type","tax_deductions","effect_type","is_turn_division","prepare_agent","agent_sleeve","recruit_mark","feature_code","is_elite","topgun_flag","is_agent_qualified","contract_agent_controlescrow_code"};
////        PojoCsvInputFormat<Agent> agent =
//
//
//    }
}
