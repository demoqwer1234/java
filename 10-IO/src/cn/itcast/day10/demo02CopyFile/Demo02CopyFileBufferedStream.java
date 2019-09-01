package cn.itcast.day10.demo02CopyFile;
/*
使用BufferedStream流
    使用一次读一个字节 耗时共耗时95毫秒

        使用数组字节   //共耗时8毫秒
 */
import java.io.*;

public class Demo02CopyFileBufferedStream {

    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        //创建BufferedInputStream  缓冲区读取数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\Test\\aa.jpg"));

        //创建BufferedOutputStream  缓冲区写入数据
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\Test\\a\\a.jpg"));

        /*//一次读取一个
        int len = 0;
        while((len = bis.read()) != -1){
            bos.write(len);
        }*/

        //一次读取多个
        int len = 0;
        byte[] bytes = new byte[1024];
        while(( len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();


        long e = System.currentTimeMillis();
        System.out.println("共耗时" +(e-s) +"毫秒");
    }

}
