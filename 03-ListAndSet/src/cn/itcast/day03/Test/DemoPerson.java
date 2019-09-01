package cn.itcast.day03.Test;

import java.util.HashSet;

public class DemoPerson {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("张三" ,20);
        Person p2 = new Person("李四" ,19);
        Person p3 = new Person("王五" ,21);
        Person p4 = new Person("王五" ,21);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);


        for (Person p : set){
            System.out.println(p);
        }


    }

}
