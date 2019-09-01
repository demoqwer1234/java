package cn.itcast.day10.demo01BufferedStream;

/*
BufferedWriter
        java.io.BufferedWriter  extends Writer

        newLine()    //BufferedWriter  特有的方法，， 换行符
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\test\\a.txt"));

        for (int i = 0; i <10 ; i++) {
            bw.write("i love java");
            bw.newLine();                 //BufferedWriter  特有的方法，， 换行符
        }

        bw.close();
    }

}
