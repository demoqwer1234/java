package cn.itcast.day09.demo03CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {

    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //读取数据源
        FileInputStream fis = new FileInputStream("d:\\Test\\aa.jpg");
        //写入目的
        FileOutputStream fos = new FileOutputStream("d:\\Test\\a\\a.jpg");

        /*//使用字节输入流对象         //缺点效率低下
        int len =0 ;
        while((len = fis.read()) != -1){           共耗时16564毫秒
            fos.write(len);
        }*/


        //使用数据缓冲区      效率高
        byte []bytes = new byte[1024];
        int len =0;
        while((len = fis.read(bytes)) != -1 ){         //共耗时32毫秒
            fos.write(bytes);
        }
        long e = System.currentTimeMillis();
        System.out.println("共耗时" +(e-s) +"毫秒");
    }

}
