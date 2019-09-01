package cn.itcast.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo03Pridicate_Or {

    public static boolean check(String s  , Predicate<String > pre1,Predicate<String > pre2){
        return pre1.or(pre2).test(s);
        //return pre1.test(s) || pre2.test(s);
    }

    public static void main(String[] args) {
        String str ="bcdefg";
        boolean b = check(str,(s)->{
            return s.length() >5;
        },(s)->{
            return s.contains("a");         //判断字符串中是否包含a
        });
        System.out.println(b);
    }

}
