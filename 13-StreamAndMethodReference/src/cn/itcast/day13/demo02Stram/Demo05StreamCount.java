package cn.itcast.day13.demo02Stram;

import java.util.ArrayList;

/*
    用来统计Stream流中的元素个数
        long count（）
        count（）方法是一个终结方法，返回值是一个long类型的整数
        所以不能继续调用其他方法了

 */
public class Demo05StreamCount {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        long count = list.stream().count();
        System.out.println(count);
    }
}
