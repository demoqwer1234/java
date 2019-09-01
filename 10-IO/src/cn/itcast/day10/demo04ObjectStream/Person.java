package cn.itcast.day10.demo04ObjectStream;

import java.io.Serializable;

/*
NotSerializableException
     需要声明Serializable接口， 才能调用oos.writeObject()方法
        不然会抛NotSerializableException

     static 关键字：静态关键字
        静态关键字优先非静态加载到内存中
        被static关键字修饰后， 不能被序列化

     transient关键字： 瞬态关键字
        被transient关键字修饰后， 不能被序列化

 */
public class Person implements Serializable{

    //防止序列号冲突
    private static  final long  serialVersionUID  = 1L;          //serialVersionUID防止序列号冲突
    private String name;
    //private /*static*/ transient int age;
    private int age;                              //InvalidClassException   ,反序列化失败， 因为修改了程序， 导致序列号不同
                                                //serialVersionUID = 5800853229065525826, local class serialVersionUID = -1834137538654172415


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
