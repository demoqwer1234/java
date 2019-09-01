package cn.itcast.day09.Test;

/*
    字符输出流写出字符数据
        项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo07Test {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\test\\qq.txt");
        Scanner sc = new Scanner(System.in);
        //写入文件
        while(true){
            String str = sc.next();
            if ( "886".equals(str)){
                break;
            }
            fw.write(str);
            fw.write("\r\n");
        }
        fw.close();

        //读取文件
        FileReader fr = new FileReader("d:\\test\\qq.txt");
        char[] chars = new char[1024];
        int len = 0;
        while((len = fr.read(chars)) != -1){
            System.out.println(new String (chars));
        }
        fr.close();

    }

}
