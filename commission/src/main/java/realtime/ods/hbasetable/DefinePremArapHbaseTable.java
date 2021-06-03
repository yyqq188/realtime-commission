package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:27
 */
public class DefinePremArapHbaseTable {
    public static void definePremArap(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_prem_arap");

        hBaseTableSource.setRowKey("item_id", String.class);
        hBaseTableSource.addColumn("f", "list_id", String.class);
        hBaseTableSource.addColumn("f", "head_id", String.class);
        hBaseTableSource.addColumn("f", "branch_id", String.class);
        hBaseTableSource.addColumn("f", "organ_id", String.class);
        hBaseTableSource.addColumn("f", "policy_type", String.class);
        hBaseTableSource.addColumn("f", "happen_time", String.class);
        hBaseTableSource.addColumn("f", "due_time", String.class);
        hBaseTableSource.addColumn("f", "agent_id", String.class);
        hBaseTableSource.addColumn("f", "grade_id", String.class);
        hBaseTableSource.addColumn("f", "commision_rate", String.class);
        hBaseTableSource.addColumn("f", "normal_commision", String.class);
        hBaseTableSource.addColumn("f", "discount_rate", String.class);
        hBaseTableSource.addColumn("f", "commision", String.class);
        hBaseTableSource.addColumn("f", "commision_id", String.class);
        hBaseTableSource.addColumn("f", "is_pay", String.class);
        hBaseTableSource.addColumn("f", "policy_year", String.class);
        hBaseTableSource.addColumn("f", "assign_rate", String.class);
        hBaseTableSource.addColumn("f", "sign_id", String.class);
        hBaseTableSource.addColumn("f", "mgr_rate", String.class);
        hBaseTableSource.addColumn("f", "agent_cate", String.class);
        hBaseTableSource.addColumn("f", "commision_type_id", String.class);
        hBaseTableSource.addColumn("f", "derivation", String.class);
        hBaseTableSource.addColumn("f", "fee_type", String.class);
        hBaseTableSource.addColumn("f", "gst_commision", String.class);
        hBaseTableSource.addColumn("f", "suspend_cause", String.class);
        hBaseTableSource.addColumn("f", "issue_mode", String.class);
        hBaseTableSource.addColumn("f", "payment_id", String.class);
        hBaseTableSource.addColumn("f", "posted", String.class);
        hBaseTableSource.addColumn("f", "cred_id", String.class);
        hBaseTableSource.addColumn("f", "post_id", String.class);
        hBaseTableSource.addColumn("f", "policy_id", String.class);
        hBaseTableSource.addColumn("f", "money_id", String.class);
        hBaseTableSource.addColumn("f", "comm_status", String.class);
        hBaseTableSource.addColumn("f", "aggregation_id", String.class);
        hBaseTableSource.addColumn("f", "benefit_item_id", String.class);
        hBaseTableSource.addColumn("f", "product_id", String.class);
        hBaseTableSource.addColumn("f", "related_id", String.class);
        hBaseTableSource.addColumn("f", "reversal_policy_chg_id", String.class);
        hBaseTableSource.addColumn("f", "comm_source", String.class);
        hBaseTableSource.addColumn("f", "comm_comment", String.class);
        hBaseTableSource.addColumn("f", "exchange_rate", String.class);
        hBaseTableSource.addColumn("f", "confirm_date", String.class);
        hBaseTableSource.addColumn("f", "accounting_date", String.class);
        hBaseTableSource.addColumn("f", "je_posting_id", String.class);
        hBaseTableSource.addColumn("f", "je_creator_id", String.class);
        hBaseTableSource.addColumn("f", "dr_seg1", String.class);
        hBaseTableSource.addColumn("f", "dr_seg2", String.class);
        hBaseTableSource.addColumn("f", "dr_seg3", String.class);
        hBaseTableSource.addColumn("f", "dr_seg4", String.class);
        hBaseTableSource.addColumn("f", "dr_seg5", String.class);
        hBaseTableSource.addColumn("f", "dr_seg6", String.class);
        hBaseTableSource.addColumn("f", "dr_seg7", String.class);
        hBaseTableSource.addColumn("f", "dr_seg8", String.class);
        hBaseTableSource.addColumn("f", "cr_seg1", String.class);
        hBaseTableSource.addColumn("f", "cr_seg2", String.class);
        hBaseTableSource.addColumn("f", "cr_seg3", String.class);
        hBaseTableSource.addColumn("f", "cr_seg4", String.class);
        hBaseTableSource.addColumn("f", "cr_seg5", String.class);
        hBaseTableSource.addColumn("f", "cr_seg6", String.class);
        hBaseTableSource.addColumn("f", "cr_seg7", String.class);
        hBaseTableSource.addColumn("f", "cr_seg8", String.class);
        hBaseTableSource.addColumn("f", "confirm_emp", String.class);
        hBaseTableSource.addColumn("f", "child_level", String.class);
        hBaseTableSource.addColumn("f", "dr_seg9", String.class);
        hBaseTableSource.addColumn("f", "dr_seg10", String.class);
        hBaseTableSource.addColumn("f", "dr_seg11", String.class);
        hBaseTableSource.addColumn("f", "dr_seg12", String.class);
        hBaseTableSource.addColumn("f", "dr_seg13", String.class);
        hBaseTableSource.addColumn("f", "dr_seg14", String.class);
        hBaseTableSource.addColumn("f", "dr_seg15", String.class);
        hBaseTableSource.addColumn("f", "dr_seg16", String.class);
        hBaseTableSource.addColumn("f", "dr_seg17", String.class);
        hBaseTableSource.addColumn("f", "dr_seg18", String.class);
        hBaseTableSource.addColumn("f", "dr_seg19", String.class);
        hBaseTableSource.addColumn("f", "dr_seg20", String.class);
        hBaseTableSource.addColumn("f", "cr_seg9", String.class);
        hBaseTableSource.addColumn("f", "cr_seg10", String.class);
        hBaseTableSource.addColumn("f", "cr_seg11", String.class);
        hBaseTableSource.addColumn("f", "cr_seg12", String.class);
        hBaseTableSource.addColumn("f", "cr_seg13", String.class);
        hBaseTableSource.addColumn("f", "cr_seg14", String.class);
        hBaseTableSource.addColumn("f", "cr_seg15", String.class);
        hBaseTableSource.addColumn("f", "cr_seg16", String.class);
        hBaseTableSource.addColumn("f", "cr_seg17", String.class);
        hBaseTableSource.addColumn("f", "cr_seg18", String.class);
        hBaseTableSource.addColumn("f", "cr_seg19", String.class);
        hBaseTableSource.addColumn("f", "cr_seg20", String.class);
        hBaseTableSource.addColumn("f", "channel_org_id", String.class);
        hBaseTableSource.addColumn("f", "stream_id", String.class);
        hBaseTableSource.addColumn("f", "prem_type", String.class);
        hBaseTableSource.addColumn("f", "change_id", String.class);
        hBaseTableSource.addColumn("f", "policy_chg_id", String.class);
        hBaseTableSource.addColumn("f", "policy_period", String.class);
        hBaseTableSource.addColumn("f", "aggre_rate_bf", String.class);
        hBaseTableSource.addColumn("f", "aggre_rate_af", String.class);
        hBaseTableSource.addColumn("f", "inserted_by", String.class);
        hBaseTableSource.addColumn("f", "updated_by", String.class);
        hBaseTableSource.addColumn("f", "insert_time", String.class);
        hBaseTableSource.addColumn("f", "update_time", String.class);
        hBaseTableSource.addColumn("f", "insert_timestamp", String.class);
        hBaseTableSource.addColumn("f", "update_timestamp", String.class);
        hBaseTableSource.addColumn("f", "is_extra_commision", String.class);


        tableEnv.registerFunction("t_lookup_item_id", hBaseTableSource.getLookupFunction(new String[]{"item_id"}));
    }
}
