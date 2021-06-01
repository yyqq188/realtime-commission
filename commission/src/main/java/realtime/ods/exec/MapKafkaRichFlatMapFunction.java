package realtime.ods.exec;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.util.Collector;

import java.lang.reflect.ParameterizedType;

/**
 * author: yhl
 * time: 2021/6/1 下午2:45
 * company: gientech
 */
@Slf4j
public class MapKafkaRichFlatMapFunction<T> extends RichFlatMapFunction<String,T> {

    @Override
    public void flatMap(String value, Collector<T> collector) {

        try{
            if(value != null && ! "".equals(value)){
                Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
                T out = JSONObject.parseObject(value,tClass);
                collector.collect(out);
            }
        }catch (Exception e){
            log.error("发生的异常是 " + e);
        }


    }
}
