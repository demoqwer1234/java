package cn.itcast.day14.reflect;

/*
    获取成员变量 Filed[]  getfileds()
 */
import cn.itcast.day14.Domain.Person;
import java.lang.reflect.Field;

public class ReflectDemo02 {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //获取对象中public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------");
        Field a = personClass.getField("a");
        System.out.println(a);

        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);       //null

        //设置a的值
        a.set(p,"hello");
        System.out.println(p);
        System.out.println("============");

        //getDeclaredFields ()获取所有的成员变量。不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------");
        Field d = personClass.getDeclaredField("d");

        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);     //暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
        d.set(p,"李四");
        System.out.println(p);


    }

}
