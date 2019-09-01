package cn.itcast.day13.demo02Stram;

import java.util.stream.Stream;

/*
    skip()方法用于跳过前面多少个元素
        Stream<T> skip(long n)
            如果流的长度大于n ，则跳过前n个元素， 否则返回一个长度为0 的空流
 */
public class Demo07StreamSkip {
    public static void main(String[] args) {
        String []arr = {"张三","张无忌","周芷若","张三丰","李四"};
        Stream<String> stream = Stream.of(arr);

      /*  Stream<String> skip1 = stream.skip(5);            //5大于流的长度， 返回一个空流
        skip1.forEach(name-> System.out.println(name));   //返回一个空流*/

        Stream<String> skip = stream.skip(2);            //跳过前面两个元素
        skip.forEach((name)-> System.out.println(name));


    }


}
