package cn.itcast.day18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  执行DDL语句
 *         不常用jdbc操作DDL， 简单了解
 */

public class JDBCdemo05 {
    public static void main(String[] args) {
        Connection con = null;
        Statement sta = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "create table tt(name varchar(10), age  int )";   // 创建tt 表
//            String sql = "drop table  if exists tt";                         //删除表
             con = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
             sta = con.createStatement();
            int count = sta.executeUpdate(sql);
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (sta !=null){
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
