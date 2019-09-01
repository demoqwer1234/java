package cn.itcast.day12.demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {

    public static Comparator<String> getComparator(){
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();     //按降序排列
            }
        };*/

       /*//使用简化后
        return (String o1, String o2) ->{
            return o2.length() - o1.length();     //按降序排列
        };*/

       //最佳Lambda优化
       return (o1,o2)-> o2.length()-o1.length();
    }



    public static void main(String[] args) {
        String [] arr = {"aaaaa","bbbbbbbbbbbbbbbb","c","dddddddd"};
        //排序前的数组
        System.out.println(Arrays.toString(arr));
        //排序后的数组
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }

}
