package cn.itcast.day01.Demotest;

public class demo01 {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);     	//false
        System.out.println(s3.equals(s2));

    }

}
