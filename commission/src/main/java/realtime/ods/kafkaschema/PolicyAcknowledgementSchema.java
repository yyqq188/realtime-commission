package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.PolicyAcknowledgement;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:53
 */
public class PolicyAcknowledgementSchema implements DeserializationSchema<PolicyAcknowledgement>, SerializationSchema<PolicyAcknowledgement> {

    @SneakyThrows
    @Override
    public PolicyAcknowledgement deserialize(byte[] message) throws IOException {
        PolicyAcknowledgement policyAcknowledgement = JSON.parseObject(message, PolicyAcknowledgement.class);
        Field[] fs = policyAcknowledgement.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(policyAcknowledgement) || f.get(policyAcknowledgement).equals("")) {
                f.set(policyAcknowledgement, "weizhi");
            }
        }

        return policyAcknowledgement;
    }

    @Override
    public boolean isEndOfStream(PolicyAcknowledgement policyAcknowledgement) {
        return false;
    }

    @Override
    public byte[] serialize(PolicyAcknowledgement policyAcknowledgement) {
        return policyAcknowledgement.toString().getBytes();
    }

    @Override
    public TypeInformation<PolicyAcknowledgement> getProducedType() {
        return TypeInformation.of(PolicyAcknowledgement.class);
    }
}
