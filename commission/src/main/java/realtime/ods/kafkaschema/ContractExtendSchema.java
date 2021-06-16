package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import realtime.ods.entity.ContractExtend;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 14:30
 */
public class ContractExtendSchema implements DeserializationSchema<ContractExtend>, SerializationSchema<ContractExtend> {
    @SneakyThrows
    @Override
    public ContractExtend deserialize(byte[] message) throws IOException {
        ContractExtend contractExtend = JSON.parseObject(message,ContractExtend.class);
        Field[] fs =contractExtend.getClass().getDeclaredFields();
        for(Field f:fs){
            if(null == f.get(contractExtend) || f.get(contractExtend).equals("")){
                f.set(contractExtend,"weizhi");
            }
        }

        return contractExtend;
    }

    @Override
    public boolean isEndOfStream(ContractExtend nextElement) {
        return false;
    }

    @Override
    public byte[] serialize(ContractExtend element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<ContractExtend> getProducedType() {
        return TypeInformation.of(ContractExtend.class);
    }
}
