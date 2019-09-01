package cn.itcast.day02.Test1;

import java.util.ArrayList;

public class Demo04Contains {

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        String s = "aaa";
        boolean b = method(list, s);
        System.out.println(b);
    }

    private static boolean method(ArrayList<String> list , String s) {
        if(list.contains(s)){                   //判断s是否在集合中存在,存在返回true，不存在返回false
            return true;
        }
        return false;
    }

}
