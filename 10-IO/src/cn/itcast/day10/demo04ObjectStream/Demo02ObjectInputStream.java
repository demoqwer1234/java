package cn.itcast.day10.demo04ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    反序列化：
        1.类必须实现Serializable接口
        2.必须存在类对应的class文件
            ObjectInputStream   readObject()方法，

    ClassNotFoundException异常需要声明
        当class文件不存在时， 会抛出此异常


 */
public class Demo02ObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建一个ObjectInputStream 对象， 构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("10-IO\\a.txt"));

        //2.使用ObjectInputStream对象中的， readObject()方法， 读取保存对象文件
        Object o = ois.readObject();

        //关闭
        ois.close();


        //强转为o对象 为Person对象
        Person p = (Person) o;
        int age = p.getAge();
        String name = p.getName();
        System.out.println("name: " +name +"  age : "+age );


    }

}
