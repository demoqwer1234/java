package cn.itcast.day02.Test1;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoCollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        String s = "ccc";
        int index = method(list, s);
        System.out.println(index);
    }

    private static int  method(ArrayList<String > list , String s) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(s)){
                return i;
            }
        }
        return -1;
    }

}
