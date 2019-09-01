package cn.itcast.dataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0demo02 {

    public static void main(String[] args) throws SQLException {
        C3P0demo02 c = new C3P0demo02();
       // c.testNameCofing();
        c.testCofingMax();
    }

    public  void testCofingMax() throws SQLException {
        //1.1获取datasource ，
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        for (int i = 0; i <= 10; i++) {                            // An attempt by a client to checkout a Connection has timed out.
            Connection conn = cpds.getConnection();
            System.out.println(conn+"  "  +i);
        }
    }

    public void testNameCofing() throws SQLException {
        //1.1获取datasource ， 指定连接对象
        ComboPooledDataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接
        for (int i = 0; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn+"  "+i);
        }
    }
}
