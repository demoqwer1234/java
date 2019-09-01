package cn.itcast.day09.Test;

/*
        字节输出流写出字节数据
            1.	创建字节输出流FileOutputStream对象并指定文件路径。
            2.	调用字节输出流的write(int byte)方法写出数据

 */
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\a.txt");
        fos.write(97);
        fos.close();
    }

}
