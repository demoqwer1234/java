package cn.itcast.day13.demo01Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01LIst {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","张无忌","周芷若","张三丰","李四");

        ArrayList<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3){
                listA.add(s);
            }
        }

        for (String A : listA) {
            System.out.println(A);
        }
    }

}
