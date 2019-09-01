package cn.itcast.day14.reflect;

/*
    获取构造方法
        constructor[] getConstructors()
 */
import cn.itcast.day14.Domain.Person;
import java.lang.reflect.Constructor;

public class ReflectDemo03 {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        //创建对象    构造器
        Person p = constructor.newInstance("张三", 19);
        System.out.println(constructor);
        System.out.println(p);
        System.out.println("---------");

        //创建一个空参数的构造方法
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person p2 = constructor1.newInstance();
        System.out.println(p2);


    }

}
