package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
//import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:04
 */
public class DefinePolicyHolderHbaseTable {
    public static void definePolicyHolder(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_policy_holder");

        hBaseTableSource.setRowKey("policy_id", String.class);
        hBaseTableSource.addColumn("f","dispatch_date",String.class);
        hBaseTableSource.addColumn("f","branch_receive_date",String.class);
        hBaseTableSource.addColumn("f","dc_collect_date",String.class);
        hBaseTableSource.addColumn("f","return_reason",String.class);
        hBaseTableSource.addColumn("f","return_desc",String.class);
        hBaseTableSource.addColumn("f","acknowledge_date",String.class);
        hBaseTableSource.addColumn("f","nondeliver_reason",String.class);
        hBaseTableSource.addColumn("f","nondeliver_desc",String.class);
        hBaseTableSource.addColumn("f","nondeliver_begin_date",String.class);
        hBaseTableSource.addColumn("f","nondeliver_end_date",String.class);
        hBaseTableSource.addColumn("f","reminder_date",String.class);
        hBaseTableSource.addColumn("f","operator_id",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","inserted_timestamp",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","updated_timestamp",String.class);
        hBaseTableSource.addColumn("f","disp_date_updated_time",String.class);
        hBaseTableSource.addColumn("f","is_same_with_ph",String.class);
        hBaseTableSource.addColumn("f","ack_way",String.class);


        tableEnv.registerFunction("t_lookup_policy_id",hBaseTableSource.getLookupFunction(new String[]{"policy_id"}));
    }
}
