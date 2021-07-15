package demo;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;

/**
 * author: yhl
 * time: 2021/6/16 上午10:35
 * company: gientech
 */
public class Demo1 {


    public static void main(String[] args) throws SqlParseException {
        String sql = "select id,name,age from table1 where id < 10";
        SqlParser.Config config = SqlParser.configBuilder().setLex(Lex.MYSQL).build();
        SqlParser sqlParser = SqlParser.create(sql, config);
        SqlNode sqlNode = sqlParser.parseStmt();
        if(SqlKind.SELECT.equals(sqlNode.getKind())){
            SqlSelect sqlSelect = (SqlSelect) sqlNode;
            SqlNode from = sqlSelect.getFrom();
            SqlNode where = sqlSelect.getWhere();
            SqlNodeList selectList = sqlSelect.getSelectList();
            if(SqlKind.IDENTIFIER.equals(from.getKind())){
                System.out.println(from.toString());
            }

            if(SqlKind.LESS_THAN.equals(where.getKind())){
                System.out.println(where.toString());
            }

            SqlBasicCall sqlBasicCall = (SqlBasicCall) where;
            for(SqlNode sqlNode1: sqlBasicCall.operands){
                if(SqlKind.LITERAL.equals(sqlNode1.getKind())){
                    System.out.println(sqlNode1.toString());
                }
            }

            sqlSelect.getSelectList().forEach(x -> {
                if(SqlKind.IDENTIFIER.equals(x.getKind())){
                    System.out.println(x.toString());
                }
            });
        }


    }
}
