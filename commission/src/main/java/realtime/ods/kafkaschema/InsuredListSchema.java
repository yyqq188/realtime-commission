package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.InsuredList;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:47
 */
public class InsuredListSchema implements DeserializationSchema<InsuredList>, SerializationSchema<InsuredList> {

    @SneakyThrows
    @Override
    public InsuredList deserialize(byte[] message) throws IOException {
        InsuredList insuredList = JSON.parseObject(message, InsuredList.class);
        Field[] fs = insuredList.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(insuredList) || f.get(insuredList).equals("")) {
                f.set(insuredList, "weizhi");
            }
        }
        return insuredList;
    }

    @Override
    public boolean isEndOfStream(InsuredList insuredList) {
        return false;
    }

    @Override
    public byte[] serialize(InsuredList insuredList) {
        return insuredList.toString().getBytes();
    }

    @Override
    public TypeInformation<InsuredList> getProducedType() {
        return TypeInformation.of(InsuredList.class);
    }
}
