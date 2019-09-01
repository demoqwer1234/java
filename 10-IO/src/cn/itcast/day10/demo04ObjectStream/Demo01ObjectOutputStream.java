package cn.itcast.day10.demo04ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
序列化流
    ObjectOutputStream
            writeObject（）方法
      作用：
           把对象以流的方式， 保存的文件中

 */
public class Demo01ObjectOutputStream {

    public static void main(String[] args) throws IOException {

        //1.创建ObjectOutputStream 对象 ， 传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10-IO\\a.txt")) ;
        //2.使用ObjectOutputStream 对象中的writeObject（）方法， 将Person写入其中
        oos.writeObject(new Person("迪丽热巴",18));       //抛出NotSerializableException时 ，需要在Person中声明SerializableException接口

        oos.close();
    }

}
