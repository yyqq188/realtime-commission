package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.ContractProduct;
import realtime.ods.entity.Customer;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author zy
 * @version 1.0
 * @description:
 * @date 2021/6/8 15:41
 */
public class CustomerSchema implements DeserializationSchema<Customer>, SerializationSchema<Customer> {

    @SneakyThrows
    @Override
    public Customer deserialize(byte[] message) throws IOException {
        Customer customer = JSON.parseObject(message, Customer.class);
        Field[] fs = customer.getClass().getDeclaredFields();
        for (Field f : fs) {
            if (null == f.get(customer) || f.get(customer).equals("")) {
                f.set(customer, "weizhi");
            }
        }
        return customer;
    }

    @Override
    public boolean isEndOfStream(Customer customer) {
        return false;
    }

    @Override
    public byte[] serialize(Customer element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<Customer> getProducedType() {
        return TypeInformation.of(Customer.class);
    }
}
