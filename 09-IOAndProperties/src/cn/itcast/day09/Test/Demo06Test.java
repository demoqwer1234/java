package cn.itcast.day09.Test;

/*
    字节流复制文件
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\aa.jpg");
        FileOutputStream fos = new FileOutputStream("d:\\test\\bb.jpg");

        long e = System.currentTimeMillis();
        int len = 0;
        byte [] bytes  = new byte[1024];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes);
        }

        fis.close();
        fos.close();
        long s = System.currentTimeMillis();
        System.out.println("共耗时"+(s-e)+"毫秒");     //共耗时24毫秒
    }

}
