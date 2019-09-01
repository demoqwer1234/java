package cn.itcast.day04.demo01Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {

    public static void main(String[] args) {
        method04();
    }

    private static void method04() {
        //containsKey() 判断集合中是否包含指定的键

        Map<Integer, String > map = new HashMap<>();
        map.put(1,"赵丽颖");               //（key, value）
        map.put(2,"范冰冰");
        map.put(3,"李晨");
        map.put(4,"钟汉良");
        System.out.println(map);

        boolean b = map.containsKey(5);
        System.out.println(b);
        System.out.println(map);

    }

    private static void method03() {
        //map.get()   //获取map集合中对应得位置

        Map<String,Integer  > map = new HashMap<>();
        map.put("赵丽颖",1);               //（key, value）
        map.put("范冰冰",2);
        map.put("李晨",3);
        map.put("钟汉良",3);
        System.out.println(map);

        Integer res = map.get("范冰冰");
        System.out.println(res);
        System.out.println(map);
    }

    private static void method02() {
        //map.remove  移除元素

        Map<String,Integer  > map = new HashMap<>();
        map.put("赵丽颖",1);               //（key, value）
        map.put("范冰冰",2);
        map.put("李晨",3);
        map.put("钟汉良",3);

        System.out.println(map);
        Integer re = map.remove("钟汉良");    //传入得时k值
        System.out.println(re);
        System.out.println(map);


    }

    private static void method01() {
        //map.put()添加元素

        Map<String,String  > map = new HashMap<>();
        map.put("赵丽颖","张三");
        String s1 = map.put("杨幂", "张三");
        String s2 = map.put("赵丽颖", "张三");       //返回value值
        map.put("范冰冰","李四");
        map.put("李晨","王五");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(map);

    }

}
