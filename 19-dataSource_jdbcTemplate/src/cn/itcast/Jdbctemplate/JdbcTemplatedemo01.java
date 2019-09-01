package cn.itcast.Jdbctemplate;

import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;


/*
    JDBC temPlate 简单入门
 */
public class JdbcTemplatedemo01 {

    public static void main(String[] args) {
        //1.创建Template对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update bank set balance = 5000 where id = ?";
        //2.调用方法
        int count = template.update(sql,3);
        System.out.println(count);
    }

}
