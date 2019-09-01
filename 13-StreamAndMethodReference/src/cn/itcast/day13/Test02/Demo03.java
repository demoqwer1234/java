package cn.itcast.day13.Test02;

/*

 */
import java.util.stream.Stream;

/*
    映射：map、逐一消费：forEach
        问题：
        有如下整数1，-2，-3，4，-5
        使用Stream取元素绝对值并打印
 */
public class Demo03 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(Math::abs).forEach(i-> System.out.println(i));
    }

}
