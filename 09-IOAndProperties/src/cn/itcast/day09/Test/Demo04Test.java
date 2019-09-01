package cn.itcast.day09.Test;

/*
    字节输入流一次读取一个字节数据
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo04Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\b.txt");
        int len =0;
        while((len = fis.read()) != -1){
            System.out.println((char) len);        //强转换为字符
        }
    }
}
