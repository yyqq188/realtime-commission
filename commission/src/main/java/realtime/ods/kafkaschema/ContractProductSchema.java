package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ContractMaster;
import realtime.ods.entity.ContractProduct;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:33
 */
public class ContractProductSchema implements DeserializationSchema<ContractProduct>, SerializationSchema<ContractProduct> {

    @SneakyThrows
    @Override
    public ContractProduct deserialize(byte[] message) throws IOException {
        ContractProduct contractProduct = JSON.parseObject(message, ContractProduct.class);
        Field[] fs = contractProduct.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(contractProduct) || f.get(contractProduct).equals("")) {
                f.set(contractProduct, "weizhi");
            }
        }
        return contractProduct;
    }

    @Override
    public boolean isEndOfStream(ContractProduct contractProduct) {
        return false;
    }

    @Override
    public byte[] serialize(ContractProduct element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<ContractProduct> getProducedType() {
        return TypeInformation.of(ContractProduct.class);
    }
}
