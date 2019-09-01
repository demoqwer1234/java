package cn.itcast.day03.Test;

import java.util.Collections;
import java.util.LinkedList;

public class Demo01Linkedlist {

    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);

       // list.addFirst("zzz");         // list.push("fff");和addfirst一样
        //list.addLast("zzz");
        System.out.println(list);

        String first = list.getFirst();
        String last = list.getLast();
        String pop = list.pop();           //和getfirst一样
        System.out.println(first);
        System.out.println(last);
        System.out.println(pop);

        list.push("fff");
        System.out.println(list);
    }

}
