package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ContractMaster;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 14:43
 */
public class ContractMasterSchema implements DeserializationSchema<ContractMaster>, SerializationSchema<ContractMaster> {
    @SneakyThrows
    @Override
    public ContractMaster deserialize(byte[] message) throws IOException {
        ContractMaster contractMaster = JSON.parseObject(message, ContractMaster.class);
        Field[] fs = contractMaster.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(contractMaster) || f.get(contractMaster).equals("")) {
                f.set(contractMaster, "weizhi");
            }
        }

        return contractMaster;
    }

    @Override
    public boolean isEndOfStream(ContractMaster contractMaster) {
        return false;
    }

    @Override
    public byte[] serialize(ContractMaster element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<ContractMaster> getProducedType() {
        return TypeInformation.of(ContractMaster.class);
    }


}
