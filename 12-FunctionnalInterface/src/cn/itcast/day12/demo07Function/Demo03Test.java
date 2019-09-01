package cn.itcast.day12.demo07Function;

import java.util.function.Function;

public class Demo03Test {

    public static void change(String str , Function<String , Integer> fun){
        Integer in = fun.apply(str);
        System.out.println(in);                       //120
    }

    public static void main(String[] args) {
        String str = "迪丽热巴,20";
        change(str, (String s)->{
            String age = s.split(",")[1];      //对str进行qiege， 得到一个字符数组， 获取字符第二个， 也就是age
            int i = Integer.parseInt(age);            //把String类型的转化为Integer类型
            return i+100;
        });
    }

}
