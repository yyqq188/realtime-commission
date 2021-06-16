package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import realtime.ods.entity.PremArap;


import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:19
 */
public class PremArapSchema implements DeserializationSchema<PremArap>, SerializationSchema<PremArap> {

    @SneakyThrows
    @Override
    public PremArap deserialize(byte[] message) throws IOException {
        PremArap premArap = JSON.parseObject(message, PremArap.class);
        Field[] fs = premArap.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(premArap) || f.get(premArap).equals("")) {
                f.set(premArap, "weizhi");
            }
        }
        return premArap;
    }

    @Override
    public boolean isEndOfStream(PremArap premArap) {
        return false;
    }

    @Override
    public byte[] serialize(PremArap premArap) {
        return premArap.toString().getBytes();
    }

    @Override
    public TypeInformation<PremArap> getProducedType() {
        return TypeInformation.of(PremArap.class);
    }
}
