package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.Agent;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 10:37
 */
public class AgentHbaseSinkFunction extends AbstractHbaseSinkFunction<Agent> {
    public AgentHbaseSinkFunction() {
        tableName = "t_agent";
    }

    @Override
    public void handle(Agent value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getAgent_id()));

        put.addColumn(cf, Bytes.toBytes("real_name"), Bytes.toBytes(value.getReal_name()));
        put.addColumn(cf, Bytes.toBytes("gender"), Bytes.toBytes(value.getGender()));
        put.addColumn(cf, Bytes.toBytes("birthday"), Bytes.toBytes(value.getBirthday()));
        put.addColumn(cf, Bytes.toBytes("certi_type"), Bytes.toBytes(value.getCerti_type()));
        put.addColumn(cf, Bytes.toBytes("certi_code"), Bytes.toBytes(value.getCerti_code()));
        put.addColumn(cf, Bytes.toBytes("agent_code"), Bytes.toBytes(value.getAgent_code()));
        put.addColumn(cf, Bytes.toBytes("organ_id"), Bytes.toBytes(value.getOrgan_id()));
        put.addColumn(cf, Bytes.toBytes("head_id"), Bytes.toBytes(value.getHead_id()));
        put.addColumn(cf, Bytes.toBytes("branch_id"), Bytes.toBytes(value.getBranch_id()));
        put.addColumn(cf, Bytes.toBytes("bp"), Bytes.toBytes(value.getBp()));
        put.addColumn(cf, Bytes.toBytes("email"), Bytes.toBytes(value.getEmail()));
        put.addColumn(cf, Bytes.toBytes("agent_status"), Bytes.toBytes(value.getAgent_status()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("updater_id"), Bytes.toBytes(value.getUpdater_id()));
        put.addColumn(cf, Bytes.toBytes("address_id"), Bytes.toBytes(value.getAddress_id()));
        put.addColumn(cf, Bytes.toBytes("comm_account_id"), Bytes.toBytes(value.getComm_account_id()));
        put.addColumn(cf, Bytes.toBytes("prem_account_id"), Bytes.toBytes(value.getPrem_account_id()));
        put.addColumn(cf, Bytes.toBytes("agent_cate"), Bytes.toBytes(value.getAgent_cate()));
        put.addColumn(cf, Bytes.toBytes("agent_substatus"), Bytes.toBytes(value.getAgent_substatus()));
        put.addColumn(cf, Bytes.toBytes("status_reason"), Bytes.toBytes(value.getStatus_reason()));
        put.addColumn(cf, Bytes.toBytes("email_2"), Bytes.toBytes(value.getEmail_2()));
        put.addColumn(cf, Bytes.toBytes("office_tel"), Bytes.toBytes(value.getOffice_tel()));
        put.addColumn(cf, Bytes.toBytes("home_tel"), Bytes.toBytes(value.getHome_tel()));
        put.addColumn(cf, Bytes.toBytes("mobile"), Bytes.toBytes(value.getMobile()));
        put.addColumn(cf, Bytes.toBytes("appoinment_date"), Bytes.toBytes(value.getAppoinment_date()));
        put.addColumn(cf, Bytes.toBytes("mail_box"), Bytes.toBytes(value.getMail_box()));
        put.addColumn(cf, Bytes.toBytes("special_group"), Bytes.toBytes(value.getSpecial_group()));
        put.addColumn(cf, Bytes.toBytes("title"), Bytes.toBytes(value.getTitle()));
        put.addColumn(cf, Bytes.toBytes("nationality"), Bytes.toBytes(value.getNationality()));
        put.addColumn(cf, Bytes.toBytes("marriage_id"), Bytes.toBytes(value.getMarriage_id()));
        put.addColumn(cf, Bytes.toBytes("lang_id"), Bytes.toBytes(value.getLang_id()));
        put.addColumn(cf, Bytes.toBytes("nation_code"), Bytes.toBytes(value.getNation_code()));
        put.addColumn(cf, Bytes.toBytes("bumi_indi"), Bytes.toBytes(value.getBumi_indi()));
        put.addColumn(cf, Bytes.toBytes("fax"), Bytes.toBytes(value.getFax()));
        put.addColumn(cf, Bytes.toBytes("alias_name"), Bytes.toBytes(value.getAlias_name()));
        put.addColumn(cf, Bytes.toBytes("appointment_type"), Bytes.toBytes(value.getAppointment_type()));
        put.addColumn(cf, Bytes.toBytes("asu_type"), Bytes.toBytes(value.getAsu_type()));
        put.addColumn(cf, Bytes.toBytes("agent_grade"), Bytes.toBytes(value.getAgent_grade()));
        put.addColumn(cf, Bytes.toBytes("status_date"), Bytes.toBytes(value.getStatus_date()));
        put.addColumn(cf, Bytes.toBytes("substatus_date"), Bytes.toBytes(value.getSubstatus_date()));
        put.addColumn(cf, Bytes.toBytes("agent_pt_indi"), Bytes.toBytes(value.getAgent_pt_indi()));
        put.addColumn(cf, Bytes.toBytes("hrchy_lvl"), Bytes.toBytes(value.getHrchy_lvl()));
        put.addColumn(cf, Bytes.toBytes("hrchy_eff_date"), Bytes.toBytes(value.getHrchy_eff_date()));
        put.addColumn(cf, Bytes.toBytes("unfavorable_indi"), Bytes.toBytes(value.getUnfavorable_indi()));
        put.addColumn(cf, Bytes.toBytes("green_passport"), Bytes.toBytes(value.getGreen_passport()));
        put.addColumn(cf, Bytes.toBytes("reenter_flag"), Bytes.toBytes(value.getReenter_flag()));
        put.addColumn(cf, Bytes.toBytes("init_agent_grade"), Bytes.toBytes(value.getInit_agent_grade()));
        put.addColumn(cf, Bytes.toBytes("enter_company_date"), Bytes.toBytes(value.getEnter_company_date()));
        put.addColumn(cf, Bytes.toBytes("leave_company_date"), Bytes.toBytes(value.getLeave_company_date()));
        put.addColumn(cf, Bytes.toBytes("probation_date"), Bytes.toBytes(value.getProbation_date()));
        put.addColumn(cf, Bytes.toBytes("turn_date"), Bytes.toBytes(value.getTurn_date()));
        put.addColumn(cf, Bytes.toBytes("sign_date"), Bytes.toBytes(value.getSign_date()));
        put.addColumn(cf, Bytes.toBytes("sign_end_date"), Bytes.toBytes(value.getSign_end_date()));
        put.addColumn(cf, Bytes.toBytes("recommender_id"), Bytes.toBytes(value.getRecommender_id()));
        put.addColumn(cf, Bytes.toBytes("trainer_id"), Bytes.toBytes(value.getTrainer_id()));
        put.addColumn(cf, Bytes.toBytes("ind_trainer_id"), Bytes.toBytes(value.getInd_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("dept_trainer_id"), Bytes.toBytes(value.getDept_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("ind_dept_trainer_id"), Bytes.toBytes(value.getInd_dept_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("dept_train_date"), Bytes.toBytes(value.getDept_train_date()));
        put.addColumn(cf, Bytes.toBytes("group_trainer_id"), Bytes.toBytes(value.getGroup_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("ind_group_trainer_id"), Bytes.toBytes(value.getInd_group_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("group_train_date"), Bytes.toBytes(value.getGroup_train_date()));
        put.addColumn(cf, Bytes.toBytes("area_trainer_id"), Bytes.toBytes(value.getArea_trainer_id()));
        put.addColumn(cf, Bytes.toBytes("area_train_date"), Bytes.toBytes(value.getArea_train_date()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("education_id"), Bytes.toBytes(value.getEducation_id()));
        put.addColumn(cf, Bytes.toBytes("school"), Bytes.toBytes(value.getSchool()));
        put.addColumn(cf, Bytes.toBytes("major"), Bytes.toBytes(value.getMajor()));
        put.addColumn(cf, Bytes.toBytes("degree_id"), Bytes.toBytes(value.getDegree_id()));
        put.addColumn(cf, Bytes.toBytes("language_level_id"), Bytes.toBytes(value.getLanguage_level_id()));
        put.addColumn(cf, Bytes.toBytes("spouse_id"), Bytes.toBytes(value.getSpouse_id()));
        put.addColumn(cf, Bytes.toBytes("special_favor"), Bytes.toBytes(value.getSpecial_favor()));
        put.addColumn(cf, Bytes.toBytes("computer_level"), Bytes.toBytes(value.getComputer_level()));
        put.addColumn(cf, Bytes.toBytes("begin_job_date"), Bytes.toBytes(value.getBegin_job_date()));
        put.addColumn(cf, Bytes.toBytes("old_job_id"), Bytes.toBytes(value.getOld_job_id()));
        put.addColumn(cf, Bytes.toBytes("old_job_company"), Bytes.toBytes(value.getOld_job_company()));
        put.addColumn(cf, Bytes.toBytes("senior_agent"), Bytes.toBytes(value.getSenior_agent()));
        put.addColumn(cf, Bytes.toBytes("company_agent"), Bytes.toBytes(value.getCompany_agent()));
        put.addColumn(cf, Bytes.toBytes("direct_appointment"), Bytes.toBytes(value.getDirect_appointment()));
        put.addColumn(cf, Bytes.toBytes("agreement_date"), Bytes.toBytes(value.getAgreement_date()));
        put.addColumn(cf, Bytes.toBytes("qualification_certi_code"), Bytes.toBytes(value.getQualification_certi_code()));
        put.addColumn(cf, Bytes.toBytes("practice_certi_code"), Bytes.toBytes(value.getPractice_certi_code()));
        put.addColumn(cf, Bytes.toBytes("invest_certi_code"), Bytes.toBytes(value.getInvest_certi_code()));
        put.addColumn(cf, Bytes.toBytes("holdback_indi"), Bytes.toBytes(value.getHoldback_indi()));
        put.addColumn(cf, Bytes.toBytes("holdback_period"), Bytes.toBytes(value.getHoldback_period()));
        put.addColumn(cf, Bytes.toBytes("holdback_rate"), Bytes.toBytes(value.getHoldback_rate()));
        put.addColumn(cf, Bytes.toBytes("payment_mode"), Bytes.toBytes(value.getPayment_mode()));
        put.addColumn(cf, Bytes.toBytes("payment_period"), Bytes.toBytes(value.getPayment_period()));
        put.addColumn(cf, Bytes.toBytes("bank_branch_code"), Bytes.toBytes(value.getBank_branch_code()));
        put.addColumn(cf, Bytes.toBytes("party_id"), Bytes.toBytes(value.getParty_id()));
        put.addColumn(cf, Bytes.toBytes("recorder_id"), Bytes.toBytes(value.getRecorder_id()));
        put.addColumn(cf, Bytes.toBytes("channel_org_id"), Bytes.toBytes(value.getChannel_org_id()));
        put.addColumn(cf, Bytes.toBytes("physical_location"), Bytes.toBytes(value.getPhysical_location()));
        put.addColumn(cf, Bytes.toBytes("other_income_indi"), Bytes.toBytes(value.getOther_income_indi()));
        put.addColumn(cf, Bytes.toBytes("job_nature_id"), Bytes.toBytes(value.getJob_nature_id()));
        put.addColumn(cf, Bytes.toBytes("position_date"), Bytes.toBytes(value.getPosition_date()));
        put.addColumn(cf, Bytes.toBytes("teminate_date"), Bytes.toBytes(value.getTeminate_date()));
        put.addColumn(cf, Bytes.toBytes("native_place"), Bytes.toBytes(value.getNative_place()));
        put.addColumn(cf, Bytes.toBytes("hukou"), Bytes.toBytes(value.getHukou()));
        put.addColumn(cf, Bytes.toBytes("quality_level"), Bytes.toBytes(value.getQuality_level()));
        put.addColumn(cf, Bytes.toBytes("need_calc_comm"), Bytes.toBytes(value.getNeed_calc_comm()));
        put.addColumn(cf, Bytes.toBytes("manual_adjust_indi"), Bytes.toBytes(value.getManual_adjust_indi()));
        put.addColumn(cf, Bytes.toBytes("greenlane_indi"), Bytes.toBytes(value.getGreenlane_indi()));
        put.addColumn(cf, Bytes.toBytes("blacklist_indi"), Bytes.toBytes(value.getBlacklist_indi()));
        put.addColumn(cf, Bytes.toBytes("max_bonus_months"), Bytes.toBytes(value.getMax_bonus_months()));
        put.addColumn(cf, Bytes.toBytes("staff_code"), Bytes.toBytes(value.getStaff_code()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("margin_fee"), Bytes.toBytes(value.getMargin_fee()));
        put.addColumn(cf, Bytes.toBytes("margin_fee_status"), Bytes.toBytes(value.getMargin_fee_status()));
        put.addColumn(cf, Bytes.toBytes("account_id"), Bytes.toBytes(value.getAccount_id()));
        put.addColumn(cf, Bytes.toBytes("officer_leader"), Bytes.toBytes(value.getOfficer_leader()));
        put.addColumn(cf, Bytes.toBytes("is_end_authorize"), Bytes.toBytes(value.getIs_end_authorize()));
        put.addColumn(cf, Bytes.toBytes("cca_agent_id"), Bytes.toBytes(value.getCca_agent_id()));
        put.addColumn(cf, Bytes.toBytes("turn_division_type"), Bytes.toBytes(value.getTurn_division_type()));
        put.addColumn(cf, Bytes.toBytes("agent_type"), Bytes.toBytes(value.getAgent_type()));
        put.addColumn(cf, Bytes.toBytes("tax_deductions"), Bytes.toBytes(value.getTax_deductions()));
        put.addColumn(cf, Bytes.toBytes("effect_type"), Bytes.toBytes(value.getEffect_type()));
        put.addColumn(cf, Bytes.toBytes("is_turn_division"), Bytes.toBytes(value.getIs_turn_division()));
        put.addColumn(cf, Bytes.toBytes("prepare_agent"), Bytes.toBytes(value.getPrepare_agent()));
        put.addColumn(cf, Bytes.toBytes("agent_sleeve"), Bytes.toBytes(value.getAgent_sleeve()));
        put.addColumn(cf, Bytes.toBytes("recruit_mark"), Bytes.toBytes(value.getRecruit_mark()));
        put.addColumn(cf, Bytes.toBytes("feature_code"), Bytes.toBytes(value.getFeature_code()));
        put.addColumn(cf, Bytes.toBytes("is_elite"), Bytes.toBytes(value.getIs_elite()));
        put.addColumn(cf, Bytes.toBytes("topgun_flag"), Bytes.toBytes(value.getTopgun_flag()));
        put.addColumn(cf, Bytes.toBytes("is_agent_qualified"), Bytes.toBytes(value.getIs_agent_qualified()));
        put.addColumn(cf, Bytes.toBytes("contract_agent_control"), Bytes.toBytes(value.getContract_agent_control()));
        put.addColumn(cf, Bytes.toBytes("escrow_code"), Bytes.toBytes(value.getEscrow_code()));

        table.put(put);
    }
}
