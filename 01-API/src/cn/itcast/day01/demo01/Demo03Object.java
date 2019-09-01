package cn.itcast.day01.demo01;

import java.util.Objects;

public class Demo03Object {

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";

        boolean b = Objects.equals(s1,s2);
        System.out.println(b);
    }
}
