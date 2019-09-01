package cn.itcast.day12.demo06Predicate;

import java.util.function.Predicate;

public class Demo04Predicate_nagate {

    public static boolean checkString(String s, Predicate<String> pre){
       // return  !pre.test(s);   //否定
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String str ="abcde";
        boolean b =checkString(str,(s)->{
            return s.length() > 5;
        });
        System.out.println(b);
    }

}
