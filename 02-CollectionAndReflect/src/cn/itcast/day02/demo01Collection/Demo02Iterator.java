package cn.itcast.day02.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {

    public static void main(String[] args) {
        Collection<String >  coll = new ArrayList<>();
        coll.add("科比");
        coll.add("麦迪");
        coll.add("汤姆森");
        coll.add("韦德");
        coll.add("杜兰特");
        coll.add("乔丹");

        Iterator it = coll.iterator();

        while (it.hasNext()){                 //使用while循环
            Object n = it.next();
            System.out.println(n);
        }
        System.out.println("-----------");

        for (Iterator<String > it2 =coll.iterator();it2.hasNext();) {            //使用for循环
            String s = it2.next();
            System.out.println(s);
        }

    }

}
