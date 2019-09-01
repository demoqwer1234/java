package cn.itcast.day18.jdbc;

import cn.itcast.day18.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  通过事务管理， 处理转账异常
 *
 */
public class JDBCdemo10Commit {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 =null;
        PreparedStatement pstmt2 =  null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);     //开启事务， 传参为false

            //2.定义
            String sql1 = "update bank set balance = balance -? where id = ?";  //张三-500
            String sql2 = "update bank set balance = balance +? where id = ?";  //李四+500
            //3.获取sql执行对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            //4.设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);

            //5.执行sql
            /**
             *
             * executeUpdate（）
             *      执行DML（insert， update， delete）语句
             *      DDL (create, drop , alter) 语句
             */
             pstmt1.executeUpdate();
             //手动制造异常
            int i = 1/0;

             pstmt2.executeUpdate();
             //提交事务， 执行成功
             conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                //执行失败了， 回滚事务
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }


}
