package cn.itcast.day10.Test;

import java.io.*;

/*
转换:
    转换输出流的使用
        描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的gbk.txtt文件中。
        要求：使用gbk编码保存。
        注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码


    转换输入流的使用
        描述:利用转换输入流将当前项目根目录下使用gbk编码的gbk.txt文件的内容读取出来，并打印在控制台上。
        要求：不能出现乱码的情况
 */
public class Demo04Test {

    public static void main(String[] args) throws IOException {
        //写
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("10-IO\\gbk.txt"),"gbk");
        osw.write("我爱Java");
        osw.flush();
        osw.close();

        //读
        InputStreamReader isr = new InputStreamReader(new FileInputStream("10-IO\\gbk.txt"),"gbk");
        int len = 0;
        while((len = isr.read()) != -1){

            System.out.print((char)len);
        }
        isr.close();
    }

}
