package cn.itcast.day02.demo01Collection;

import java.util.ArrayList;

public class Demo03Foreach {

    //增强for循环只能用来遍历数组或者集合

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        ArrayList<String > list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String s :list){
            System.out.println(s);
        }
    }

    private static void method2() {
        int [] arr = {1,2,3,4,5,6,7};
        for (int a :arr){
            System.out.println(a);
        }
    }
}
