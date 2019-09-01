package cn.itcast.day03.demo05Collection;

import java.util.ArrayList;
import java.util.Collections;

public class demo05Collection {

    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();

        Collections.addAll( list,"a","b","c","d","e");         //添加多个元素
        System.out.println(list);

        Collections.shuffle(list);                                        //打乱顺序
        System.out.println(list);

    }

}
