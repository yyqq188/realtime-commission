package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.BenefitInsured;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * author: yhl
 * time: 2021/6/8 下午1:37
 * company: gientech
 */
public class BenefitInsuredSchema implements DeserializationSchema<BenefitInsured>, SerializationSchema<BenefitInsured> {
    @SneakyThrows
    @Override
    public BenefitInsured deserialize(byte[] message) throws IOException {
        BenefitInsured benefitInsured = JSON.parseObject(message,BenefitInsured.class);
        Field[] fields = benefitInsured.getClass().getDeclaredFields();
        for(Field field:fields){
            if(null == field || field.equals("")){
                field.set(benefitInsured,"weizhi");
            }
        }
        return benefitInsured;
    }

    @Override
    public boolean isEndOfStream(BenefitInsured nextElement) {
        return false;
    }

    @Override
    public byte[] serialize(BenefitInsured element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<BenefitInsured> getProducedType() {
        return TypeInformation.of(BenefitInsured.class);
    }
}
