package realtime.ods.kafkaschema;

import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import realtime.ods.entity.Agent;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * author: yhl
 * time: 2021/6/8 下午1:28
 * company: gientech
 */
public class AgentSchema implements DeserializationSchema<Agent> , SerializationSchema<Agent> {
    @SneakyThrows
    @Override
    public Agent deserialize(byte[] message) throws IOException {
        Agent agent  = JSON.parseObject(message, Agent.class);
        Field[] fields = agent.getClass().getDeclaredFields();
        for(Field field:fields){
            if(null == field || field.equals("")){
                field.set(agent,"weizhi");
            }
        }

        return agent;
    }

    @Override
    public boolean isEndOfStream(Agent nextElement) {
        return false;
    }

    @Override
    public byte[] serialize(Agent element) {
        return element.toString().getBytes();
    }

    @Override
    public TypeInformation<Agent> getProducedType() {
        return TypeInformation.of(Agent.class);
    }
}
