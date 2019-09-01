package cn.itcast.day18.jdbc;


import cn.itcast.day18.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习：
 *      1.通过键盘输入用户名和密码
 *      2.判断是否登陆成功
 */

public class JDBCdemo09UtilsTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        JDBCdemo09UtilsTest jd = new JDBCdemo09UtilsTest();
        boolean login = jd.login(username, password);
        if (login == true){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }

    public boolean login(String username, String password){
        if (username == null || password == null){
            return false;
        }
        Connection conn =null;
        ResultSet rs =null;
        PreparedStatement pstmt =null;
        try {
            //调用JDBCUtils 对象中的静态方法
             conn = JDBCUtils.getConnection();
            //String sql = "select * FROM  users where username = '"+username+"' and PASSWORD = '"+password+"'";   // 容易出现sql注入问题
            String sql = "select * FROM  users where username = ? and PASSWORD = ?";    //防止出现sql注入安全问题
             pstmt = conn.prepareStatement(sql);
             //给问号赋值
             pstmt.setString(1,username);
             pstmt.setString(2,password);
            //5.获取sql的对象 statement ,z执行
            rs = pstmt.executeQuery();

            return rs.next();              //因为next（）方法返回一个布尔类型数据

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }

        return false;
    }
}
