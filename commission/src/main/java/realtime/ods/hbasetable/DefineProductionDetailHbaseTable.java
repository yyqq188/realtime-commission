package realtime.ods.hbasetable;

import org.apache.flink.addons.hbase.HBaseTableSource;
//import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.hadoop.conf.Configuration;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:43
 */
public class DefineProductionDetailHbaseTable {
    public static void defineProductionDetail(StreamTableEnvironment tableEnv, Configuration conf) {
        HBaseTableSource hBaseTableSource = new HBaseTableSource(conf, "t_production_detail");

        hBaseTableSource.setRowKey("detail_id", String.class);
        hBaseTableSource.addColumn("f", "production_id", String.class);
        hBaseTableSource.addColumn("f", "policy_id", String.class);
        hBaseTableSource.addColumn("f", "item_id", String.class);
        hBaseTableSource.addColumn("f", "product_id", String.class);
        hBaseTableSource.addColumn("f", "policy_year", String.class);
        hBaseTableSource.addColumn("f", "production_value", String.class);
        hBaseTableSource.addColumn("f", "effective_date", String.class);
        hBaseTableSource.addColumn("f", "hierarchy_date", String.class);
        hBaseTableSource.addColumn("f", "producer_id", String.class);
        hBaseTableSource.addColumn("f", "producer_position", String.class);
        hBaseTableSource.addColumn("f", "benefit_type", String.class);
        hBaseTableSource.addColumn("f", "fee_type", String.class);
        hBaseTableSource.addColumn("f", "charge_mode", String.class);
        hBaseTableSource.addColumn("f", "prem_list_id", String.class);
        hBaseTableSource.addColumn("f", "comm_item_id", String.class);
        hBaseTableSource.addColumn("f", "policy_chg_id", String.class);
        hBaseTableSource.addColumn("f", "exchange_rate", String.class);
        hBaseTableSource.addColumn("f", "related_id", String.class);
        hBaseTableSource.addColumn("f", "insured_id", String.class);
        hBaseTableSource.addColumn("f", "pol_production_value", String.class);
        hBaseTableSource.addColumn("f", "pol_currency_id", String.class);
        hBaseTableSource.addColumn("f", "hierarchy_exist_indi", String.class);
        hBaseTableSource.addColumn("f", "team_prod_indi", String.class);
        hBaseTableSource.addColumn("f", "personal_prod", String.class);
        hBaseTableSource.addColumn("f", "period_type", String.class);
        hBaseTableSource.addColumn("f", "x_months", String.class);
        hBaseTableSource.addColumn("f", "team_prod_level", String.class);
        hBaseTableSource.addColumn("f", "is_add_ridr", String.class);


        tableEnv.registerFunction("t_lookup_detail_id", hBaseTableSource.getLookupFunction(new String[]{"detail_id"}));
    }
}
