package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ContractBene;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * author: yhl
 * time: 2021/6/4 下午3:15
 * company: gientech
 */
public class ContractBeneSchema implements DeserializationSchema<ContractBene>, SerializationSchema<ContractBene> {
    @SneakyThrows
    @Override
    public ContractBene deserialize(byte[] message) throws IOException {
        ContractBene contractBene = JSON.parseObject(message,ContractBene.class);
        Field[] fs = contractBene.getClass().getDeclaredFields();
        for(Field f:fs){
           if(null == f.get(contractBene) || f.get(contractBene).equals("")){
               f.set(contractBene,"weizhi");
           }
        }

        return contractBene;
    }

    @Override
    public boolean isEndOfStream(ContractBene nextElement) {
        return false;
    }

    @Override
    public byte[] serialize(ContractBene element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<ContractBene> getProducedType() {
        return TypeInformation.of(ContractBene.class);
    }
}
