package demo.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * author: yhl
 * time: 2021/6/16 下午1:36
 * company: gientech
 */
public class ParseCreate {

    public static final String REG_CREATE="(?i)create\\s+table\\s+(\\S+)\\s*\\((.+)\\)\\s*with\\s*\\((.+)\\)";

    public static void main(String[] args) throws Exception{
        String createSql="CREATE TABLE orders(" + "    orderId varchar," + "    gdsId varchar,"
                + "    orderTime varchar" + " )WITH(" + "    type = 'kafka',"
                + "    kafka.bootstrap.servers = 'localhost:9092'," + "    kafka.topic = 'topic1',"
                + "    kafka.group.id = 'gId1'," + "    sourcedatatype ='json'" + " );";
        Pattern pattern= Pattern.compile(REG_CREATE);

        TableInfo tableInfo = new TableInfo();
        Matcher matcher = pattern.matcher(createSql);
        if(matcher.find()){
            tableInfo.setTableName(matcher.group(1));
            String fieldStr = matcher.group(2);
            String propsStr = matcher.group(3);
            tableInfo.setFieldsInfo(parseFields(fieldStr));
            tableInfo.setProps(parseProps(propsStr));

            Boolean tof = Boolean.valueOf(tableInfo.getProps().getProperty("isSideTable","false"));
            tableInfo.setSideTable(tof);
//            Class<?>[] types = new Class<?>[]{};
//            for(Class<?> type:parseFields(fieldStr).values()){
//
//            }
//            tableInfo.setFieldsType(.);
//            System.out.println();
            System.out.println(tableInfo);
        }
    }

    public static Map<String,String> parseFields(String fieldsStr){
        Map<String,String> fieldsInfo = new HashMap<>();
        String[] fieldsArr = fieldsStr.split(",");
        for(String field:fieldsArr){
            String[] fieldInfo = field.trim().split(" ");
            fieldsInfo.put(fieldInfo[0],fieldInfo[1]);
        }

        return fieldsInfo;

    }

    public static Properties parseProps(String propsStr){
        Properties properties = new Properties();
        String[] properArr = propsStr.split(",");
        for(String prop:properArr){
            String[] propInfo = prop.trim().split("=");
            properties.setProperty(propInfo[0],propInfo[1]);
        }
        return properties;
    }
}
