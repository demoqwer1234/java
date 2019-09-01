package cn.itcast.day03.demo03HashSetSavePerson;

import java.util.HashSet;

public class DemoPerson {

    public static void main(String[] args) {
        Person p1  = new Person("小美女",18);
        Person p2  = new Person("小美女",18);
        Person p3  = new Person("小美女",19);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1 == p2);               //比较两个对象得地址值
        System.out.println(p1.equals(p2));           //没有重写，比较两个对象得地址值  ，重写后比较两个得内容值

        System.out.println(set);
    }

}
