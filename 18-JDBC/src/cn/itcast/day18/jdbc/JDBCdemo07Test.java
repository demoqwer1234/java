package cn.itcast.day18.jdbc;

/**
 *  定义一个方法， 查询emp表数据 ，将其封装为对象， 然后装载集合， 再返回
 */

import cn.itcast.day18.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCdemo07Test {

    public static void main(String[] args) {
        JDBCdemo07Test jd = new JDBCdemo07Test();
        List<Emp> list = jd.findAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
        System.out.println(list.size());

    }

    /**
     * 查询所有emp表的对象
     * @return
     */
    public List<Emp> findAll(){
        Connection conn =null;
        Statement stat =null;
        ResultSet rs =null;
        List<Emp> list = new ArrayList<Emp>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql  = "select *  FROM emp";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            stat = conn.createStatement();
             rs = stat.executeQuery(sql);

             //遍历结果集， 封装对象， 装载集合
            Emp emp =null;
            while(rs.next()){
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

                //装载集合
                list.add(emp);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (rs != null){
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
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

}

















