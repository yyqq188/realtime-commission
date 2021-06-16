package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ProductCommision;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.MessageDigest;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:29
 */
public class ProductCommisionSchema implements DeserializationSchema<ProductCommision>, SerializationSchema<ProductCommision> {

    @SneakyThrows
    @Override
    public ProductCommision deserialize(byte[] message) throws IOException {
        ProductCommision productCommision = JSON.parseObject(message, ProductCommision.class);
        Field[] fs = productCommision.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(productCommision) || f.get(productCommision).equals("")) {
                f.set(productCommision,"weizhi");
            }
        }

        return productCommision;
    }

    @Override
    public boolean isEndOfStream(ProductCommision productCommision) {
        return false;
    }

    @Override
    public byte[] serialize(ProductCommision productCommision) {
        return productCommision.toString().getBytes();
    }

    @Override
    public TypeInformation<ProductCommision> getProducedType() {
        return TypeInformation.of(ProductCommision.class);
    }
}
