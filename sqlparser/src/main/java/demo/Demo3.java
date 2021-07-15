package demo;

import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParserPos;

/**
 * author: yhl
 * time: 2021/6/16 下午1:07
 * company: gientech
 */
public class Demo3 {
    public static void main(String[] args) {
        SqlOperator operator = new SqlAsOperator();
        SqlParserPos sqlParserPos = new SqlParserPos(1,1);
        SqlIdentifier name = new SqlIdentifier("order",null,sqlParserPos);
        SqlIdentifier alias = new SqlIdentifier("o",null,sqlParserPos);
        SqlNode[] sqlNodes = new SqlNode[2];
        sqlNodes[0] = name;
        sqlNodes[1] = alias;
        SqlBasicCall  call = (SqlBasicCall)operator.createCall(sqlParserPos, sqlNodes);
        System.out.println(call);
    }
}
