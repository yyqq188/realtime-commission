package realtime.utils;

import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * author: yhl
 * time: 2021/5/26 下午2:54
 * company: gientech
 */
public class SyncHbaseUtil {
    private static Configuration conf;
    private static Connection connection;
    private static Admin admin;
    private static ParameterTool parameterTool;

    public SyncHbaseUtil() {
        try{
            parameterTool = ParameterTool.fromPropertiesFile(
                    getClass().getResourceAsStream("/params.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //获得连接
    public static void getHbaseConnection(){
        try{
            conf = HBaseConfiguration.create();
            conf.set(HConstants.ZOOKEEPER_QUORUM,parameterTool.get("zkServer"));
            conf.set(HConstants.ZOOKEEPER_CLIENT_PORT,parameterTool.get("zkPort"));
            conf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
            conf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);

            connection = ConnectionFactory.createConnection(conf);
            admin = connection.getAdmin();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
    //关闭连接
    public static void close(){
        try{
            if(connection != null){
                connection.close();
            }
            if(admin != null){
                admin.close();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void createTable(String nameSpace,String tableName,String family,byte[][] splitKeys){
        try {
            TableName tName= TableName.valueOf(nameSpace,tableName);
            if (admin.tableExists(tName)) {
                admin.disableTable(tName);
                admin.deleteTable(tName);
            }else {

                HTableDescriptor tableDesc=new HTableDescriptor(tName);

                HColumnDescriptor colDesc=new HColumnDescriptor(family.getBytes());
                colDesc.setMaxVersions(1);//1个版本
                colDesc.setInMemory(true);//开启内存缓存

                tableDesc.addFamily(colDesc);
                admin.createTable(tableDesc);//直接创建表
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //
    public static void deleteQualifierValue(String tableName,String rowKey,String family,String qualifier){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));
            Delete delete=new Delete(rowKey.getBytes());
            delete.addColumn(family.getBytes(), qualifier.getBytes());
            table.delete(delete);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //删除一行
    public static void deleteRow(String tableName,String rowKey,String family){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));
            Delete delete=new Delete(rowKey.getBytes());
            delete.addFamily(family.getBytes());
            table.delete(delete);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //添加一行
    public static void addOneRecord(String tableName,String rowKey,String family,String qualifier,String value){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));

            Put put = new Put(Bytes.toBytes(rowKey));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),Bytes.toBytes(value));
            table.put(put);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //添加多条记录
    public static void addMoreRecord(String tableName, String family, String qualifier, List<String> rowList, String value){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));

            List<Put> puts=new ArrayList<>();
            Put put = null;
            for (int i = 0; i < rowList.size(); i++) {
                put = new Put(Bytes.toBytes(rowList.get(i)));
                put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),Bytes.toBytes(value));
                puts.add(put);
            }
            table.put(puts);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //查询rowkey下某一列的值
    public static String getValue(String tableName,String rowKey,String family,String qualifier){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));

            Get get = new Get(rowKey.getBytes());
            get.addColumn(family.getBytes(), qualifier.getBytes());//返回指定列族、列名，避免rowKey下所有数据

            Result rs = table.get(get);
            Cell cell = rs.getColumnLatestCell(family.getBytes(), qualifier.getBytes());

            String value = null;
            if (cell!=null) {
                value = Bytes.toString(CellUtil.cloneValue(cell));
            }

            return value;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static List<Cell> getRowCells(String tableName,String rowKey,String family){
        Table table = null;
        try {
            table = connection.getTable(TableName.valueOf(tableName));
            Get get = new Get(rowKey.getBytes());
            get.addFamily(family.getBytes());

            Result rs = table.get(get);

            List<Cell> cellList =   rs.listCells();
            return cellList;
        } catch (IOException e) {
            if (table!=null){
                try {
                    table.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }



}
