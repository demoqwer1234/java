package cn.itcast.day10.Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    高效字节输出流写出字节数据
        BufferedOutputStream
 */
public class Demo01Test {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("10-IO\\test01.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(97);
        bos.write("Java test".getBytes());

        bos.close();
    }

}
