package cn.itcast.day13.Test02;

import java.util.Arrays;
import java.util.stream.Stream;

/*
组合：concat、结果收集(list)
    问题：
    已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合

 */
public class Demo04 {

    public static void main(String[] args) {
        String []arr1 ={"郭靖","杨康"} ;
        String [] arr2 ={"黄蓉","穆念慈"};
        Stream<String> s1 = Stream.of(arr1);
        Stream<String> s2 = Stream.of(arr2);
        Stream.concat(s1,s2).forEach(name-> System.out.println(name));
    }

}
