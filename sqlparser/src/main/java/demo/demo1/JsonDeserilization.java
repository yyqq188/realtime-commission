package demo.demo1;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.RowTypeInfo;
import org.apache.flink.types.Row;

import java.io.IOException;
import java.util.Map;

/**
 * author: yhl
 * time: 2021/6/16 下午1:55
 * company: gientech
 */
public class JsonDeserilization implements DeserializationSchema<Row> {
    private Map<String,String> fields;
    private RowTypeInfo rowTypeInfo;
    private TypeInformation<?>[] typeInformations;
    private String[] fieldNames;

    public JsonDeserilization(String[] fieldNames,TypeInformation<?>[] typeInformations){
        this.fieldNames = fieldNames;
        this.typeInformations = typeInformations;
        this.rowTypeInfo = new RowTypeInfo(typeInformations,fieldNames);
    }



    @Override
    public Row deserialize(byte[] message) throws IOException {
        String msg = new String(message);
        Row row = new Row(fieldNames.length);
        JSONObject jsonObject = JSONObject.parseObject(msg);
        for(int i =0;i<fieldNames.length ;i++){
            if(typeInformations[i].getTypeClass() == String.class){
                row.setField(i,jsonObject.getString(fieldNames[i]));

            }
            if(typeInformations[i].getTypeClass() == Integer.class){
                row.setField(i,jsonObject.getInteger(fieldNames[i]));
            }

        }
        return row;
    }

    @Override
    public boolean isEndOfStream(Row nextElement) {
        return false;
    }

    @Override
    public TypeInformation<Row> getProducedType() {
        return null;
    }
}
