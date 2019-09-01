package cn.itcast.day13.demo02Stram;

import java.util.stream.Stream;

/*
    concat（）：把两个连接起来
        concat（）是一个静态方法
 */
public class Demo08StreamConcat {

    public static void main(String[] args) {
        String []arr = {"张三","张无忌","周芷若","张三丰","李四"};
        Stream<String> stream1 = Stream.of(arr);

        String []arr2 ={"喜羊羊","美羊羊","慢羊羊","灰太狼"};
        Stream<String> stream2 = Stream.of(arr2);

        Stream<String> concat = Stream.concat(stream1, stream2);        //把两个流连接起来
        concat.forEach(name-> System.out.println(name));
    }

}
