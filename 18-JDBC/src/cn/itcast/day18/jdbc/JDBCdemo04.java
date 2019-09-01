package cn.itcast.day18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  jdbc删除一组数据  bank表删除记录
 */
public class JDBCdemo04 {

    public static void main(String[] args) {
        Connection con = null;
        Statement sta = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "delete from bank where id = 3";
            //获取connection对象
            con = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //获取sql的执行对象
            sta = con.createStatement();
            //执行sql
            int count = sta.executeUpdate(sql);
            System.out.println(count);
            if (count > 0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
