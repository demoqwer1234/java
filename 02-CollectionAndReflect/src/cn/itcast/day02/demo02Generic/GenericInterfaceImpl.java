package cn.itcast.day02.demo02Generic;

public class GenericInterfaceImpl implements GenericInterface<String> {

    @Override
    public void methed(String s) {
        System.out.println(s);
    }
}
