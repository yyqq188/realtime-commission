package demo.demo1;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserPos;

/**
 * author: yhl
 * time: 2021/6/16 下午1:21
 * company: gientech
 */
public class ParseDemo {
    public static void main(String[] args) {
        String sql = "select * from orders o join gdsInfo g on o.gdsId=g.gdsId";
        SqlParser.Config config = SqlParser.configBuilder().setLex(Lex.MYSQL).build();
        SqlParser sqlParser = SqlParser.create(sql, config);
        SqlSelect sqlSelect = null;
        try{
            sqlSelect = (SqlSelect) sqlParser.parseStmt();
        }catch (Exception e){
            e.printStackTrace();
        }
        SqlNode sqlFrom = sqlSelect.getFrom();
        boolean isSideJoin = false;
        String leftTable = "";
        String rightTable = "";
        String newTableName = "";
        SqlJoin sqlJoin = null;
        if(SqlKind.JOIN.equals(sqlFrom.getKind())){
            sqlJoin = (SqlJoin) sqlFrom;
            SqlNode left = sqlJoin.getLeft();
            SqlNode right = sqlJoin.getRight();
            isSideJoin = true;
            leftTable = parserTableName(left);
            rightTable = parserTableName(right);

        }
        if(isSideJoin){
            newTableName = leftTable+""+rightTable;
            SqlParserPos pos = new SqlParserPos(0,0);
            SqlIdentifier sqlIdentifier = new SqlIdentifier(newTableName,pos);
            sqlSelect.setFrom(sqlIdentifier);

        }

        System.out.println(sqlSelect.toString());

    }

    private static String parserTableName(SqlNode node){
        if(SqlKind.AS.equals(node.getKind())){
            SqlBasicCall sqlBasicCall = (SqlBasicCall) node;
            return sqlBasicCall.operands[1].toString();
        }

        return ((SqlIdentifier) node).toString();
    }


}
