package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * author: yhl
 * time: 2021/6/1 下午3:59
 * company: gientech
 */
public class DefineContractBeneHbaseTable {

    public static void defineContractBene(StreamTableEnvironment tableEnv, Configuration conf){
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf,"t_contract_bene");

        hBaseTableSource.setRowKey("list_id",String.class);
        hBaseTableSource.addColumn("f","party_id",String.class);
        hBaseTableSource.addColumn("f","policy_id",String.class);
        hBaseTableSource.addColumn("f","insurant",String.class);
        hBaseTableSource.addColumn("f","bene_type",String.class);
        hBaseTableSource.addColumn("f","share_order",String.class);
        hBaseTableSource.addColumn("f","share_rate",String.class);
        hBaseTableSource.addColumn("f","designation",String.class);
        hBaseTableSource.addColumn("f","legal_bene",String.class);
        hBaseTableSource.addColumn("f","address_id",String.class);
        hBaseTableSource.addColumn("f","telephone",String.class);
        hBaseTableSource.addColumn("f","mobile_tel",String.class);
        hBaseTableSource.addColumn("f","active_status",String.class);
        hBaseTableSource.addColumn("f","ems_version",String.class);
        hBaseTableSource.addColumn("f","inserted_by",String.class);
        hBaseTableSource.addColumn("f","updated_by",String.class);
        hBaseTableSource.addColumn("f","insert_time",String.class);
        hBaseTableSource.addColumn("f","update_time",String.class);
        hBaseTableSource.addColumn("f","insert_timestamp",String.class);
        hBaseTableSource.addColumn("f","update_timestamp",String.class);
        hBaseTableSource.addColumn("f","irrevocable_indi",String.class);
        hBaseTableSource.addColumn("f","is_same_address",String.class);
        hBaseTableSource.addColumn("f","job_company",String.class);
        hBaseTableSource.addColumn("f","work_content",String.class);
        hBaseTableSource.addColumn("f","usual_address",String.class);
        hBaseTableSource.addColumn("f","income_source",String.class);
        hBaseTableSource.addColumn("f","is_long_term",String.class);
        hBaseTableSource.addColumn("f","marriage_id",String.class);
        hBaseTableSource.addColumn("f","certi_type",String.class);
        hBaseTableSource.addColumn("f","certi_code",String.class);
        hBaseTableSource.addColumn("f","is_personal_tax_status",String.class);
        hBaseTableSource.addColumn("f","expiry_date",String.class);
        tableEnv.registerFunction("lookup_list_id",hBaseTableSource.getLookupFunction(new String[]{"list_id"}));

        tableEnv.registerTableSource("t_contract_bene",hBaseTableSource);

    }
}
