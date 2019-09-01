package cn.itcast.day18.jdbc;

/**
 * jdbc添加bank表记录
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo02 {

    public static void main(String[] args) {
        Statement sta = null;
        Connection con = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //定义Sql
            String sql = "insert into bank values(null,'王五',3000)";
            //3.获取connection对象
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            //4.获取执行Sql的对象， Statment
            sta = con.createStatement();
            //5.执行sql
            int i = sta.executeUpdate(sql);    //影响的行数
            System.out.println(i);
            //5.处理的结果
            if(i>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            // 避免出现空指针异常
            if(sta != null){
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
