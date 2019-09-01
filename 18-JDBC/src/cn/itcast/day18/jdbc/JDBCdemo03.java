package cn.itcast.day18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  jdbc修改bank表
 */

public class JDBCdemo03 {

    public static void main(String[] args)  {
        Connection con = null;
        Statement sta = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "UPDATE  bank set balance= 3000 where id = 3";
            //获取connection对象
             con = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //获取sql的执行对象
             sta = con.createStatement();
            //执行sql
            int i = sta.executeUpdate(sql);
            System.out.println(i);
            if (i>0 ){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if (sta != null){
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
