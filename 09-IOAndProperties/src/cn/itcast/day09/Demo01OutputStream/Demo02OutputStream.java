package cn.itcast.day09.Demo01OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
        write(byte[] b)  将 b.length 个字节从指定的 byte 数组写入此输出流。
        write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
 */
public class Demo02OutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\Test\\v.txt");

      /*  //字节中 正数查询ASCII码   ，负数查询GBK中文码
        byte [] bytes = {-65,-67,68,69};
        fos.write(bytes);
        //fos.close();

        //查询写入 bytes中的引索
        fos.write(bytes,0,3);*/

        byte[] b = "她说".getBytes();
        System.out.println(Arrays.toString(b));
        fos.write(b);                 //她说
        fos.close();
    }
}
