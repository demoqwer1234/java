package cn.itcast.day02.demo02Generic;

/*
测试含有泛型得接口
 */

public class DemoGenericInterface {

    public static void main(String[] args) {
        //创建GenericInterfaceImpl 对象
        GenericInterfaceImpl ge =new GenericInterfaceImpl();
        ge.methed("字符串");

       //创建GenericInterfaceImpl2  对象
        GenericInterfaceImpl2<Integer> ge2 = new GenericInterfaceImpl2<>();
        ge2.methed(100);

        GenericInterfaceImpl2<Double > ge3 = new GenericInterfaceImpl2<>();
        ge3.methed(9.2);

        GenericInterfaceImpl2<String > ge4 =new GenericInterfaceImpl2<>();
        ge4.methed("张三");

     }

}
