package cn.itcast.day05.demo01;

import java.awt.print.PrinterAbortException;

public class Demo02Throw {

    public static void main(String[] args) {
        //int  [] arr = new int  [10];
        int  [] arr = null;

        int index = 0;
        int  ele = method(arr, index);
        System.out.println(ele);
    }

    public  static int   method( int  [] arr, int index) {
        if(arr == null){
            throw new NullPointerException("传递的数组为空");              //异常的抛出
        }
        if(index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        int  ele = arr[index];
        return ele;
    }

}
