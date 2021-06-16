package realtime.ods.sink.result;

import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;
import realtime.ods.entity.BenefitInsured;
import realtime.ods.entity.result.Result;
import realtime.ods.sink.AbstractHbaseSinkFunction;

/**
 * author: yhl
 * time: 2021/6/9 上午10:31
 * company: gientech
 */
public class ResultHbaseSinkFunction extends AbstractHbaseSinkFunction<Result> {
    public ResultHbaseSinkFunction(){
        tableName = "t_result";
    }
    @Override
    public void handle(Result value, Context context, HTable table) throws Exception {

        Put put = new Put(Bytes.toBytes(value.getPolicy_id()));

        put.addColumn(cf, Bytes.toBytes("item_id"), Bytes.toBytes(value.getItem_id()));
        put.addColumn(cf, Bytes.toBytes("discount_num"), Bytes.toBytes(value.discount_num));

        table.put(put);
    }
}
