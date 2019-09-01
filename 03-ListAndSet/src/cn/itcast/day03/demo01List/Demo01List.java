package cn.itcast.day03.demo01List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {

    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("aaa");
        System.out.println(list);

        //指定位置添加元素
        list.add(3,"ooo");
        System.out.println(list);

        //移除指定位置的元素，返回被移除得元素
        String  removeB = list.remove(1);
        System.out.println(removeB);
        System.out.println(list);

        //用指定元素替换集合中指定位置元素，返回更新前得元素
        String setZ = list.set(4, "zzz");
        System.out.println(setZ);
        System.out.println(list);

        //遍历
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}
