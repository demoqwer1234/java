package cn.itcast.day03.demo05Collection;

import java.util.ArrayList;
import java.util.Collections;

public class demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 4,2,3,1);
        Collections.sort(list01);
        System.out.println(list01);            //默认升序

        ArrayList<String > list02 = new ArrayList<>();
        Collections.addAll(list02, "a","c","d","b");
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 19);
        Person p3 = new Person("王五", 17);

        Collections.addAll(list,p1,p2,p3);
        System.out.println(list);

        Collections.sort(list);                  //定义person类，   完成排序
        System.out.println(list);


    }

}
