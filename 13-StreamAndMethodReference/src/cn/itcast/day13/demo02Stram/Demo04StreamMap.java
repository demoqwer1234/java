package cn.itcast.day13.demo02Stram;

import java.util.stream.Stream;
/*

需要将流中的元素映射到另一个流中， 可以使用map方法
    该方法使用Function
    Function方法中的抽象方法：
        R apply（T  t）;
 */

public class Demo04StreamMap {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream2 =stream.map((String s) -> {return Integer.parseInt(s);});

        stream2.forEach((i)-> System.out.println(i) );
    }
}
