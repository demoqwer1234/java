package cn.itcast.day04.demo03;

import java.util.*;

public class DemoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        Map<Character , Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(map.containsKey(c)){       //containsKey 为一个布尔值数, 返回true 或者false
                Integer value = map.get(c);
                map.put(c,++value);
            }else{                            //假如key 不存在
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();

        Iterator<Map.Entry<Character, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> en = it.next();
            Integer value = en.getValue();
            Character key = en.getKey();
            System.out.println(key + " = " +value);
        }
    }
}
