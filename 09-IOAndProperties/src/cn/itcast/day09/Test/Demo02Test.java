package cn.itcast.day09.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节输出流写出字节数组数据
        1.	创建字节输出流FileOutputStream对象并指定文件路径。
        2.	调用字节输出流的write(byte[] buf)方法写出数据。

 */
public class Demo02Test {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\a.txt");   //out为写数据
        int len = 0;
        fos.write("i love java".getBytes());          //转换为字节
        fos.close();

    }

}
