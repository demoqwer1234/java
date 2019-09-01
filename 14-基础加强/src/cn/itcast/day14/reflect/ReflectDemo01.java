package cn.itcast.day14.reflect;

import cn.itcast.day14.Domain.Person;

public class ReflectDemo01 {

    /*
        获取对象的方式
            1.Class.forName("全类名“),将字节码加载进内存， 返回class对象
            2.类名.class ， 通过类名的属性 class获取
            3..对象.getClass()  getClass方法在Object类中定义着
     */

    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名“)
        Class cls1= Class.forName("cn.itcast.day14.Domain.Person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2=  Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        Person p = new Person();
        Class cls3=  p.getClass();
        System.out.println(cls3);

        //比较
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
    }

}
