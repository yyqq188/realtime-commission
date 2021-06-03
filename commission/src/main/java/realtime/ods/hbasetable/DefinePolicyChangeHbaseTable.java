package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 14:52
 */
public class DefinePolicyChangeHbaseTable {
    public static void definePolicyChange(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_policy_change");

        hBaseTableSource.setRowKey("policy_chg_id", String.class);
        hBaseTableSource.addColumn("f","policy_id",String.class);
        hBaseTableSource.addColumn("f","service_id",String.class);
        hBaseTableSource.addColumn("f","change_record",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","validate_time",String.class);
        hBaseTableSource.addColumn("f","need_underwrite",String.class);
        hBaseTableSource.addColumn("f","apply_time",String.class);
        hBaseTableSource.addColumn("f","change_cause",String.class);
        hBaseTableSource.addColumn("f","cancel_id",String.class);
        hBaseTableSource.addColumn("f","cancel_time",String.class);
        hBaseTableSource.addColumn("f","rejecter_id",String.class);
        hBaseTableSource.addColumn("f","reject_time",String.class);
        hBaseTableSource.addColumn("f","reject_note",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","master_chg_id",String.class);
        hBaseTableSource.addColumn("f","cancel_cause",String.class);
        hBaseTableSource.addColumn("f","cancel_note",String.class);
        hBaseTableSource.addColumn("f","reject_cause",String.class);
        hBaseTableSource.addColumn("f","last_handler_id",String.class);
        hBaseTableSource.addColumn("f","last_entry_time",String.class);
        hBaseTableSource.addColumn("f","last_uw_disp_id",String.class);
        hBaseTableSource.addColumn("f","last_uw_disp_time",String.class);
        hBaseTableSource.addColumn("f","order_id",String.class);
        hBaseTableSource.addColumn("f","policy_chg_status",String.class);
        hBaseTableSource.addColumn("f","dispatch_emp",String.class);
        hBaseTableSource.addColumn("f","letter_effect_type",String.class);
        hBaseTableSource.addColumn("f","dispatch_type",String.class);
        hBaseTableSource.addColumn("f","dispatch_letter",String.class);
        hBaseTableSource.addColumn("f","sub_service_id",String.class);
        hBaseTableSource.addColumn("f","change_note",String.class);
        hBaseTableSource.addColumn("f","ri_processed",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","inserted_timestamp",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","updated_timestamp",String.class);
        hBaseTableSource.addColumn("f","pre_policy_chg",String.class);
        hBaseTableSource.addColumn("f","change_seq",String.class);
        hBaseTableSource.addColumn("f","finish_time",String.class);
        hBaseTableSource.addColumn("f","org_id",String.class);
        hBaseTableSource.addColumn("f","request_effect_date",String.class);
        hBaseTableSource.addColumn("f","task_due_date",String.class);
        hBaseTableSource.addColumn("f","item_opened",String.class);
        hBaseTableSource.addColumn("f","reg_time",String.class);
        hBaseTableSource.addColumn("f","source_type",String.class);


        tableEnv.registerFunction("t_lookup_policy_chg_id",hBaseTableSource.getLookupFunction(new String[]{"policy_chg_id"}));

    }
}
