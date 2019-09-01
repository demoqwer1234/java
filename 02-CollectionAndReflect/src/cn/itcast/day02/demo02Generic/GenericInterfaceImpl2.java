package cn.itcast.day02.demo02Generic;

public class GenericInterfaceImpl2 <I> implements GenericInterface<I> {


    @Override
    public void methed(I i) {
        System.out.println(i);
    }
}
