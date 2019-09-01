package cn.itcast.day09.Demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
         void close()  关闭此输出流并释放与此流有关的所有系统资源。
         void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
         void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。

 */
public class DemoOutputStream {

    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutoutStream对象 ， 把构造方法传入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\Test\\f.txt");

        //2.调用FileOutputStream 中的write()方法， 把数据写入到硬盘中
        fos.write(100);

        //3.释放资源(流的只用一定会占一部分内存， 使用完后要及时释放)
        fos.close();

    }

}
