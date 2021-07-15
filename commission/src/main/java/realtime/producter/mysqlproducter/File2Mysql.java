package realtime.producter.mysqlproducter;

import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcExecutionOptions;
import org.apache.flink.connector.jdbc.JdbcSink;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import realtime.ods.entity.ContractBene;

import java.lang.reflect.Field;

/**
 * author: yhl
 * time: 2021/7/14 下午5:03
 * company: gientech
 */
public class File2Mysql {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        SingleOutputStreamOperator<ContractBene> source = env.readTextFile(Contrant.PREM_ARAPCsvPath)
                .map(data -> {
                    String[] datas = data.replace("\"", "").split(",");
                    Field[] fields = ContractBene.class.getDeclaredFields();
                    ContractBene contractBene = new ContractBene();
                    for (int i = 0; i < fields.length - 1; i++) {
                        Field f = fields[i];
                        f.setAccessible(true);
                        f.set(contractBene, datas[i]);
                    }
                    System.out.println(contractBene);
                    return contractBene;
                });
        source.addSink(
                JdbcSink.sink(
                        "insert into contractBene (list_id, party_id, policy_id, insurant) values (?, ?, ?, ?)",
                        (statement, book) -> {
                            statement.setString(1, book.list_id);
                            statement.setString(2, book.party_id);
                            statement.setString(3, book.policy_id);
                            statement.setString(4, book.insurant);
                        },
                        JdbcExecutionOptions.builder()
                                .withBatchSize(100)
                                .withBatchIntervalMs(2000)
                                .withMaxRetries(5)
                                .build(),
                        new JdbcConnectionOptions.JdbcConnectionOptionsBuilder()
                                .withUrl("jdbc:mysql://localhost:3306/test")
                                .withDriverName("com.mysql.jdbc.Driver")
                                .withUsername("root")
                                .withPassword("juhuacha188")
                                .build()
                ));
        env.execute("a");
    }
}
