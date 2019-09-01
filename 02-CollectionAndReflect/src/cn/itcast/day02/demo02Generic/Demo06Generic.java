package cn.itcast.day02.demo02Generic;

/*
通配符遍历打印   ？
 */


import java.util.ArrayList;
import java.util.Iterator;

public class Demo06Generic {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(22);
        list1.add(33);

        ArrayList<String > list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");

        method(list1);
        method(list2);
    }

    private static void method(ArrayList<?> list) {
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
