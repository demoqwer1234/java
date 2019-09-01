package cn.itcast.day02.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo01Collection {

    public static void main(String[] args) {                  //学习顶层接口，使用底层接口
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);

        //add
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        coll.add("田七");
        System.out.println(coll);

        //remove  移除指定元素
        boolean b1 = coll.remove("张三");
        System.out.println("b1: " + b1);
        System.out.println(coll);

        //contains是否包含指定对象
        boolean b2 = coll.contains("张三");
        System.out.println(b2);
        boolean b3 = coll.contains("田七");
        System.out.println(b3);


        //isEmpty()   判断是否为空
        boolean b4 = coll.isEmpty();
        System.out.println(b4);

        //size  返回集合中的个数
        int size = coll.size();
        System.out.println(size);

        //toArray 把集合中的元素，存储到数组中
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        //clear  //清空集合
        coll.clear();
        System.out.println(coll);
        boolean b5 = coll.isEmpty();
        System.out.println(b5);

    }

}
