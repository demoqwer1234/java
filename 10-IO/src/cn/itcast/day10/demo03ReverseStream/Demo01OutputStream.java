package cn.itcast.day10.demo03ReverseStream;

/*
转化流
java.io.OutputStreamWrite
         OutputStreamWriter extends Writer
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStream {

    public static void main(String[] args) throws IOException {
       // write_UTF_8();
        write_GBK();

    }

    private static void write_GBK() throws IOException {
        //创建一个OutputStreamWriter  对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\test\\GBK.txt"),"GBK");    //声明写入的标准
        osw.write("你很好");
        osw.flush();
        osw.close();
    }

    private static void write_UTF_8() throws IOException {
        //创建一个OutputStreamWriter  对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\test\\UTF_8.txt"),"utf-8");  //指定编码表名称
        //写入数据内容
        osw.write("你好");

        //把缓存区的内容刷新到硬盘
        osw.flush();
        osw.close();
    }

}
