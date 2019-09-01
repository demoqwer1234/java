package cn.itcast.day02.Test1;

import java.util.ArrayList;

public class Demo02 {

    public static void main(String[] args) {
        int [] arr = {10,20, 30,40,50,60};
        ArrayList<Integer> list = method(arr);
        System.out.println(list);
    }

    private static ArrayList<Integer> method(int [] arr) {
        ArrayList<Integer> list =new ArrayList<>();
        for (int a :arr){
            list.add(a);
        }
        return list;
    }

}
