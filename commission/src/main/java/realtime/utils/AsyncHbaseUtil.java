package realtime.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.NamespaceDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * author: yhl
 * time: 2021/5/17 下午1:10
 * company: gientech
 *
 * Hbase 异步的增删改查
 */
@Slf4j
public class AsyncHbaseUtil {
    private static ParameterTool parameterTool = null;
    public AsyncHbaseUtil() throws IOException {
        this.parameterTool = ParameterTool.fromPropertiesFile(
                AsyncHbaseUtil.class.getResourceAsStream("/params.properties"));

    }
    public static  Configuration getHbaseConf(){
        Configuration conf = HBaseConfiguration.create();
        conf.set(HConstants.ZOOKEEPER_QUORUM,parameterTool.get("zkServer"));
        conf.set(HConstants.ZOOKEEPER_CLIENT_PORT,parameterTool.get("zkPort"));
        conf.setInt(HConstants.HBASE_CLIENT_OPERATION_TIMEOUT,30000);
        conf.setInt(HConstants.HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD,30000);
        return conf;

    }


//    //获取异步连接
//    public static AsyncAdmin asyncHbaseConn() throws Exception{
//        Configuration conf = getHbaseConf();
//
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        //设置超时时长
//        AsyncConnection conn = aconn.get(10, TimeUnit.SECONDS);
//
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        AsyncAdmin admin = conn.getAdmin(pool);
//
//        log.info("创建异步连接成功");
//        return admin;
//
//    }
//    //创建namespace
//    public static  void createNameSpace(String nameSpace) throws Exception {
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//        NamespaceDescriptor namespaceDescriptor = NamespaceDescriptor.create(nameSpace).build();
//        conn.getAdmin().createNamespace(namespaceDescriptor).get();
//        log.info("创建命名空间成功");
//    }
//
//    //删除namespace
//    public static void deleteNameSpace(String nameSpace) throws Exception{
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//        conn.getAdmin().deleteNamespace(nameSpace).get();
//        log.info("删除命名空间成功");
//    }
//
//
//
//    //异步创建表
//    public static void asyncCreateTable(String namespace, String tableName, String FamilyName) throws Exception{
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//
//        TableDescriptorBuilder tbbuilder = TableDescriptorBuilder.newBuilder(TableName.valueOf(namespace+":"+tableName));
//        ColumnFamilyDescriptorBuilder columnFamilyDescriptorBuilder =
//                ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes(FamilyName));
//        columnFamilyDescriptorBuilder.setMaxVersions(10); //设置最大版本数
//        ColumnFamilyDescriptor cfDescriptor = columnFamilyDescriptorBuilder.build();
//        tbbuilder.setColumnFamily(cfDescriptor);
//        TableDescriptor tableDescriptor = tbbuilder.build();
//        //异步创建表并指定分区
//        conn.getAdmin()
//                .createTable(tableDescriptor, new byte[][]{Bytes.toBytes("10"),
//                        Bytes.toBytes("20"),Bytes.toBytes("30")}).get();
//        log.info("异步创建表成功");
//    }
//
//    //异步删除表
//    public static void asyncDeleteTable(String namespace,String tableName) throws Exception{
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//
//
//        //禁用要删除的表并设置超时时长
//        conn.getAdmin().disableTable(TableName.valueOf(namespace + ":" + tableName)).get();
//        conn.getAdmin().deleteTable(TableName.valueOf(namespace + ":"+tableName)).get();
//        log.info("异步删除表成功");
//
//    }
//    //异步查询单条数据
//    public static String asyncGet(String namespace,String tableName,String rowKey,String family,String column) throws Exception{
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//
//        Get get = new Get(Bytes.toBytes(rowKey));
//        get.addColumn(Bytes.toBytes(family),Bytes.toBytes(column));
//        CompletableFuture<Result> resultCompletableFuture = conn.getTable(TableName.valueOf(namespace + ":" + tableName)).get(get);
//        Result result = resultCompletableFuture.get();
//
//        log.info(Bytes.toString(result.value()));
//        return Bytes.toString(result.value());
//
//    }
//    //异步插入hbase
//    public static void asyncPutOne(String data,String namespace,String tableName,String family) throws Exception{
//            Configuration conf = getHbaseConf();
//            CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//            AsyncConnection conn = aconn.get();
//
//            AsyncTable<AdvancedScanResultConsumer> table = conn.getTable(TableName.valueOf(namespace + ":" + tableName));
//            table.put(
//                    new Put(Bytes.toBytes(data)).addColumn(Bytes.toBytes(family),Bytes.toBytes(String.format("%sC",data)),
//                            Bytes.toBytes(String.format("%sV",data)))).get();
//
//    }
//
//
//    //异步插入一批hbase
//    public static void asyncPut(ArrayList<String> data,String namespace,String tableName,String family) throws Exception{
//        Configuration conf = getHbaseConf();
//        CompletableFuture<AsyncConnection> aconn  =  ConnectionFactory.createAsyncConnection(conf);
//        AsyncConnection conn = aconn.get();
//
//        AsyncTable<AdvancedScanResultConsumer> table = conn.getTable(TableName.valueOf(namespace + ":" + tableName));
//        table.putAll(IntStream.range(0,10).mapToObj(i->
//
//                new Put(Bytes.toBytes(i)).addColumn(Bytes.toBytes(family),Bytes.toBytes(String.format("%dC",i)),
//                        Bytes.toBytes(String.format("%dV",i)))
//
//                ).collect(Collectors.toList())).get();
//
//    }
//
//
//    public static void main(String[] args) throws Exception {
//        AsyncAdmin admin = new AsyncHbaseUtil().asyncHbaseConn();
////        createNameSpace("testns4");
////        deleteNameSpace("testns4");
////        asyncCreateTable("testns3","tab3","f1");
////        asyncDeleteTable("testns3","tab3");
////        asyncGet("testns2","tab2","01","f1","name");
//        asyncPut(null,"testns2","tab2","f1");
//    }



}
