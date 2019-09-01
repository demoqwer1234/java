package cn.itcast.day04.Demo02Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        method02();
    }

    private static void method02() {

        Map<Person, String>  map = new HashMap<>();
        map.put(new Person("张三" ,18),"北京");
        map.put(new Person("李四" ,19),"上海");
        map.put(new Person("王五" ,20),"广州");
        map.put(new Person("张三" ,18),"北京");

        Set<Map.Entry<Person, String>> set = map.entrySet();

        Iterator<Map.Entry<Person, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Person, String> entry = it.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"==" +value);
        }

    }

    private static void method01() {

        Map<Person, String>  map = new HashMap<>();
        map.put(new Person("张三" ,18),"北京");
        map.put(new Person("李四" ,19),"上海");
        map.put(new Person("王五" ,20),"广州");
        map.put(new Person("张三" ,18),"北京");

        Set<Person> set = map.keySet();

        for (Person key :set){
            String value = map.get(key);
            System.out.println(key+" == "+value);
        }

        Iterator<Person> it = set.iterator();
        while (it.hasNext()){
            Person key = it.next();
            String value = map.get(key);
            System.out.println(key +"== " +value);
        }

    }
}
