package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.java.StreamTableEnvironment;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * author: yhl
 * time: 2021/6/1 下午1:38
 * company: gientech
 */
public class DefinePolicyProducerRoleHbaseTable {
    public static void definePolicyProducerRole(StreamTableEnvironment tableEnv, Configuration conf){
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_policy_producer_role");

        hBaseTableSource.setRowKey("role_id",String.class);
        hBaseTableSource.addColumn("f","policy_id",String.class);
        hBaseTableSource.addColumn("f","item_id",String.class);
        hBaseTableSource.addColumn("f","producer_role",String.class);
        hBaseTableSource.addColumn("f","producer_id",String.class);
        hBaseTableSource.addColumn("f","producer_position",String.class);
        hBaseTableSource.addColumn("f","active_indi",String.class);
        hBaseTableSource.addColumn("f","assign_rate",String.class);
        hBaseTableSource.addColumn("f","start_date",String.class);
        hBaseTableSource.addColumn("f","end_date",String.class);
        hBaseTableSource.addColumn("f","hierarchy_date",String.class);
        hBaseTableSource.addColumn("f","change_id",String.class);
        hBaseTableSource.addColumn("f","policy_chg_id",String.class);
        hBaseTableSource.addColumn("f","change_type",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","change_comment",String.class);
        hBaseTableSource.addColumn("f","pre_change_id",String.class);


        tableEnv.registerFunction("t_lookup_role_id",hBaseTableSource.getLookupFunction(new String[]{"role_id"}));


    }
}
