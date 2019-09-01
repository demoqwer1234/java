package cn.itcast.Jdbctemplate;

import cn.itcast.domain.Emp;
import cn.itcast.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;
import java.util.Map;

//Junit 单元测试
public class JdbcTemplatedemo02 {

    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     *  修改1号数据的salary为1000
     */
    @Test
    public void test1(){
        String sql = "update emp set salary = 1000 where id = ?";
        int count = template.update(sql, 1001);
        System.out.println(count);
    }

    /**
     *  添加一条记录
     */
    @Test
    public void test2(){
        String sql = "insert into emp(id,ename,job_id,salary) values(1015,'迪丽热巴',2,8000)";
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 删除刚添加的记录
     */
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 查询id 为1 的记录， 将其封装为map集合
     *      查询的结果集 长度只能是1
     *      将列名作为key， 将值作为value,封装为map集合
     */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);// queryForMap ()查询结果， 将结果封装为map集合
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=1000.00, bonus=null, dept_id=20}
    }

    /**
     * 查询所有记录， 将其封装为List集合
     *      将每一条记录封装为map集合， 再将map集合装载到list集合中
     */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

  /*  *//**
     * 查询所有记录， 将其封为Emp对象的list集合
     *//*
    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String name = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                //创建emp对象 , 并赋值
                emp  = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
*/
    /**
     * 查询所有记录， 将其封为Emp对象的list集合
     *      一般使用BeanPropertyRowMapper实现类， 可以完成数据到JavaBean的自动封装
     */
    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 查询总记录数
     *      queryForObject（）查询结果， 将结果封装为对象
     *          一般用于聚合函数的查询
     */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long count = template.queryForObject(sql,long.class);
        System.out.println(count);
    }
}






















