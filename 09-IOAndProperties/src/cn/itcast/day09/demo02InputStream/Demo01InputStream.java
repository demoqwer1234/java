package cn.itcast.day09.demo02InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
方法:
         int read() 从此输入流中读取一个数据字节
         int read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中
         void close() 关闭此文件输入流并释放与此流有关的所有系统资源


构造方法：
    FileInputStream(File file) 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
    FileInputStream(String name)  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
        String name :文件路径
        File File : 文件
  构造方法作用：
        1.会创建一个FileInputStream对象
        2.会把FileInputStram 构造指定构造方法中要读取的文件

 */
public class Demo01InputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:\\Test\\f.txt");    //java.io.FileNotFoundException: d:\Test (拒绝访问。)
       /* int r = fis.read();
        System.out.println(r);//229

        r = fis.read();
        System.out.println(r);  //165

        r = fis.read();
        System.out.println(r);//185
*/
        int len = 0 ;
        while((len =fis.read()) !=-1){       //需要用一个变量进行接收
                len = fis.read();
            System.out.println(len);
            System.out.println((char)len);
        }

        fis.close();
    }
}
