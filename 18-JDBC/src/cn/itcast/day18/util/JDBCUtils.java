package cn.itcast.day18.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    /**
     * JDBC工具类
     */
    //只有静态的变量， 才能被静态代码块， 才能被静态对象访问
    private static   String url;
    private static String user;
    private static String password;
    private static String driver;

    /**
     * 文件读取， 只需要读取一次即可拿到这些值， 使用静态代码块
     */
    static {
        // 读取资源文件， 获取值
        try {
            //1.创建Proprities集合类
            Properties pro = new Properties();
            //获取src路径下的文件的方式--->ClassLoader 类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res  = classLoader.getResource("jdbc.properties");
            String path = res.getPath();

            //2. 加载文件
            //pro.load(new FileReader("D:\\IdeaProjects\\Advanced-code\\18-JDBC\\src\\jdbc.properties"));
            pro.load(new FileReader(path));
            //3. 获取数据， 赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");

            //4.注册驱动
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取连接对象
     * @return 连接对象
     */
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url,user,password);
    }

    /**
     *释放资源
     */
    public static void close(Statement stat, Connection con ){
        if (stat != null){
            try {
                stat.close();
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

    public static void close( ResultSet rs, Statement stat, Connection con  ){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null){
            try {
                stat.close();
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
