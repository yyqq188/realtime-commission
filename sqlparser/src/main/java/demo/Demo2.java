package demo;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParser;


/**
 * author: yhl
 * time: 2021/6/16 上午11:22
 * company: gientech
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        String sql = "select sum(amount) from orders";
        SqlParser.Config config = SqlParser.configBuilder().setLex(Lex.MYSQL).build();
        SqlParser sqlParser = SqlParser.create(sql, config);
        SqlNode sqlNode = sqlParser.parseStmt();
        if(SqlKind.SELECT.equals(sqlNode.getKind())){
            SqlSelect sqlSelect = (SqlSelect) sqlNode;

            sqlSelect.getSelectList().forEach(x ->{
                System.out.println(x.getKind());
                if(SqlKind.OTHER_FUNCTION.equals(x.getKind())){
                    SqlBasicCall sqlBasicCall = (SqlBasicCall) x;
                    System.out.println(sqlBasicCall.operands[0]);
                }
            });
        }
    }
}
