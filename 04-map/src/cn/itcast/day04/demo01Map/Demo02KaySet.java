package cn.itcast.day04.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KaySet {

    public static void main(String[] args) {

        //使用keySet对map集合进行遍历

        Map<String,Integer  > map = new HashMap<>();
        map.put("赵丽颖",165);               //（key, value）
        map.put("范冰冰",168);
        map.put("李晨",175);
        map.put("钟汉良",185);
        System.out.println(map);

        Set<String> set = map.keySet();

        //使用迭代器遍历
        Iterator it =  set.iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            Integer value = map.get(key);                 //通过key索引找到value值
            System.out.println(key + " = " +value);
        }
        System.out.println("==============");

        //使用增强for遍历
        for(String key : set){
            Integer value = map.get(key);
            System.out.println(key + " = "+value);
        }

    }

}
