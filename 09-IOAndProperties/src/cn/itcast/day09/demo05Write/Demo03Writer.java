package cn.itcast.day09.demo05Write;

import java.io.FileWriter;
import java.io.IOException;

/*
    void write(char[] cbuf)写入字符数组。
    void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
 */
public class Demo03Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\test\\b.txt");

        char[] cs = {'a','b','c','d'};
        fw.write(cs,1,3);

        fw.write("清华同方",1,3);
        fw.close();
    }

}
