package cn.itcast.day07.demo06Lambda;
/*
有参构造方法
 */

public class Demo {

    public static void main(String[] args) {

        //使用匿名内部类实现
        invokeCalc(20, 30, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用lambda方法简化    有参构造方法
        invokeCalc(120,500,(int a, int b)->{
            return a+b;
        });

        //lambda省略优化
        invokeCalc(120,500,(int a, int b)->a+b);

    }

    private static void invokeCalc(int a, int b, Calculator c) {
        System.out.println(c.calc(a, b));
    }
}
