package cn.itcast.day04.demo03;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String ,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("b","b");
        linked.put("c","c");
        linked.put("a","d");            //key键相同，取代前面的相同
        System.out.println(linked);

    }

}
