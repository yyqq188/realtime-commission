package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:14
 */
public class DefinePolicyInterviewHbaseTable {
    public static void definePolicyInterview(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_policy_interview");

        hBaseTableSource.setRowKey("list_id", String.class);
        hBaseTableSource.addColumn("f", "switch_list_id", String.class);
        hBaseTableSource.addColumn("f", "policy_id", String.class);
        hBaseTableSource.addColumn("f", "policy_code", String.class);
        hBaseTableSource.addColumn("f", "benefit_code", String.class);
        hBaseTableSource.addColumn("f", "interview_type", String.class);
        hBaseTableSource.addColumn("f", "next_due_date", String.class);
        hBaseTableSource.addColumn("f", "lapse_date", String.class);
        hBaseTableSource.addColumn("f", "csr", String.class);
        hBaseTableSource.addColumn("f", "interview_status", String.class);
        hBaseTableSource.addColumn("f", "interview_time", String.class);
        hBaseTableSource.addColumn("f", "syn_status", String.class);
        hBaseTableSource.addColumn("f", "inserted_by", String.class);
        hBaseTableSource.addColumn("f", "updated_by", String.class);
        hBaseTableSource.addColumn("f", "insert_time", String.class);
        hBaseTableSource.addColumn("f", "update_time", String.class);
        hBaseTableSource.addColumn("f", "insert_timestamp", String.class);
        hBaseTableSource.addColumn("f", "update_timestamp", String.class);
        hBaseTableSource.addColumn("f", "case_status", String.class);
        hBaseTableSource.addColumn("f", "case_processing_time", String.class);
        hBaseTableSource.addColumn("f", "interview_case", String.class);
        hBaseTableSource.addColumn("f", "interview_cause", String.class);
        hBaseTableSource.addColumn("f", "interview_detail", String.class);
        hBaseTableSource.addColumn("f", "interview_way", String.class);
        hBaseTableSource.addColumn("f", "interview_way_real", String.class);
        hBaseTableSource.addColumn("f", "agent_star_level", String.class);


        tableEnv.registerFunction("t_lookup_list_id", hBaseTableSource.getLookupFunction(new String[]{"list_id"}));
    }
}
