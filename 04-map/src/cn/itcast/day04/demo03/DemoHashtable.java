package cn.itcast.day04.demo03;

import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashtable {

    public static void main(String[] args) {
        HashMap<String ,String > map = new HashMap<>();
        map.put("a",null);
        map.put(null,"a");
        map.put(null,null);
        map.put("a","b");
        System.out.println(map);


        Hashtable<String ,String > table = new Hashtable<>();//NullPointerException  空指针异常
        table.put("a",null);
        table.put(null,"b");
        table.put("a","a");

    }

}
