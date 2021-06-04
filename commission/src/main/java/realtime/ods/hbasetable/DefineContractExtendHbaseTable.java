package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;


/**
 * author: yhl
 * time: 2021/6/1 下午1:40
 * company: gientech
 */
public class DefineContractExtendHbaseTable {
    public static void defineContractExtend(StreamTableEnvironment tableEnv, Configuration conf){
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_contract_extend");
        hBaseTableSource.setRowKey("item_id",String.class);
        hBaseTableSource.addColumn("f","due_date",String.class);
        hBaseTableSource.addColumn("f","policy_year",String.class);
        hBaseTableSource.addColumn("f","policy_period",String.class);
        hBaseTableSource.addColumn("f","strgy_due_date",String.class);
        hBaseTableSource.addColumn("f","prem_status",String.class);
        hBaseTableSource.addColumn("f","sa_due_date",String.class);
        hBaseTableSource.addColumn("f","ems_version",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","policy_id",String.class);
        hBaseTableSource.addColumn("f","billing_date",String.class);
        hBaseTableSource.addColumn("f","reminder_date",String.class);
        hBaseTableSource.addColumn("f","indx_due_date",String.class);
        hBaseTableSource.addColumn("f","indx_reject",String.class);

        tableEnv.registerFunction("lookup_item_id",hBaseTableSource.getLookupFunction(new String[]{"item_id"}));



    }
}
