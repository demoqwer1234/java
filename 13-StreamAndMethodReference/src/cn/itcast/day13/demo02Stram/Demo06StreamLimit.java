package cn.itcast.day13.demo02Stram;

import java.util.stream.Stream;
/*
    limit方法， 对元素进行截取
        Stream<T> limit(long maxSize)
        返回一个新的流，
 */
public class Demo06StreamLimit {

    public static void main(String[] args) {
        String []arr = {"张三","张无忌","周芷若","张三丰","李四"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> limit = stream.limit(3);                //对元素进行截取， 截取前面多少
        limit.forEach(name-> System.out.println(name));
    }

}
