package cn.itcast.day04.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
        map集合的第二种遍历方式， 通过entry 方法
 */
public class Demo03Entry {

    public static void main(String[] args) {
        Map<String,Integer  > map = new HashMap<>();
        map.put("赵丽颖",165);               //（key, value）
        map.put("范冰冰",168);
        map.put("李晨",175);
        map.put("钟汉良",185);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //使用迭代器遍历
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String , Integer> entry = (Map.Entry<String, Integer>) it.next();
            String key =entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " +value);
        }
        System.out.println("===================");

        //使用增强for遍历
        for  ( Map.Entry<String ,Integer> entry :set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " +value);
        }

    }

}
