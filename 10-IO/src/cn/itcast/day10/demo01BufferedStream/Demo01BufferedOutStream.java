package cn.itcast.day10.demo01BufferedStream;

/*
   //使用BufferedOutputStream流对象， 调用write方法
 */
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\tt.txt");

        //创建一个BufferedOutputStream 流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = "abdc";

        //使用BufferedOutputStream流对象， 调用write方法
       // bos.write(s.getBytes(),0,s.length());
        bos.write("你好吖".getBytes());

        bos.flush();
    }
}
