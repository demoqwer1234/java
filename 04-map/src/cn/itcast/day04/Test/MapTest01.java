package cn.itcast.day04.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

    public static void main(String[] args) {
        Map<String , String > map = new HashMap<>();
        map.put("张国荣" , "黄家驹");
        map.put("黄晓明" , "李天一");
        map.put("赵丽颖" , "赵子龙");
        map.put("张三" , "黄乖女");

        System.out.println(map);

        map.remove("赵丽颖");
        System.out.println(map);
        System.out.println("===========");

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " + " +value);
        }
        System.out.println("===========");
        for (String key : set){
            String value = map.get(key);
            System.out.println(key+" = " + value);
        }
    }

}
