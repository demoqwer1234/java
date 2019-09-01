package cn.itcast.day13.demo01Stream;

import java.util.ArrayList;
import java.util.Collections;
/*
    采用Stream流使代码更简洁
 */

public class Demo02Stream {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","张无忌","周芷若","张三丰","李四");

        //用Stream流
        list.stream()
                .filter(name->name.length() == 3)      //filter方法中， 所用得接口为Predicate 判断接口
                .filter(name->name.startsWith("张"))
                .forEach(name-> System.out.println(name));          //forEach()方法中所用得接口为Comsumer 消费型接口
    }

}
