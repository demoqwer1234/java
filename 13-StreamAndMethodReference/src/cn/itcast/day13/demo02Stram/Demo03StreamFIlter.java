package cn.itcast.day13.demo02Stram;

import java.util.function.Predicate;
import java.util.stream.Stream;
/*
    Predicate中的抽象方法：          判断接口
        Boolean  test（T t）
 */
public class Demo03StreamFIlter {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","张无忌","周芷若","张三丰","李四");



        Stream<String> stream2= stream.filter((String name )-> {return name.length() == 3;} );
        stream2.forEach((name)-> System.out.println(name));


        /*
            Stream流属于管道流， 使用完后就会关闭了
         */

       // stream2.forEach((name)-> System.out.println(name));//tream has already been operated upon or closed

    }

}
