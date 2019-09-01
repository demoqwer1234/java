package cn.itcast.day14.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/*
    简单测试框架
        当主方法执行后， 会自动检测 测试方法 的BUG
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建一个Calculator对象
        Calculator c= new Calculator();
        //2.获取字节码文件
        Class<Calculator> cls = Calculator.class;
        //3.获取所有方法
        Method[] methods = cls.getMethods();

        BufferedWriter bw = new BufferedWriter(new FileWriter("14-基础加强\\Bug.txt"));
        int num = 0; //出现Bug的次数

        for (Method method : methods) {
        //4.判断执行方法上， 是否有check注解
            if (method.isAnnotationPresent(Check.class)){
        //5有， 执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常
                    bw.write(method.getName()+"出现了异常");
                    bw.newLine();
                    bw.write("异常名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------");
                    bw.newLine();
                    num++;
                }
            }
        }
        bw.write("共出现了"+num+"次BUG");
        bw.flush();
        bw.close();
    }
}
