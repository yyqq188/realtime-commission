package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ProductionDetail;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:34
 */
public class ProductionDetailSchema implements DeserializationSchema<ProductionDetail>, SerializationSchema<ProductionDetail> {

    @SneakyThrows
    @Override
    public ProductionDetail deserialize(byte[] message) throws IOException {
       ProductionDetail productionDetail = JSON.parseObject(message, ProductionDetail.class);
        Field[] fs = productionDetail.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(productionDetail) || f.get(productionDetail).equals("")) {
                f.set(productionDetail, "weizhi");
            }
        }
        return productionDetail;
    }

    @Override
    public boolean isEndOfStream(ProductionDetail productionDetail) {
        return false;
    }

    @Override
    public byte[] serialize(ProductionDetail productionDetail) {
        return productionDetail.toString().getBytes();
    }

    @Override
    public TypeInformation<ProductionDetail> getProducedType() {
        return TypeInformation.of(ProductionDetail.class);
    }
}