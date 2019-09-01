package cn.itcast.day05.demo01;


import java.util.Objects;

public class Demo03Objects {

    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        Objects.requireNonNull(obj,"空指针");
    }

}
