package cn.itcast.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {

    /*
        predicate接口中，返回值boolean

          test()方法用于场景判断
     */
    public static boolean method(String str , Predicate<String > pre){
        return pre.test(str);
    }

    public static void main(String[] args) {
        String str = "abcde";
        boolean b = method(str,(t)->{
           return t.length()>5;            //判断字符串的长度是否 >5
        });
        System.out.println(b);
    }

}
