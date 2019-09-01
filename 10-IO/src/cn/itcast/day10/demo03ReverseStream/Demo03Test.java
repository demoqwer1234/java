package cn.itcast.day10.demo03ReverseStream;

import java.io.*;

/*
   文件转换 ， 把UTF-8 转换为 GBK格式
 */
public class Demo03Test {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(new FileInputStream("d:\\test\\utf_8.txt"),"utf-8");   //charsetName 表示声明该文件的格式
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("d:\\test\\res.txt",true),"Gbk");
        int len = 0;
        while((len = isr.read()) != -1){
            osw.write(len);
            osw.write("\r\n");
        }

        isr.close();
        osw.close();
    }

}
