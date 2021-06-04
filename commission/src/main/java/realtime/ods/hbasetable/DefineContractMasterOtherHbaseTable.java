package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 13:21
 */
public class DefineContractMasterOtherHbaseTable {
    public static void defineContractMasterOther(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_contract_master_other");

        hBaseTableSource.setRowKey("policy_id", String.class);
        hBaseTableSource.addColumn("f","policy_mark",String.class);
        hBaseTableSource.addColumn("f","is_os_input",String.class);
        hBaseTableSource.addColumn("f","freelook_period",String.class);
        hBaseTableSource.addColumn("f","contract_id",String.class);
        hBaseTableSource.addColumn("f","is_mep",String.class);
        hBaseTableSource.addColumn("f","rec_agent",String.class);
        hBaseTableSource.addColumn("f","is_open_red",String.class);
        hBaseTableSource.addColumn("f","product_plan_id",String.class);
        hBaseTableSource.addColumn("f","is_back_data",String.class);
        hBaseTableSource.addColumn("f","operation_terminal",String.class);
        hBaseTableSource.addColumn("f","sum_amount",String.class);
        hBaseTableSource.addColumn("f","split_commission_indi",String.class);
        hBaseTableSource.addColumn("f","is_os_input_print",String.class);
        hBaseTableSource.addColumn("f","cancel_print_date",String.class);
        hBaseTableSource.addColumn("f","closed_status",String.class);
        hBaseTableSource.addColumn("f","closed_time",String.class);
        hBaseTableSource.addColumn("f","reopen_time",String.class);
        hBaseTableSource.addColumn("f","is_force_mark",String.class);
        hBaseTableSource.addColumn("f","is_double_record",String.class);
        hBaseTableSource.addColumn("f","trans_fapiao_flag",String.class);
        hBaseTableSource.addColumn("f","need_advance_inforce",String.class);
        hBaseTableSource.addColumn("f","real_lapse_date",String.class);
        hBaseTableSource.addColumn("f","policy_print_type",String.class);
        hBaseTableSource.addColumn("f","is_stick_reason",String.class);
        hBaseTableSource.addColumn("f","back_desc",String.class);
        hBaseTableSource.addColumn("f","is_stick_reason_bak",String.class);
        hBaseTableSource.addColumn("f","policysign_province",String.class);
        hBaseTableSource.addColumn("f","policysign_city",String.class);
        hBaseTableSource.addColumn("f","is_need_uw",String.class);
        hBaseTableSource.addColumn("f","auto_uw_decision",String.class);
        hBaseTableSource.addColumn("f","is_related_trans",String.class);
        hBaseTableSource.addColumn("f","related_trans_add_time",String.class);
        hBaseTableSource.addColumn("f","plan_number",String.class);
        hBaseTableSource.addColumn("f","agent_star_level",String.class);
        hBaseTableSource.addColumn("f","has_medi_record",String.class);
        hBaseTableSource.addColumn("f","auto_proposal",String.class);
        hBaseTableSource.addColumn("f","apply_area",String.class);
        hBaseTableSource.addColumn("f","sf_licensed_no",String.class);
        hBaseTableSource.addColumn("f","is_trust",String.class);
        hBaseTableSource.addColumn("f","reinsu_upgrade_flag",String.class);
        hBaseTableSource.addColumn("f","reinsu_source_policy_code",String.class);
        hBaseTableSource.addColumn("f","interview_way",String.class);
        hBaseTableSource.addColumn("f","back_reg_declare",String.class);
        hBaseTableSource.addColumn("f","pre_withdraw_date",String.class);
        hBaseTableSource.addColumn("f","service_type",String.class);
        hBaseTableSource.addColumn("f","allot_stytle",String.class);
        hBaseTableSource.addColumn("f","supervision_persion",String.class);
        hBaseTableSource.addColumn("f","renew_persion",String.class);
        hBaseTableSource.addColumn("f","lock_state",String.class);
        hBaseTableSource.addColumn("f","lock_startdate",String.class);
        hBaseTableSource.addColumn("f","lock_enddate",String.class);
        hBaseTableSource.addColumn("f","lock_reason",String.class);
        hBaseTableSource.addColumn("f","operator",String.class);
        hBaseTableSource.addColumn("f","service_persion",String.class);
        hBaseTableSource.addColumn("f","oldservice_type",String.class);
        hBaseTableSource.addColumn("f","stchangedate",String.class);
        hBaseTableSource.addColumn("f","bank_private",String.class);
        hBaseTableSource.addColumn("f","insurance_source",String.class);
        hBaseTableSource.addColumn("f","is_pre_reg",String.class);
        hBaseTableSource.addColumn("f","prem_col_date",String.class);
        hBaseTableSource.addColumn("f","policy_place",String.class);


        tableEnv.registerFunction("t_lookup_policy_id", hBaseTableSource.getLookupFunction(new String[]{"policy_id"}));
    }
}
