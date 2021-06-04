package realtime.ods.exec;

import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.util.Collector;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * author: yhl
 * time: 2021/6/3 下午1:57
 * company: gientech
 */
public class MapKafkaStringRichFlatMapFunction<String> extends RichFlatMapFunction<String,String> {

    @Override
    public void flatMap(String value, Collector<String> out) throws Exception {
        Class<? extends Type> aaa = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1].getClass();
        System.out.println(aaa);

    }
}
