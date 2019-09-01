package cn.itcast.day02.Test1;

import java.util.ArrayList;
import java.util.Collection;
/*
判断是否为空isEmpty
 */
public class DemoCollectionisEmpty {

    public static void main(String[] args) {

        Collection<String > coll =new  ArrayList<>();
        coll.add("aaa");

        boolean b = method(coll);
        System.out.println(b);            //false

        Collection<String > coll01 =new  ArrayList<>();
        boolean b1 = method(coll01);
        System.out.println(b1);          //true
    }

    private static boolean method(Collection<String> s) {
        return s.isEmpty();
    }

}
