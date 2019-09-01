package cn.itcast.day05.demoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {

        //一次捕获，多次处理


        //一次捕获，一次处理
        try{
            int [] arr = {1,2,3};
           // System.out.println(arr[3]);

            List<Integer> list = new ArrayList<>();
            Collections.addAll(list,4,5,6);
            System.out.println(list.get(3));
        }catch (Exception e){
            System.out.println(e);
        }


    }

}
