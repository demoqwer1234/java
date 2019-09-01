package cn.itcast.day01.demoStringBuilder;

public class Demo02 {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);

        StringBuilder bu = new StringBuilder(str);    //
        bu.append("World");
        System.out.println(bu);

        String s = bu.toString();
        System.out.println(s);

    }

}
