package cn.itcast.day14.reflect;

/*
    获取成员方法：
        Method[] getMethods()

    获取类名
        String getName()
 */

import cn.itcast.day14.Domain.Person;
import java.lang.reflect.Method;

public class ReflectDemo04 {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //指定名称方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_Method2 = personClass.getMethod("eat", String.class);
        eat_Method2.invoke(p,"饭饭");
        System.out.println(p);
        System.out.println("-------------------------");

        Method[] methods = personClass.getMethods();   //同时执行各种方法
        for (Method method : methods) {
            System.out.println(method);
            String methoName = method.getName();
            System.out.println(methoName);
        }
        System.out.println("==============");

        //获取类名
        Class<? extends Class> className = personClass.getClass();
        System.out.println(className);

    }

}
