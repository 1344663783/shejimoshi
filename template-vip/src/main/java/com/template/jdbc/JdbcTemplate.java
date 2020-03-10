package com.template.jdbc;

import org.omg.CORBA.TRANSACTION_MODE;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName JdbcTemplate
 * @Description TODO
 * @Author zxx
 * @Date 2020/3/10 14:11
 * @Version 1.0
 **/
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){

        try{
            //1 获取连接
            Connection conn = this.getConnection();

            //2 创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);

            //3 执行语句集
            ResultSet rs= this.executeQuery(pstm,values);

            //4 处理结果集
            List<?> result = this.paresResultSet(rs,rowMapper);

            //5 关闭结果集
            this.closeResultSet(rs);

            //6 关闭语句集
            this.closePreparedStatement(pstm);

            //7 关闭连接
            this.closeConnection(conn);

            return result;
        }catch (Exception e){

        }

        return null;
    }

    private void closeConnection(Connection conn) {

    }

    private void closePreparedStatement(PreparedStatement pstm) {

    }

    private void closeResultSet(ResultSet rs) {

    }

    private List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) {
        return null;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) {
        return null;
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
