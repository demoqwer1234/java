package cn.itcast.day02.Test1;

import java.util.ArrayList;

public class Demo03 {

    public static void main(String[] args) {
        ArrayList<Integer > list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        /*
        int[] arr = method(list);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static int [] method( ArrayList<Integer> list) {
        int [] arr= new int[10];
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            arr[i] =a;
        }

        return arr;*/

        Object[] obj = list.toArray();//Object[] toArray()转换成一个Object数组
        for (int  i= 0; i< obj.length; i++){
            System.out.println(obj[i]);
        }

    }

}
