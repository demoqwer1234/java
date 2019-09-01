package cn.itcast.day18.jdbc;

import java.sql.*;

public class JDBCdemo06executeQuery {

    public static void main(String[] args) {
        Connection con =null;
        Statement sta =null;
        ResultSet rs= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from bank";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            sta = con.createStatement();

            /**
             *  ResultSet   结果集对象， 封装查询结果
             *      使用executeQuery() 来实现
             *          查询数据
             */
            rs = sta.executeQuery(sql);
            // 通过循环判断
            //让游标下移一行
            while(rs.next()){              // 假如移到底则返回false

                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id +"--" +name+"---"+balance);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

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
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
