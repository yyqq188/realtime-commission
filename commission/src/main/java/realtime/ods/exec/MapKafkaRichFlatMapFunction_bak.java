package realtime.ods.exec;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.util.Collector;
import realtime.ods.entity.ContractBene;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * author: yhl
 * time: 2021/6/1 下午2:45
 * company: gientech
 */
@Slf4j
/**
 * 这里是把json结构的数据转化为java对象
 */
public class MapKafkaRichFlatMapFunction_bak<T> extends RichFlatMapFunction<String, T> {
    @Override
    public void flatMap(String value, Collector<T> collector) {
        try{
            if(value != null && ! "".equals(value)){
                Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
                System.out.println(value);
                T out = JSONObject.parseObject(value,tClass);
                System.out.println(out);
            collector.collect(out);
            }
        }catch (Exception e){
            log.error("发生的异常是 " + e);
        }
    }
}
