package cn.itcast.day10.demo01BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\tt.txt");

        //创建一个 BufferedInputStream 对象
        BufferedInputStream bis = new BufferedInputStream(fis);

        /*//一次读取一个
        int len = 0;
        while((len = bis.read()) != -1){
            System.out.println(len);
        }*/

        //一次读取多个
        int len = 0;
        byte[] bytes = new byte[1024];
        while(( len = bis.read(bytes)) != -1){
            System.out.println(new String (bytes,0,len));        //把字节转换为字符串
        }
    }

}
