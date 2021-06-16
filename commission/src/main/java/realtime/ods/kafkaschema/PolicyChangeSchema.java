package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.PolicyChange;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:59
 */
public class PolicyChangeSchema implements DeserializationSchema<PolicyChange>, SerializationSchema<PolicyChange> {

    @SneakyThrows
    @Override
    public PolicyChange deserialize(byte[] message) throws IOException {
     PolicyChange policyChange = JSON.parseObject(message, PolicyChange.class);
        Field[] fs = policyChange.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(policyChange) || f.get(policyChange).equals("")) {
                f.set(policyChange, "weizhi");
            }
        }

        return policyChange;
    }

    @Override
    public boolean isEndOfStream(PolicyChange policyChange) {
        return false;
    }

    @Override
    public byte[] serialize(PolicyChange policyChange) {
        return policyChange.toString().getBytes();
    }

    @Override
    public TypeInformation<PolicyChange> getProducedType() {
        return TypeInformation.of(PolicyChange.class);
    }
}
