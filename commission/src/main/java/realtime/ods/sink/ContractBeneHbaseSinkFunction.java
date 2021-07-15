package realtime.ods.sink;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.ContractBene;

/**
 * author: yhl
 * time: 2021/6/1 下午4:06
 * company: gientech
 */
public class ContractBeneHbaseSinkFunction extends AbstractHbaseSinkFunction<ContractBene>{
    public ContractBeneHbaseSinkFunction(){
        tableName = "t_contract_bene";
    }
    @Override
    public void handle(ContractBene value, Context context, HTable table) throws Exception {
        System.out.println("======================================================");
        Put put = new Put(Bytes.toBytes(value.getList_id()));
        put.addColumn(cf, Bytes.toBytes("party_id"), Bytes.toBytes(value.getParty_id()));
        put.addColumn(cf, Bytes.toBytes("policy_id"), Bytes.toBytes(value.getPolicy_id()));
        put.addColumn(cf, Bytes.toBytes("insurant"), Bytes.toBytes(value.getInsurant()));
        put.addColumn(cf, Bytes.toBytes("bene_type"), Bytes.toBytes(value.getBene_type()));
        put.addColumn(cf, Bytes.toBytes("share_order"), Bytes.toBytes(value.getShare_order()));
        put.addColumn(cf, Bytes.toBytes("share_rate"), Bytes.toBytes(value.getShare_rate()));
        put.addColumn(cf, Bytes.toBytes("designation"), Bytes.toBytes(value.getDesignation()));
        put.addColumn(cf, Bytes.toBytes("legal_bene"), Bytes.toBytes(value.getLegal_bene()));
        put.addColumn(cf, Bytes.toBytes("address_id"), Bytes.toBytes(value.getAddress_id()));
        put.addColumn(cf, Bytes.toBytes("telephone"), Bytes.toBytes(value.getTelephone()));
        put.addColumn(cf, Bytes.toBytes("mobile_tel"), Bytes.toBytes(value.getMobile_tel()));
        put.addColumn(cf, Bytes.toBytes("active_status"), Bytes.toBytes(value.getActive_status()));
        put.addColumn(cf, Bytes.toBytes("ems_version"), Bytes.toBytes(value.getEms_version()));
        put.addColumn(cf, Bytes.toBytes("inserted_by"), Bytes.toBytes(value.getInserted_by()));
        put.addColumn(cf, Bytes.toBytes("updated_by"), Bytes.toBytes(value.getUpdated_by()));
        put.addColumn(cf, Bytes.toBytes("insert_time"), Bytes.toBytes(value.getInsert_time()));
        put.addColumn(cf, Bytes.toBytes("update_time"), Bytes.toBytes(value.getUpdate_time()));
        put.addColumn(cf, Bytes.toBytes("insert_timestamp"), Bytes.toBytes(value.getInsert_timestamp()));
        put.addColumn(cf, Bytes.toBytes("update_timestamp"), Bytes.toBytes(value.getUpdate_timestamp()));
        put.addColumn(cf, Bytes.toBytes("irrevocable_indi"), Bytes.toBytes(value.getIrrevocable_indi()));
        put.addColumn(cf, Bytes.toBytes("is_same_address"), Bytes.toBytes(value.getIs_same_address()));
        put.addColumn(cf, Bytes.toBytes("job_company"), Bytes.toBytes(value.getJob_company()));
        put.addColumn(cf, Bytes.toBytes("work_content"), Bytes.toBytes(value.getWork_content()));
        put.addColumn(cf, Bytes.toBytes("usual_address"), Bytes.toBytes(value.getUsual_address()));
        put.addColumn(cf, Bytes.toBytes("income_source"), Bytes.toBytes(value.getIncome_source()));
        put.addColumn(cf, Bytes.toBytes("is_long_term"), Bytes.toBytes(value.getIs_long_term()));
        put.addColumn(cf, Bytes.toBytes("marriage_id"), Bytes.toBytes(value.getMarriage_id()));
        put.addColumn(cf, Bytes.toBytes("certi_type"), Bytes.toBytes(value.getCerti_type()));
        put.addColumn(cf, Bytes.toBytes("certi_code"), Bytes.toBytes(value.getCerti_code()));
        put.addColumn(cf, Bytes.toBytes("is_personal_tax_status"), Bytes.toBytes(value.getIs_personal_tax_status()));
//        put.addColumn(cf, Bytes.toBytes("expiry_date"), Bytes.toBytes(value.getExpiry_date()));

        table.put(put);
    }
}
