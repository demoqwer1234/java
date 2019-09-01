package cn.itcast.day13.Test02;

import java.util.stream.Stream;

/*
    有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
 */
public class Demo01 {

    public static void main(String[] args) {
        String []arr= {};
        Stream<String > stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String[] guos = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);
        for (String guo : guos) {
            System.out.println(guo);
        }

    }

}
