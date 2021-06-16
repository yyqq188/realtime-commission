package realtime.ods.kafkaschema;

import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import com.alibaba.fastjson.JSON;
import realtime.ods.entity.ContractMaster;
import realtime.ods.entity.ContractMasterOther;
import scala.xml.Elem;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:06
 */
public class ContractMasterOtherSchema implements DeserializationSchema<ContractMasterOther>, SerializationSchema<ContractMasterOther> {

    @SneakyThrows
    @Override
    public ContractMasterOther deserialize(byte[] message) throws IOException {
        ContractMasterOther contractMasterOther = JSON.parseObject(message, ContractMasterOther.class);
        Field[] fs = contractMasterOther.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(contractMasterOther) || f.get(contractMasterOther).equals("")) {
               f.set(contractMasterOther, "weizhi");
            }
        }
        return contractMasterOther;
    }

    @Override
    public boolean isEndOfStream(ContractMasterOther contractMasterOther) {
        return false;
    }

    @Override
    public byte[] serialize(ContractMasterOther element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<ContractMasterOther> getProducedType() {
        return TypeInformation.of(ContractMasterOther.class);
    }
}
