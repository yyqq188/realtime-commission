package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ProductLife;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:54
 */
public class ProductLifeHbaseSinkFunction extends AbstractHbaseSinkFunction<ProductLife> {
    public ProductLifeHbaseSinkFunction() {
        tableName = "t_product_life";
    }

    @Override
    public void handle(ProductLife value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getOrgan_id()));
        put.addColumn(cf, Bytes.toBytes("product_id"), Bytes.toBytes(value.getProduct_id()));
        put.addColumn(cf, Bytes.toBytes("product_name"), Bytes.toBytes(value.getProduct_name()));
        put.addColumn(cf, Bytes.toBytes("product_abbr"), Bytes.toBytes(value.getProduct_abbr()));
        put.addColumn(cf, Bytes.toBytes("internal_id"), Bytes.toBytes(value.getInternal_id()));
        put.addColumn(cf, Bytes.toBytes("hospital_type"), Bytes.toBytes(value.getHospital_type()));
        put.addColumn(cf, Bytes.toBytes("unit_flag"), Bytes.toBytes(value.getUnit_flag()));
        put.addColumn(cf, Bytes.toBytes("ins_type"), Bytes.toBytes(value.getIns_type()));
        put.addColumn(cf, Bytes.toBytes("ally"), Bytes.toBytes(value.getAlly()));
        put.addColumn(cf, Bytes.toBytes("individual_group"), Bytes.toBytes(value.getIndividual_group()));
        put.addColumn(cf, Bytes.toBytes("value"), Bytes.toBytes(value.getValue()));
        put.addColumn(cf, Bytes.toBytes("exception"), Bytes.toBytes(value.getException()));
        put.addColumn(cf, Bytes.toBytes("start_date"), Bytes.toBytes(value.getStart_date()));
        put.addColumn(cf, Bytes.toBytes("end_date"), Bytes.toBytes(value.getEnd_date()));
        put.addColumn(cf, Bytes.toBytes("life_rate"), Bytes.toBytes(value.getLife_rate()));
        put.addColumn(cf, Bytes.toBytes("sudden_rate"), Bytes.toBytes(value.getSudden_rate()));
        put.addColumn(cf, Bytes.toBytes("ill_rate"), Bytes.toBytes(value.getIll_rate()));
        put.addColumn(cf, Bytes.toBytes("em"), Bytes.toBytes(value.getEm()));
        put.addColumn(cf, Bytes.toBytes("check_amount"), Bytes.toBytes(value.getCheck_amount()));
        put.addColumn(cf, Bytes.toBytes("renew"), Bytes.toBytes(value.getRenew()));
        put.addColumn(cf, Bytes.toBytes("pregnant_insured"), Bytes.toBytes(value.getPregnant_insured()));
        put.addColumn(cf, Bytes.toBytes("underwrite_class"), Bytes.toBytes(value.getUnderwrite_class()));
        put.addColumn(cf, Bytes.toBytes("attachable"), Bytes.toBytes(value.getAttachable()));
        put.addColumn(cf, Bytes.toBytes("insure_month"), Bytes.toBytes(value.getInsure_month()));
        put.addColumn(cf, Bytes.toBytes("duty"), Bytes.toBytes(value.getDuty()));
        put.addColumn(cf, Bytes.toBytes("benefit_type"), Bytes.toBytes(value.getBenefit_type()));
        put.addColumn(cf, Bytes.toBytes("target_type"), Bytes.toBytes(value.getTarget_type()));
        put.addColumn(cf, Bytes.toBytes("period_type"), Bytes.toBytes(value.getPeriod_type()));
        put.addColumn(cf, Bytes.toBytes("underwrite_job"), Bytes.toBytes(value.getUnderwrite_job()));
        put.addColumn(cf, Bytes.toBytes("surr_permit"), Bytes.toBytes(value.getSurr_permit()));
        put.addColumn(cf, Bytes.toBytes("add_permit"), Bytes.toBytes(value.getAdd_permit()));
        put.addColumn(cf, Bytes.toBytes("apl_permit"), Bytes.toBytes(value.getApl_permit()));
        put.addColumn(cf, Bytes.toBytes("loan_permit"), Bytes.toBytes(value.getLoan_permit()));
        put.addColumn(cf, Bytes.toBytes("actuary_rate"), Bytes.toBytes(value.getActuary_rate()));
        put.addColumn(cf, Bytes.toBytes("table_prem"), Bytes.toBytes(value.getTable_prem()));
        put.addColumn(cf, Bytes.toBytes("ss_claim_formula"), Bytes.toBytes(value.getSs_claim_formula()));
        put.addColumn(cf, Bytes.toBytes("reduce_paidup"), Bytes.toBytes(value.getReduce_paidup()));
        put.addColumn(cf, Bytes.toBytes("min_sur_amount"), Bytes.toBytes(value.getMin_sur_amount()));
        put.addColumn(cf, Bytes.toBytes("min_add_amount"), Bytes.toBytes(value.getMin_add_amount()));
        put.addColumn(cf, Bytes.toBytes("min_add_units"), Bytes.toBytes(value.getMin_add_units()));
        put.addColumn(cf, Bytes.toBytes("min_sur_units"), Bytes.toBytes(value.getMin_sur_units()));
        put.addColumn(cf, Bytes.toBytes("min_claim_amount"), Bytes.toBytes(value.getMin_claim_amount()));
        put.addColumn(cf, Bytes.toBytes("mortagage"), Bytes.toBytes(value.getMortagage()));
        put.addColumn(cf, Bytes.toBytes("initial_id"), Bytes.toBytes(value.getInitial_id()));
        put.addColumn(cf, Bytes.toBytes("section_cal_type"), Bytes.toBytes(value.getSection_cal_type()));
        put.addColumn(cf, Bytes.toBytes("period_cal_type"), Bytes.toBytes(value.getPeriod_cal_type()));
        put.addColumn(cf, Bytes.toBytes("age_base"), Bytes.toBytes(value.getAge_base()));
        put.addColumn(cf, Bytes.toBytes("bonus_cal_type"), Bytes.toBytes(value.getBonus_cal_type()));
        put.addColumn(cf, Bytes.toBytes("premium_define"), Bytes.toBytes(value.getPremium_define()));
        put.addColumn(cf, Bytes.toBytes("regu_to_single"), Bytes.toBytes(value.getRegu_to_single()));
        put.addColumn(cf, Bytes.toBytes("sa_accum"), Bytes.toBytes(value.getSa_accum()));
        put.addColumn(cf, Bytes.toBytes("universal_prem"), Bytes.toBytes(value.getUniversal_prem()));
        put.addColumn(cf, Bytes.toBytes("guarantee_renew"), Bytes.toBytes(value.getGuarantee_renew()));
        put.addColumn(cf, Bytes.toBytes("checked"), Bytes.toBytes(value.getChecked()));
        put.addColumn(cf, Bytes.toBytes("insert_person"), Bytes.toBytes(value.getInsert_person()));
        put.addColumn(cf, Bytes.toBytes("insert_date"), Bytes.toBytes(value.getInsert_date()));
        put.addColumn(cf, Bytes.toBytes("updater_id"), Bytes.toBytes(value.getUpdater_id()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("sys_lock_time"), Bytes.toBytes(value.getSys_lock_time()));
        put.addColumn(cf, Bytes.toBytes("sys_locker_id"), Bytes.toBytes(value.getSys_locker_id()));
        put.addColumn(cf, Bytes.toBytes("sys_lock_status"), Bytes.toBytes(value.getSys_lock_status()));
        put.addColumn(cf, Bytes.toBytes("pseudo"), Bytes.toBytes(value.getPseudo()));
        put.addColumn(cf, Bytes.toBytes("permit_prs"), Bytes.toBytes(value.getPermit_prs()));
        put.addColumn(cf, Bytes.toBytes("prs_unit_amount"), Bytes.toBytes(value.getPrs_unit_amount()));
        put.addColumn(cf, Bytes.toBytes("prs_formula"), Bytes.toBytes(value.getPrs_formula()));
        put.addColumn(cf, Bytes.toBytes("policyholder"), Bytes.toBytes(value.getPolicyholder()));
        put.addColumn(cf, Bytes.toBytes("prem_table"), Bytes.toBytes(value.getPrem_table()));
        put.addColumn(cf, Bytes.toBytes("related_type_prem2"), Bytes.toBytes(value.getRelated_type_prem2()));
        put.addColumn(cf, Bytes.toBytes("related_prem2"), Bytes.toBytes(value.getRelated_prem2()));
        put.addColumn(cf, Bytes.toBytes("fee_year_prem2"), Bytes.toBytes(value.getFee_year_prem2()));
        put.addColumn(cf, Bytes.toBytes("age_prem2"), Bytes.toBytes(value.getAge_prem2()));
        put.addColumn(cf, Bytes.toBytes("gender_prem2"), Bytes.toBytes(value.getGender_prem2()));
        put.addColumn(cf, Bytes.toBytes("comm_amount"), Bytes.toBytes(value.getComm_amount()));
        put.addColumn(cf, Bytes.toBytes("uw_manual"), Bytes.toBytes(value.getUw_manual()));
        put.addColumn(cf, Bytes.toBytes("base_money"), Bytes.toBytes(value.getBase_money()));
        put.addColumn(cf, Bytes.toBytes("gst_indicator"), Bytes.toBytes(value.getGst_indicator()));
        put.addColumn(cf, Bytes.toBytes("stamp_indicator"), Bytes.toBytes(value.getStamp_indicator()));
        put.addColumn(cf, Bytes.toBytes("plan_type"), Bytes.toBytes(value.getPlan_type()));
        put.addColumn(cf, Bytes.toBytes("grace_period"), Bytes.toBytes(value.getGrace_period()));
        put.addColumn(cf, Bytes.toBytes("grace_follow"), Bytes.toBytes(value.getGrace_follow()));
        put.addColumn(cf, Bytes.toBytes("age_method"), Bytes.toBytes(value.getAge_method()));
        put.addColumn(cf, Bytes.toBytes("rn_date_type"), Bytes.toBytes(value.getRn_date_type()));
        put.addColumn(cf, Bytes.toBytes("follow_discnt"), Bytes.toBytes(value.getFollow_discnt()));
        put.addColumn(cf, Bytes.toBytes("large_sa_discnt"), Bytes.toBytes(value.getLarge_sa_discnt()));
        put.addColumn(cf, Bytes.toBytes("prem_vouch_permit"), Bytes.toBytes(value.getPrem_vouch_permit()));
        put.addColumn(cf, Bytes.toBytes("prem_vouch_rate"), Bytes.toBytes(value.getPrem_vouch_rate()));
        put.addColumn(cf, Bytes.toBytes("defer_period"), Bytes.toBytes(value.getDefer_period()));
        put.addColumn(cf, Bytes.toBytes("joint_adjust_rate"), Bytes.toBytes(value.getJoint_adjust_rate()));
        put.addColumn(cf, Bytes.toBytes("waiver"), Bytes.toBytes(value.getWaiver()));
        put.addColumn(cf, Bytes.toBytes("waiver_benefit"), Bytes.toBytes(value.getWaiver_benefit()));
        put.addColumn(cf, Bytes.toBytes("waiver_basis"), Bytes.toBytes(value.getWaiver_basis()));
        put.addColumn(cf, Bytes.toBytes("max_switch_times"), Bytes.toBytes(value.getMax_switch_times()));
        put.addColumn(cf, Bytes.toBytes("switch_period_unit"), Bytes.toBytes(value.getSwitch_period_unit()));
        put.addColumn(cf, Bytes.toBytes("max_swit_in_times"), Bytes.toBytes(value.getMax_swit_in_times()));
        put.addColumn(cf, Bytes.toBytes("max_swit_out_times"), Bytes.toBytes(value.getMax_swit_out_times()));
        put.addColumn(cf, Bytes.toBytes("rup_product_id"), Bytes.toBytes(value.getRup_product_id()));
        put.addColumn(cf, Bytes.toBytes("eta_product_id"), Bytes.toBytes(value.getEta_product_id()));
        put.addColumn(cf, Bytes.toBytes("min_sur_value"), Bytes.toBytes(value.getMin_sur_value()));
        put.addColumn(cf, Bytes.toBytes("min_remain_value"), Bytes.toBytes(value.getMin_remain_value()));
        put.addColumn(cf, Bytes.toBytes("min_defer_period"), Bytes.toBytes(value.getMin_defer_period()));
        put.addColumn(cf, Bytes.toBytes("max_defer_period"), Bytes.toBytes(value.getMax_defer_period()));
        put.addColumn(cf, Bytes.toBytes("switch_method"), Bytes.toBytes(value.getSwitch_method()));
        put.addColumn(cf, Bytes.toBytes("product_name_2"), Bytes.toBytes(value.getProduct_name_2()));
        put.addColumn(cf, Bytes.toBytes("feature_desc"), Bytes.toBytes(value.getFeature_desc()));
        put.addColumn(cf, Bytes.toBytes("payer_wop"), Bytes.toBytes(value.getPayer_wop()));
        put.addColumn(cf, Bytes.toBytes("max_waiv_prem_ann"), Bytes.toBytes(value.getMax_waiv_prem_ann()));
        put.addColumn(cf, Bytes.toBytes("gurnt_period_type"), Bytes.toBytes(value.getGurnt_period_type()));
        put.addColumn(cf, Bytes.toBytes("receipt_indi"), Bytes.toBytes(value.getReceipt_indi()));
        put.addColumn(cf, Bytes.toBytes("proof_age"), Bytes.toBytes(value.getProof_age()));
        put.addColumn(cf, Bytes.toBytes("full_declare"), Bytes.toBytes(value.getFull_declare()));
        put.addColumn(cf, Bytes.toBytes("ph_la_relation"), Bytes.toBytes(value.getPh_la_relation()));
        put.addColumn(cf, Bytes.toBytes("hth_full_declare"), Bytes.toBytes(value.getHth_full_declare()));
        put.addColumn(cf, Bytes.toBytes("advan_program"), Bytes.toBytes(value.getAdvan_program()));
        put.addColumn(cf, Bytes.toBytes("uw_jet"), Bytes.toBytes(value.getUw_jet()));
        put.addColumn(cf, Bytes.toBytes("backdate_indi"), Bytes.toBytes(value.getBackdate_indi()));
        put.addColumn(cf, Bytes.toBytes("start_backdate"), Bytes.toBytes(value.getStart_backdate()));
        put.addColumn(cf, Bytes.toBytes("backdate_period"), Bytes.toBytes(value.getBackdate_period()));
        put.addColumn(cf, Bytes.toBytes("postdate_indi"), Bytes.toBytes(value.getPostdate_indi()));
        put.addColumn(cf, Bytes.toBytes("max_comp_commi"), Bytes.toBytes(value.getMax_comp_commi()));
        put.addColumn(cf, Bytes.toBytes("dopp_indi"), Bytes.toBytes(value.getDopp_indi()));
        put.addColumn(cf, Bytes.toBytes("policy_section"), Bytes.toBytes(value.getPolicy_section()));
        put.addColumn(cf, Bytes.toBytes("assignment_indi"), Bytes.toBytes(value.getAssignment_indi()));
        put.addColumn(cf, Bytes.toBytes("conversion_priv"), Bytes.toBytes(value.getConversion_priv()));
        put.addColumn(cf, Bytes.toBytes("purc_new_pol"), Bytes.toBytes(value.getPurc_new_pol()));
        put.addColumn(cf, Bytes.toBytes("unexpire_rate_meth"), Bytes.toBytes(value.getUnexpire_rate_meth()));
        put.addColumn(cf, Bytes.toBytes("bonus_encash"), Bytes.toBytes(value.getBonus_encash()));
        put.addColumn(cf, Bytes.toBytes("la_change"), Bytes.toBytes(value.getLa_change()));
        put.addColumn(cf, Bytes.toBytes("free_look_indi"), Bytes.toBytes(value.getFree_look_indi()));
        put.addColumn(cf, Bytes.toBytes("free_look_follow"), Bytes.toBytes(value.getFree_look_follow()));
        put.addColumn(cf, Bytes.toBytes("admin_charge"), Bytes.toBytes(value.getAdmin_charge()));
        put.addColumn(cf, Bytes.toBytes("stand_alone_rider"), Bytes.toBytes(value.getStand_alone_rider()));
        put.addColumn(cf, Bytes.toBytes("partial_withdraw"), Bytes.toBytes(value.getPartial_withdraw()));
        put.addColumn(cf, Bytes.toBytes("invest_delay"), Bytes.toBytes(value.getInvest_delay()));
        put.addColumn(cf, Bytes.toBytes("cash_bonus_indi"), Bytes.toBytes(value.getCash_bonus_indi()));
        put.addColumn(cf, Bytes.toBytes("rev_bonus_indi"), Bytes.toBytes(value.getRev_bonus_indi()));
        put.addColumn(cf, Bytes.toBytes("tml_bonus_indi"), Bytes.toBytes(value.getTml_bonus_indi()));
        put.addColumn(cf, Bytes.toBytes("eta_endo_prod"), Bytes.toBytes(value.getEta_endo_prod()));
        put.addColumn(cf, Bytes.toBytes("tml_bonus_int_rate"), Bytes.toBytes(value.getTml_bonus_int_rate()));
        put.addColumn(cf, Bytes.toBytes("bereavement_indi"), Bytes.toBytes(value.getBereavement_indi()));
        put.addColumn(cf, Bytes.toBytes("max_reins_period"), Bytes.toBytes(value.getMax_reins_period()));
        put.addColumn(cf, Bytes.toBytes("eta_permit"), Bytes.toBytes(value.getEta_permit()));
        put.addColumn(cf, Bytes.toBytes("free_look_period"), Bytes.toBytes(value.getFree_look_period()));
        put.addColumn(cf, Bytes.toBytes("stand_life_indi"), Bytes.toBytes(value.getStand_life_indi()));
        put.addColumn(cf, Bytes.toBytes("non_lap_period"), Bytes.toBytes(value.getNon_lap_period()));
        put.addColumn(cf, Bytes.toBytes("switch_fee"), Bytes.toBytes(value.getSwitch_fee()));
        put.addColumn(cf, Bytes.toBytes("free_switch_times"), Bytes.toBytes(value.getFree_switch_times()));
        put.addColumn(cf, Bytes.toBytes("max_gib_rate"), Bytes.toBytes(value.getMax_gib_rate()));
        put.addColumn(cf, Bytes.toBytes("max_gib_age"), Bytes.toBytes(value.getMax_gib_age()));
        put.addColumn(cf, Bytes.toBytes("incr_prem_permit"), Bytes.toBytes(value.getIncr_prem_permit()));
        put.addColumn(cf, Bytes.toBytes("max_reins_peri_unit"), Bytes.toBytes(value.getMax_reins_peri_unit()));
        put.addColumn(cf, Bytes.toBytes("surr_charge_indi"), Bytes.toBytes(value.getSurr_charge_indi()));
        put.addColumn(cf, Bytes.toBytes("special_discnt"), Bytes.toBytes(value.getSpecial_discnt()));
        put.addColumn(cf, Bytes.toBytes("apilp_indi"), Bytes.toBytes(value.getApilp_indi()));
        put.addColumn(cf, Bytes.toBytes("backdate_unit"), Bytes.toBytes(value.getBackdate_unit()));
        put.addColumn(cf, Bytes.toBytes("topup_permit"), Bytes.toBytes(value.getTopup_permit()));
        put.addColumn(cf, Bytes.toBytes("reg_topup_permit"), Bytes.toBytes(value.getReg_topup_permit()));
        put.addColumn(cf, Bytes.toBytes("gurnt_period_unit"), Bytes.toBytes(value.getGurnt_period_unit()));
        put.addColumn(cf, Bytes.toBytes("gurnt_period"), Bytes.toBytes(value.getGurnt_period()));
        put.addColumn(cf, Bytes.toBytes("hi_pol_fee_indi"), Bytes.toBytes(value.getHi_pol_fee_indi()));
        put.addColumn(cf, Bytes.toBytes("grace_period_add"), Bytes.toBytes(value.getGrace_period_add()));
        put.addColumn(cf, Bytes.toBytes("overdue_int_indi"), Bytes.toBytes(value.getOverdue_int_indi()));
        put.addColumn(cf, Bytes.toBytes("eta_term_prod"), Bytes.toBytes(value.getEta_term_prod()));
        put.addColumn(cf, Bytes.toBytes("annuity_surr_fac"), Bytes.toBytes(value.getAnnuity_surr_fac()));
        put.addColumn(cf, Bytes.toBytes("annuity_notice_indi"), Bytes.toBytes(value.getAnnuity_notice_indi()));
        put.addColumn(cf, Bytes.toBytes("annuity_notice_unit"), Bytes.toBytes(value.getAnnuity_notice_unit()));
        put.addColumn(cf, Bytes.toBytes("annuity_notice_period"), Bytes.toBytes(value.getAnnuity_notice_period()));
        put.addColumn(cf, Bytes.toBytes("decrease_permit"), Bytes.toBytes(value.getDecrease_permit()));
        put.addColumn(cf, Bytes.toBytes("prefer_life_indi"), Bytes.toBytes(value.getPrefer_life_indi()));
        put.addColumn(cf, Bytes.toBytes("free_switch_unit"), Bytes.toBytes(value.getFree_switch_unit()));
        put.addColumn(cf, Bytes.toBytes("free_switch_period"), Bytes.toBytes(value.getFree_switch_period()));
        put.addColumn(cf, Bytes.toBytes("par_non_ilp"), Bytes.toBytes(value.getPar_non_ilp()));
        put.addColumn(cf, Bytes.toBytes("gib_permit"), Bytes.toBytes(value.getGib_permit()));
        put.addColumn(cf, Bytes.toBytes("max_loan_rate"), Bytes.toBytes(value.getMax_loan_rate()));
        put.addColumn(cf, Bytes.toBytes("matu_loan_permit"), Bytes.toBytes(value.getMatu_loan_permit()));
        put.addColumn(cf, Bytes.toBytes("special_revival_permit"), Bytes.toBytes(value.getSpecial_revival_permit()));
        put.addColumn(cf, Bytes.toBytes("stampduty_option"), Bytes.toBytes(value.getStampduty_option()));
        put.addColumn(cf, Bytes.toBytes("ladr_indi"), Bytes.toBytes(value.getLadr_indi()));
        put.addColumn(cf, Bytes.toBytes("bonus_vest_year_clm"), Bytes.toBytes(value.getBonus_vest_year_clm()));
        put.addColumn(cf, Bytes.toBytes("bonus_vest_year_surr"), Bytes.toBytes(value.getBonus_vest_year_surr()));
        put.addColumn(cf, Bytes.toBytes("cb_vest_year"), Bytes.toBytes(value.getCb_vest_year()));
        put.addColumn(cf, Bytes.toBytes("is_net_invest"), Bytes.toBytes(value.getIs_net_invest()));
        put.addColumn(cf, Bytes.toBytes("auto_reduce_paidup"), Bytes.toBytes(value.getAuto_reduce_paidup()));
        put.addColumn(cf, Bytes.toBytes("after_eta_option"), Bytes.toBytes(value.getAfter_eta_option()));
        put.addColumn(cf, Bytes.toBytes("gsv_vest_year"), Bytes.toBytes(value.getGsv_vest_year()));
        put.addColumn(cf, Bytes.toBytes("phd_rate_cate"), Bytes.toBytes(value.getPhd_rate_cate()));
        put.addColumn(cf, Bytes.toBytes("ri_calc_basis"), Bytes.toBytes(value.getRi_calc_basis()));
        put.addColumn(cf, Bytes.toBytes("ri_calc_formula"), Bytes.toBytes(value.getRi_calc_formula()));
        put.addColumn(cf, Bytes.toBytes("ri_renewal_freq"), Bytes.toBytes(value.getRi_renewal_freq()));
        put.addColumn(cf, Bytes.toBytes("ri_factor_table_code"), Bytes.toBytes(value.getRi_factor_table_code()));
        put.addColumn(cf, Bytes.toBytes("ri_age_base"), Bytes.toBytes(value.getRi_age_base()));
        put.addColumn(cf, Bytes.toBytes("asset_share"), Bytes.toBytes(value.getAsset_share()));
        put.addColumn(cf, Bytes.toBytes("gja_indi"), Bytes.toBytes(value.getGja_indi()));
        put.addColumn(cf, Bytes.toBytes("gsc_indi"), Bytes.toBytes(value.getGsc_indi()));
        put.addColumn(cf, Bytes.toBytes("apilp_k"), Bytes.toBytes(value.getApilp_k()));
        put.addColumn(cf, Bytes.toBytes("uptoage_indi"), Bytes.toBytes(value.getUptoage_indi()));
        put.addColumn(cf, Bytes.toBytes("spouse_prod_indi"), Bytes.toBytes(value.getSpouse_prod_indi()));
        put.addColumn(cf, Bytes.toBytes("benefit_freq_indi"), Bytes.toBytes(value.getBenefit_freq_indi()));
        put.addColumn(cf, Bytes.toBytes("risk_aggr_formula"), Bytes.toBytes(value.getRisk_aggr_formula()));
        put.addColumn(cf, Bytes.toBytes("prem_change_notice"), Bytes.toBytes(value.getPrem_change_notice()));
        put.addColumn(cf, Bytes.toBytes("aurp_specific_terms"), Bytes.toBytes(value.getAurp_specific_terms()));
        put.addColumn(cf, Bytes.toBytes("waiver_interest_rate"), Bytes.toBytes(value.getWaiver_interest_rate()));
        put.addColumn(cf, Bytes.toBytes("db_base_clm"), Bytes.toBytes(value.getDb_base_clm()));
        put.addColumn(cf, Bytes.toBytes("bucket_filling_option"), Bytes.toBytes(value.getBucket_filling_option()));
        put.addColumn(cf, Bytes.toBytes("follow_commision"), Bytes.toBytes(value.getFollow_commision()));
        put.addColumn(cf, Bytes.toBytes("formula_driven"), Bytes.toBytes(value.getFormula_driven()));
        put.addColumn(cf, Bytes.toBytes("value_unit_amount"), Bytes.toBytes(value.getValue_unit_amount()));
        put.addColumn(cf, Bytes.toBytes("value_cal_type"), Bytes.toBytes(value.getValue_cal_type()));
        put.addColumn(cf, Bytes.toBytes("comm_start_dd_indi"), Bytes.toBytes(value.getComm_start_dd_indi()));
        put.addColumn(cf, Bytes.toBytes("fin_prod_indicator"), Bytes.toBytes(value.getFin_prod_indicator()));
        put.addColumn(cf, Bytes.toBytes("ra_object"), Bytes.toBytes(value.getRa_object()));
        put.addColumn(cf, Bytes.toBytes("min_loan_amt"), Bytes.toBytes(value.getMin_loan_amt()));
        put.addColumn(cf, Bytes.toBytes("reg_part_witdr_per"), Bytes.toBytes(value.getReg_part_witdr_per()));
        put.addColumn(cf, Bytes.toBytes("bucket_fill_option_ad"), Bytes.toBytes(value.getBucket_fill_option_ad()));
        put.addColumn(cf, Bytes.toBytes("pld_grace_period"), Bytes.toBytes(value.getPld_grace_period()));
        put.addColumn(cf, Bytes.toBytes("lapse_method"), Bytes.toBytes(value.getLapse_method()));
        put.addColumn(cf, Bytes.toBytes("free_witdr_times"), Bytes.toBytes(value.getFree_witdr_times()));
        put.addColumn(cf, Bytes.toBytes("spouse_waiver"), Bytes.toBytes(value.getSpouse_waiver()));
        put.addColumn(cf, Bytes.toBytes("pers_annu_tax_term"), Bytes.toBytes(value.getPers_annu_tax_term()));
        put.addColumn(cf, Bytes.toBytes("full_prepayment"), Bytes.toBytes(value.getFull_prepayment()));
        put.addColumn(cf, Bytes.toBytes("self_confirm"), Bytes.toBytes(value.getSelf_confirm()));
        put.addColumn(cf, Bytes.toBytes("wait_days_af_lapse"), Bytes.toBytes(value.getWait_days_af_lapse()));
        put.addColumn(cf, Bytes.toBytes("editable"), Bytes.toBytes(value.getEditable()));
        put.addColumn(cf, Bytes.toBytes("has_flexible_period"), Bytes.toBytes(value.getHas_flexible_period()));
        put.addColumn(cf, Bytes.toBytes("flexible_period"), Bytes.toBytes(value.getFlexible_period()));
        put.addColumn(cf, Bytes.toBytes("first_of_month"), Bytes.toBytes(value.getFirst_of_month()));
        put.addColumn(cf, Bytes.toBytes("forward_allowed"), Bytes.toBytes(value.getForward_allowed()));
        put.addColumn(cf, Bytes.toBytes("period_type_for_forward"), Bytes.toBytes(value.getPeriod_type_for_forward()));
        put.addColumn(cf, Bytes.toBytes("max_period_for_forward"), Bytes.toBytes(value.getMax_period_for_forward()));
        put.addColumn(cf, Bytes.toBytes("indx_indi"), Bytes.toBytes(value.getIndx_indi()));
        put.addColumn(cf, Bytes.toBytes("indx_year"), Bytes.toBytes(value.getIndx_year()));
        put.addColumn(cf, Bytes.toBytes("auto_backdate_indi"), Bytes.toBytes(value.getAuto_backdate_indi()));
        put.addColumn(cf, Bytes.toBytes("interest_feedback_indi"), Bytes.toBytes(value.getInterest_feedback_indi()));
        put.addColumn(cf, Bytes.toBytes("unexpired_prem_indi"), Bytes.toBytes(value.getUnexpired_prem_indi()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("is_free"), Bytes.toBytes(value.getIs_free()));
        put.addColumn(cf, Bytes.toBytes("need_interview"), Bytes.toBytes(value.getNeed_interview()));
        put.addColumn(cf, Bytes.toBytes("need_acknowledgement"), Bytes.toBytes(value.getNeed_acknowledgement()));
        put.addColumn(cf, Bytes.toBytes("taxes_id"), Bytes.toBytes(value.getTaxes_id()));
        put.addColumn(cf, Bytes.toBytes("taxable_type"), Bytes.toBytes(value.getTaxable_type()));
        put.addColumn(cf, Bytes.toBytes("is_need_healthy"), Bytes.toBytes(value.getIs_need_healthy()));
        put.addColumn(cf, Bytes.toBytes("is_short_renewal"), Bytes.toBytes(value.getIs_short_renewal()));
        put.addColumn(cf, Bytes.toBytes("has_holder_risk"), Bytes.toBytes(value.getHas_holder_risk()));
        put.addColumn(cf, Bytes.toBytes("is_waiver_all"), Bytes.toBytes(value.getIs_waiver_all()));
        put.addColumn(cf, Bytes.toBytes("is_calc_liab_amount"), Bytes.toBytes(value.getIs_calc_liab_amount()));
        put.addColumn(cf, Bytes.toBytes("holder_healthy"), Bytes.toBytes(value.getHolder_healthy()));
        put.addColumn(cf, Bytes.toBytes("insured_healthy"), Bytes.toBytes(value.getInsured_healthy()));

        table.put(put);
    }
}
