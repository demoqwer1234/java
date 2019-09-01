package cn.itcast.day13.Test02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    取用前几个：limit、跳过前几个：skip
        问题：
        已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
        1、取出前2个元素并在控制台打印输出。
        2、取出后2个元素并在控制台打印输出。

 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
       // List.of(list,)
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");

        list.stream().limit(2).forEach(name-> System.out.println(name));


         list.stream().skip(5).forEach(name-> System.out.println(name));

    }
}
