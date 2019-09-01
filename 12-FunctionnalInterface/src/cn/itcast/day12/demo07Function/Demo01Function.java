package cn.itcast.day12.demo07Function;

import java.util.function.Function;

public class Demo01Function {

    /*
        Function接口中，最主要的抽象方法，R apply( T t) 根据T的参数获取R的结果
     */

    public static void change(String s , Function<String , Integer> fun){
        Integer in = fun.apply(s);   //自动拆箱，Integer-》 int
        System.out.println(in);
    }

    public static void main(String[] args) {
        String str = "12414";
        change(str,(String s)->{
           return  Integer.parseInt(s);        //把字符串转化为整数
        });
    }
}
