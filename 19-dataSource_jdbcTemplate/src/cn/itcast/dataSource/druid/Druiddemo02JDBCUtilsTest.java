package cn.itcast.dataSource.druid;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  使用新的工具类
 */
public class Druiddemo02JDBCUtilsTest {

    public static void main(String[] args) {
        /**
         *  完成添加操作， 给bank表添加一条记录
         */
        Connection conn =null;
        PreparedStatement pstmt =null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into  bank values (null, ?,?)";
            //获取连接对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,"张三");
            pstmt.setDouble(2,3000);
            //执行
            int i = pstmt.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }

}
