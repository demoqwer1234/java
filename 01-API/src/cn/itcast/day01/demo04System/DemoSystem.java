package cn.itcast.day01.demo04System;


import java.util.Arrays;

public class DemoSystem {

    public static void main(String[] args) {
        method();
        method2();
    }

    public static void method(){
        long a = System.currentTimeMillis();
        System.out.println(a);                   //返回以毫秒为单位得当前时间

        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println( "程序工耗时" +(e - a));
    }

    public static void method2(){
        int []src  = {1,2,3,4,5};
        int []dest = {9,10,11,12,13};
        System.out.println("复制前为:" + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后： " + Arrays.toString(dest));
    }

}
