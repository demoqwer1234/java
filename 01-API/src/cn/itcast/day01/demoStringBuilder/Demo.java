package cn.itcast.day01.demoStringBuilder;

public class Demo {

    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        bu.append("张三").append(454).append('t').append(4.1);
        System.out.println(bu);
    }

}
