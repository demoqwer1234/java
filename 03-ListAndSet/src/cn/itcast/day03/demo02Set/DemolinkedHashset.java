package cn.itcast.day03.demo02Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemolinkedHashset {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");
        set.add("aaa");

        System.out.println(set);    //无序

        LinkedHashSet<String > set1 = new LinkedHashSet<>();
        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");
        set1.add("ddd");
        set1.add("eee");
        set1.add("aaa");

        System.out.println(set1);    //有序
    }

}
