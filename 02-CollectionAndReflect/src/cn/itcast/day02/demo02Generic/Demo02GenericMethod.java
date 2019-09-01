package cn.itcast.day02.demo02Generic;

public class Demo02GenericMethod {

    public static void main(String[] args) {
        GenericMethod m = new GenericMethod();
        m.method1(12);
        m.method1("张三");
        m.method1(8.8);
        m.method1(true);
        System.out.println("===============");

        //静态方法通过类名  方法名（参数）直接使用
        GenericMethod.method2(54);
        GenericMethod.method2("王五");

    }

}
