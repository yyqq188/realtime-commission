package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.PolicyHolder;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:04
 */
public class PolicyHolderSchema implements DeserializationSchema<PolicyHolder>, SerializationSchema<PolicyHolder> {

    @SneakyThrows
    @Override
    public PolicyHolder deserialize(byte[] message) throws IOException {
        PolicyHolder policyHolder = JSON.parseObject(message, PolicyHolder.class);
        Field[] fs = policyHolder.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(policyHolder) || f.get(policyHolder).equals("")) {
                f.set(policyHolder, "weizhi");
            }
        }
        return policyHolder;
    }

    @Override
    public boolean isEndOfStream(PolicyHolder policyHolder) {
        return false;
    }

    @Override
    public byte[] serialize(PolicyHolder policyHolder) {
        return policyHolder.toString().getBytes();
    }

    @Override
    public TypeInformation<PolicyHolder> getProducedType() {
        return TypeInformation.of(PolicyHolder.class);
    }
}
