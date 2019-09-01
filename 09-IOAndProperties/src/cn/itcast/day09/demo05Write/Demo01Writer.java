package cn.itcast.day09.demo05Write;

import java.io.FileWriter;
import java.io.IOException;

/*
    FilterWriter
          void close() 关闭此流，但要先刷新它。
         void flush() 刷新该流的缓冲。
         void write(char[] cbuf, int off, int len) 将字符写入数组的某一部分。
         void write(int c) 写入单个字符。
         void write(String str, int off, int len) 写入一部分字符串。

 */
public class Demo01Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\Test\\b.txt");
        fw.write(97);

        //由于Writer类中， write方法，不是直接写在硬盘上， 所以需要刷新 flush()   或者关闭close（）
         fw.flush();
        fw.close();           //
    }

}
