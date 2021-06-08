package realtime.ods.exec;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.windowing.ProcessAllWindowFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.flink.util.Collector;
import realtime.ods.entity.result.Result;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * author: yhl
 * time: 2021/6/8 下午2:10
 * company: gientech
 */
public class MyJoinFunction {
    public void handle(SingleOutputStreamOperator streamOperator,
                       StreamExecutionEnvironment env,
                       StreamTableEnvironment tableEnv){

        Table queryResult = tableEnv.sqlQuery("");
        DataStream<Tuple2<Boolean, Result>> stream = tableEnv.toRetractStream(queryResult, Result.class);

        stream.windowAll(TumblingProcessingTimeWindows.of(Time.seconds(10)))
                .process(
                        new ProcessAllWindowFunction<Tuple2<Boolean, Result>,
                        List<Result>,
                        TimeWindow>() {
                    @Override
                    public void process(Context context,
                                        Iterable<Tuple2<Boolean, Result>> values,
                                        Collector<List<Result>> out) throws Exception {
                        Iterator<Tuple2<Boolean, Result>> iterator = values.iterator();
                        Map<String,Result> maps = Maps.newHashMap();
                        while(iterator.hasNext()){
                            Tuple2<Boolean, Result> next = iterator.next();
                            if(next.getField(0)){
                                Result item = next.getField(1);
                                //这样map的结果表示为唯一键相同时的最新数据
                                maps.put("aaa",item);
                            }
                        }

                        out.collect(Lists.newArrayList(maps.values()));
                    }
                }).setParallelism(1); //为了防止并发写入数据库时的数据错误
//                .addSink(new OtherSink());


    }
}
