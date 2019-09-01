package cn.itcast.day13.demo02Stram;

import java.util.function.Consumer;
import java.util.stream.Stream;
/*
    是一个终结方法  不能再继续调用Stream中的其他方法
 */

public class Demo02StreamForEach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五");

        //匿名内部方法
        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //使用Lambda表达
        /*stream.forEach((String name) -> {
            System.out.println(name);
        });*/

        //优化
        stream.forEach(name-> System.out.println(name));

    }

}
