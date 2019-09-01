package cn.itcast.day03.Test;

import java.util.ArrayList;
import java.util.Collections;
/*
sort    排序
 */
public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,    33,11,77,55);
        System.out.println(list);

        Collections.sort(list);         //排序
        System.out.println(list);

    }
}
