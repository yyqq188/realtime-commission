package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import realtime.ods.entity.PolicyInterview;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:08
 */
public class PolicyInterviewSchema implements DeserializationSchema<PolicyInterview>, SerializationSchema<PolicyInterview> {

    @SneakyThrows
    @Override
    public PolicyInterview deserialize(byte[] message) throws IOException {
        PolicyInterview policyInterview = JSON.parseObject(message, PolicyInterview.class);
        Field[] fs = policyInterview.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(policyInterview) || f.get(policyInterview).equals("")) {
                f.set(policyInterview, "weizhi");
            }
        }
        return policyInterview;
    }
    @Override
    public boolean isEndOfStream(PolicyInterview policyInterview) {
        return false;
    }

    @Override
    public byte[] serialize(PolicyInterview policyInterview) {
        return policyInterview.toString().getBytes();
    }

    @Override
    public TypeInformation<PolicyInterview> getProducedType() {
        return TypeInformation.of(PolicyInterview.class);
    }
}
