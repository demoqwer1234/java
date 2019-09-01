package cn.itcast.day12.demo07Function;

import java.util.function.Function;

public class Demo02Function_andThen {

    private static void change(String s , Function<String , Integer> fun1, Function<Integer, String> fun2){
        String res = fun1.andThen(fun2).apply(s);    //同时使用两个
        System.out.println(res);
    }

    public static void main(String[] args) {
        String s= "100";
        change(s, (String ss)->{
            return  Integer.parseInt(s)+10;    //把字符串转化为Integer
        },(Integer i )->{
            return i+"aa";                    //把Integer转换为字符串
        });

        //使用Lambda优化后
      //  change(s, ( ss)->Integer.parseInt(s)+10,( i )-> i +"aa");
    }

}
