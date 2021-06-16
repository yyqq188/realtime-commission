package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.PolicyHolder;
import realtime.ods.entity.PolicyProducerRole;


import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:13
 */
public class PolicyProducerRoleSchema implements DeserializationSchema<PolicyProducerRole>, SerializationSchema<PolicyProducerRole> {

    @SneakyThrows
    @Override
    public PolicyProducerRole deserialize(byte[] message) throws IOException {
        PolicyProducerRole policyProducerRole = JSON.parseObject(message, PolicyProducerRole.class);
        Field[] fs = policyProducerRole.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(policyProducerRole) || f.get(policyProducerRole).equals("")) {
                f.set(policyProducerRole, "weizhi");
            }
        }
        return policyProducerRole;
    }

    @Override
    public boolean isEndOfStream(PolicyProducerRole policyProducerRole) {
        return false;
    }

    @Override
    public byte[] serialize(PolicyProducerRole policyProducerRole) {
        return policyProducerRole.toString().getBytes();
    }

    @Override
    public TypeInformation<PolicyProducerRole> getProducedType() {
        return TypeInformation.of(PolicyProducerRole.class);
    }
}
