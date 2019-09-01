package cn.itcast.dataSource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * druid连接池的基本使用
 */
public class druidDemo01 {

    public static void main(String[] args) throws Exception {

        //1.加载配置文件
        Properties pro = new Properties();
        InputStream is = druidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        //获取连接池对象
        DataSource dds = DruidDataSourceFactory.createDataSource(pro);        //工厂类的连接池
        //获取连接
        Connection conn = dds.getConnection();
        System.out.println(conn);
    }

}
