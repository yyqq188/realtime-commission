package realtime.producter.mysqlproducter;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.async.ResultFuture;
import org.apache.flink.streaming.api.functions.async.RichAsyncFunction;

/**
 * author: yhl
 * time: 2021/7/14 下午5:06
 * company: gientech
 */
public class MysqlAsyncRequest extends RichAsyncFunction {
    @Override
    public void open(Configuration parameters) throws Exception {
        super.open(parameters);
    }

    @Override
    public void asyncInvoke(Object input, ResultFuture resultFuture) throws Exception {

    }

    @Override
    public void timeout(Object input, ResultFuture resultFuture) throws Exception {

    }
}
