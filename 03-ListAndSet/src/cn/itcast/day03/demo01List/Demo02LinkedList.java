package cn.itcast.day03.demo01List;

import java.util.LinkedList;

public class Demo02LinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        method2(list);
    }

    private static void method3(LinkedList<String> list) {
        //移除第一和最后一个元素
       // String first = list.removeFirst();
        String first = list.pop();               //等效于removeFirst（） 移除第一个元素
        String last = list.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(list);

    }

    private static void method2(LinkedList<String> list) {
       // list.clear();                                  //清空
        if(!list.isEmpty()){
            //返回链表第一个和最后一个元素
            String first = list.getFirst();
            String last = list.getLast();
            System.out.println(first);
            System.out.println(last);
        }



    }

    private static void method1(LinkedList<String > list) {
        //在链表第一和最后添加元素
          list.addFirst("111");
          list.addLast("000");
          list.push("999");             //等效于addFirst(), 在第一个位置添加元素
        System.out.println(list);
    }

}
