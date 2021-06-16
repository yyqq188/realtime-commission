package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ProductLife;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 16:40
 */
public class ProductLifeSchema implements DeserializationSchema<ProductLife>, SerializationSchema<ProductLife> {


    @SneakyThrows
    @Override
    public ProductLife deserialize(byte[] message) throws IOException {
         ProductLife productLife = JSON.parseObject(message, ProductLife.class);
        Field[] fs = productLife.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(productLife) || f.get(productLife).equals("")) {
                f.set(productLife, "weizhi");
            }
        }

        return productLife;
    }

    @Override
    public boolean isEndOfStream(ProductLife productLife) {
        return false;
    }

    @Override
    public byte[] serialize(ProductLife productLife) {
        return productLife.toString().getBytes();
    }

    @Override
    public TypeInformation<ProductLife> getProducedType() {
        return TypeInformation.of(ProductLife.class);
    }
}
