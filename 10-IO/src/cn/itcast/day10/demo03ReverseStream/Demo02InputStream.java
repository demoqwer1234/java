package cn.itcast.day10.demo03ReverseStream;

/*
转换流
    InputStreamReader
         java.io.InputStreamReader extends Reader
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
        //read_Utf_8();
        read_GBK();
    }

    //读取GBK格式
    private static void read_GBK() throws IOException {
        InputStreamReader isr = new InputStreamReader( new FileInputStream("d:\\test\\GBK.txt"),"Gbk");
        int len = 0;
        char [] chars = new char[1024];
        while ((len = isr.read(chars)) != -1){
            System.out.println(new String (chars,0,len));           //你很好
        }
    }


    //读取UTF-8格式
    private static void read_Utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\test\\UTF_8.txt"),"utf-8");   //指定编码格式
        int len = 0;
        while((len = isr.read()) != -1){
            System.out.print((char)len);            //你好
        }
        isr.close();
    }

}
