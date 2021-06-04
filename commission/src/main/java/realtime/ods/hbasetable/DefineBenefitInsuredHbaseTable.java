package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
import org.apache.flink.table.api.java.StreamTableEnvironment;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 11:13
 */
public class DefineBenefitInsuredHbaseTable {
    public static void defineBenefitInsured(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_benefit_insured");

        hBaseTableSource.setRowKey("list_id",String.class);
        hBaseTableSource.addColumn("f","item_id",String.class);
        hBaseTableSource.addColumn("f","insured_id",String.class);
        hBaseTableSource.addColumn("f","entry_age",String.class);
        hBaseTableSource.addColumn("f","entry_age_month",String.class);
        hBaseTableSource.addColumn("f","policy_id",String.class);
        hBaseTableSource.addColumn("f","order_id",String.class);
        hBaseTableSource.addColumn("f","ems_version",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","job_class",String.class);

        tableEnv.registerFunction("lookup_list_id",hBaseTableSource.getLookupFunction(new String[]{"list_id"}));
    }
}
