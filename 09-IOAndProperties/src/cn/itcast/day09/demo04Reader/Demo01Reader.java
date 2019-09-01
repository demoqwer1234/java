package cn.itcast.day09.demo04Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    int read()读取单个字符
    int read(char[] cbuf, int off, int len) 将字符读入数组的某一部分
 */
public class Demo01Reader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\Test\\a.txt");

       /* //使用字节流
        int len = 0;
        while((len = fr.read()) != -1){
            System.out.println((char) len);
        }*/


       /*
         String 类构造方法
       *    String(char[] value)  把字符数组转换为字符串
       *    String(char[] value, int offset, int count) 把字符数组的 一部分转换为字符串 ， offset数组的开始索引， count转换的字节个数
       * */

        //一次读取多个
        int len = 0;
        char[] cs = new char[1024];
        while((len = fr.read(cs)) != -1){

            System.out.println(new String (cs , 0 , len));
        }

        fr.close();
    }

}
