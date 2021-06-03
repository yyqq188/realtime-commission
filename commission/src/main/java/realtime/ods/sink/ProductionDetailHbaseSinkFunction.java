package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ProductionDetail;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/2 15:43
 */
public class ProductionDetailHbaseSinkFunction extends AbstractHbaseSinkFunction<ProductionDetail> {
    public ProductionDetailHbaseSinkFunction() {
        tableName = "t_production_detail";
    }

    @Override
    public void handle(ProductionDetail value, Context context, HTable table) throws Exception {
        Put put = new Put(Bytes.toBytes(value.getDetail_id()));
        put.addColumn(cf, Bytes.toBytes("production_id"), Bytes.toBytes(value.getProduction_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("item_id"), Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("product_id"), Bytes.toBytes(value.getProduct_id()));
        put.addColumn(cf, Bytes.toBytes("policy_year"), Bytes.toBytes(value.getPolicy_year()));
        put.addColumn(cf, Bytes.toBytes("production_value"), Bytes.toBytes(value.getProduction_value()));
        put.addColumn(cf, Bytes.toBytes("effective_date"), Bytes.toBytes(value.getEffective_date()));
        put.addColumn(cf, Bytes.toBytes("hierarchy_date"), Bytes.toBytes(value.getHierarchy_date()));
        put.addColumn(cf, Bytes.toBytes("producer_id"), Bytes.toBytes(value.getProducer_id()));
        put.addColumn(cf, Bytes.toBytes("producer_position"), Bytes.toBytes(value.getProducer_position()));
        put.addColumn(cf, Bytes.toBytes("benefit_type"), Bytes.toBytes(value.getBenefit_type()));
        put.addColumn(cf, Bytes.toBytes("fee_type"), Bytes.toBytes(value.getFee_type()));
        put.addColumn(cf, Bytes.toBytes("charge_mode"), Bytes.toBytes(value.getCharge_mode()));
        put.addColumn(cf, Bytes.toBytes("prem_list_id"), Bytes.toBytes(value.getPrem_list_id()));
        put.addColumn(cf, Bytes.toBytes("comm_item_id"), Bytes.toBytes(value.getComm_item_id()));
        put.addColumn(cf, Bytes.toBytes("policy_chg_id"), Bytes.toBytes(value.getPolicy_chg_id()));
        put.addColumn(cf, Bytes.toBytes("exchange_rate"), Bytes.toBytes(value.getExchange_rate()));
        put.addColumn(cf, Bytes.toBytes("related_id"), Bytes.toBytes(value.getRelated_id()));
        put.addColumn(cf, Bytes.toBytes("insured_id"), Bytes.toBytes(value.getInsured_id()));
        put.addColumn(cf, Bytes.toBytes("pol_production_value"), Bytes.toBytes(value.getPol_production_value()));
        put.addColumn(cf, Bytes.toBytes("pol_currency_id"), Bytes.toBytes(value.getPol_currency_id()));
        put.addColumn(cf, Bytes.toBytes("hierarchy_exist_indi"), Bytes.toBytes(value.getHierarchy_exist_indi()));
        put.addColumn(cf, Bytes.toBytes("team_prod_indi"), Bytes.toBytes(value.getTeam_prod_indi()));
        put.addColumn(cf, Bytes.toBytes("personal_prod"), Bytes.toBytes(value.getPersonal_prod()));
        put.addColumn(cf, Bytes.toBytes("period_type"), Bytes.toBytes(value.getPeriod_type()));
        put.addColumn(cf, Bytes.toBytes("x_months"), Bytes.toBytes(value.getX_months()));
        put.addColumn(cf, Bytes.toBytes("team_prod_level"), Bytes.toBytes(value.getTeam_prod_level()));
        put.addColumn(cf, Bytes.toBytes("is_add_ridr"), Bytes.toBytes(value.getIs_add_ridr()));



        table.put(put);
    }
}
