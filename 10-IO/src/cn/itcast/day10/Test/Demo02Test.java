package cn.itcast.day10.Test;

import java.io.*;

/*
    利用高效字节输入流和高效字节输出流完成文件的复制
        要求：
            1.d:\\test\\aa.jpg"    ->d:\test\bb.jps
            2.一次读写一个字节数组方式复制

 */
public class Demo02Test {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("d:\\test\\aa.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\test\\bb.jpg"));

        int len  = 0;
        byte[] bytes  = new byte[1024];
        while((len = bis.read(bytes,0,len)) != -1){
            bos.write(bytes);
        }

        bis.close();
        bos.close();
    }

}
