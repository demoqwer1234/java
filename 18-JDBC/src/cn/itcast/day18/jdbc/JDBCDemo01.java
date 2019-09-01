package cn.itcast.day18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo01 {

    public static void main(String[] args) throws Exception {
        //1. 导入驱动Jar 包
        //2.注册驱动                              一定要add as library
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
//        Connection con = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");     // 可以简写， 假如是本机数据库
        //4. 定义Sql语句
        String sql = "update bank set balance = 1000 where id= 1";
        //5.获取sql的对象 statement
        Statement sta = con.createStatement();
        //6.执行sql
        /**
         *
         * executeUpdate（）
         *      执行DML（insert， update， delete）语句
         *      DDL (create, drop , alter) 语句
         */
        int i = sta.executeUpdate(sql);
        //7.处理结果
        System.out.println(i);
        //8.释放资源
        con.close();
        sta.close();
    }

}
