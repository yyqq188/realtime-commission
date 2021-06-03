package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.InsuredList;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 14:11
 */
public class InsuredListHbaseSinkFunction extends AbstractHbaseSinkFunction<InsuredList> {
    public InsuredListHbaseSinkFunction() {
        tableName = "t_insured_list";
    }

    @Override
    public void handle(InsuredList value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getList_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("party_id"), Bytes.toBytes(value.getParty_id()));
        put.addColumn(cf, Bytes.toBytes("medical_exam_indi"), Bytes.toBytes(value.getMedical_exam_indi()));
        put.addColumn(cf, Bytes.toBytes("address_id"), Bytes.toBytes(value.getAddress_id()));
        put.addColumn(cf, Bytes.toBytes("relation_to_ph"), Bytes.toBytes(value.getRelation_to_ph()));
        put.addColumn(cf, Bytes.toBytes("parent_sa"), Bytes.toBytes(value.getParent_sa()));
        put.addColumn(cf, Bytes.toBytes("stand_life"), Bytes.toBytes(value.getStand_life()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("insured_status"), Bytes.toBytes(value.getInsured_status()));
        put.addColumn(cf, Bytes.toBytes("active_status"), Bytes.toBytes(value.getActive_status()));
        put.addColumn(cf, Bytes.toBytes("birth_date"), Bytes.toBytes(value.getBirth_date()));
        put.addColumn(cf, Bytes.toBytes("em_value"), Bytes.toBytes(value.getEm_value()));
        put.addColumn(cf, Bytes.toBytes("gender"), Bytes.toBytes(value.getGender()));
        put.addColumn(cf, Bytes.toBytes("housekeeper"), Bytes.toBytes(value.getHousekeeper()));
        put.addColumn(cf, Bytes.toBytes("industry_type"), Bytes.toBytes(value.getIndustry_type()));
        put.addColumn(cf, Bytes.toBytes("live_range"), Bytes.toBytes(value.getLive_range()));
        put.addColumn(cf, Bytes.toBytes("move_range"), Bytes.toBytes(value.getMove_range()));
        put.addColumn(cf, Bytes.toBytes("job_cate_id"), Bytes.toBytes(value.getJob_cate_id()));
        put.addColumn(cf, Bytes.toBytes("job_1"), Bytes.toBytes(value.getJob_1()));
        put.addColumn(cf, Bytes.toBytes("job_2"), Bytes.toBytes(value.getJob_2()));
        put.addColumn(cf, Bytes.toBytes("retired"), Bytes.toBytes(value.getRetired()));
        put.addColumn(cf, Bytes.toBytes("smoking"), Bytes.toBytes(value.getSmoking()));
        put.addColumn(cf, Bytes.toBytes("mobile_tel"), Bytes.toBytes(value.getMobile_tel()));
        put.addColumn(cf, Bytes.toBytes("telephone"), Bytes.toBytes(value.getTelephone()));
        put.addColumn(cf, Bytes.toBytes("plan_id"), Bytes.toBytes(value.getPlan_id()));
        put.addColumn(cf, Bytes.toBytes("insured_num"), Bytes.toBytes(value.getInsured_num()));
        put.addColumn(cf, Bytes.toBytes("master_num"), Bytes.toBytes(value.getMaster_num()));
        put.addColumn(cf, Bytes.toBytes("is_same_address"), Bytes.toBytes(value.getIs_same_address()));
        put.addColumn(cf, Bytes.toBytes("signature_file_name"), Bytes.toBytes(value.getSignature_file_name()));
        put.addColumn(cf, Bytes.toBytes("agent_id_1"), Bytes.toBytes(value.getAgent_id_1()));
        put.addColumn(cf, Bytes.toBytes("agent_id_2"), Bytes.toBytes(value.getAgent_id_2()));
        put.addColumn(cf, Bytes.toBytes("new_policy_date"), Bytes.toBytes(value.getNew_policy_date()));
        put.addColumn(cf, Bytes.toBytes("social_security"), Bytes.toBytes(value.getSocial_security()));
        put.addColumn(cf, Bytes.toBytes("job_company"), Bytes.toBytes(value.getJob_company()));
        put.addColumn(cf, Bytes.toBytes("work_content"), Bytes.toBytes(value.getWork_content()));
        put.addColumn(cf, Bytes.toBytes("usual_address"), Bytes.toBytes(value.getUsual_address()));
        put.addColumn(cf, Bytes.toBytes("income_source"), Bytes.toBytes(value.getIncome_source()));
        put.addColumn(cf, Bytes.toBytes("is_long_term"), Bytes.toBytes(value.getIs_long_term()));
        put.addColumn(cf, Bytes.toBytes("is_personal_tax_status"), Bytes.toBytes(value.getIs_personal_tax_status()));
        put.addColumn(cf, Bytes.toBytes("marriage_id"), Bytes.toBytes(value.getMarriage_id()));
        put.addColumn(cf, Bytes.toBytes("is_same_address1"), Bytes.toBytes(value.getIs_same_address1()));
        put.addColumn(cf, Bytes.toBytes("declaration_flag"), Bytes.toBytes(value.getDeclaration_flag()));
        put.addColumn(cf, Bytes.toBytes("health_questionnaire_no"), Bytes.toBytes(value.getHealth_questionnaire_no()));
        put.addColumn(cf, Bytes.toBytes("risk_level"), Bytes.toBytes(value.getRisk_level()));
        put.addColumn(cf, Bytes.toBytes("tooth_service_status"), Bytes.toBytes(value.getTooth_service_status()));
        put.addColumn(cf, Bytes.toBytes("tooth_oper_status"), Bytes.toBytes(value.getTooth_oper_status()));
        put.addColumn(cf, Bytes.toBytes("flight_number"), Bytes.toBytes(value.getFlight_number()));
        put.addColumn(cf, Bytes.toBytes("flight_time"), Bytes.toBytes(value.getFlight_time()));
        put.addColumn(cf, Bytes.toBytes("certi_type"), Bytes.toBytes(value.getCerti_type()));
        put.addColumn(cf, Bytes.toBytes("certi_code"), Bytes.toBytes(value.getCerti_code()));
        put.addColumn(cf, Bytes.toBytes("expiry_date"), Bytes.toBytes(value.getExpiry_date()));
        put.addColumn(cf, Bytes.toBytes("is_pregnancy"), Bytes.toBytes(value.getIs_pregnancy()));
        put.addColumn(cf, Bytes.toBytes("mobile2"), Bytes.toBytes(value.getMobile2()));
        put.addColumn(cf, Bytes.toBytes("medical_exam_reason"), Bytes.toBytes(value.getMedical_exam_reason()));
        put.addColumn(cf, Bytes.toBytes("medical_exam_reason_desc"), Bytes.toBytes(value.getMedical_exam_reason_desc()));
        put.addColumn(cf, Bytes.toBytes("financial_flag"), Bytes.toBytes(value.getFinancial_flag()));
        put.addColumn(cf, Bytes.toBytes("experience_flag"), Bytes.toBytes(value.getExperience_flag()));


        table.put(put);
    }
}
