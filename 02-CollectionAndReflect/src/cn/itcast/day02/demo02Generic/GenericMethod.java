package cn.itcast.day02.demo02Generic;

public class GenericMethod {

    public <E> void method1(E e){
        System.out.println(e);
    }
    public static <M> void method2(M m){
        System.out.println(m);
    }

}
