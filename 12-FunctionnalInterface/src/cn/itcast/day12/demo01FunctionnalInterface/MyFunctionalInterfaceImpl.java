package cn.itcast.day12.demo01FunctionnalInterface;

public class MyFunctionalInterfaceImpl implements  MyFunctionalInterface{
    @Override
    public void method() {
        System.out.println("使用实现类重写");
    }
}
