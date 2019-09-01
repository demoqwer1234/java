package cn.itcast.day10.Test;

import java.io.*;
import java.util.Scanner;

/*经典题目

    高效字符流和集合的综合使用
        描述:
            分析以下需求，并用代码实现
                实现一个验证码小程序，要求如下：
                1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
                2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败

 */
public class Demo03Test {

    public static void main(String[] args) throws IOException {
        //写
        BufferedWriter bw = new BufferedWriter(new FileWriter("10-IO\\data.txt",true));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个待录入的字符串：");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            bw.write(str);
            bw.newLine();     //换行
        }
        bw.flush();               //把数据刷入硬盘
        bw.close();

        //读
        System.out.println("请输入需要验证的字符串:");
        String next = sc.next();
        BufferedReader br = new BufferedReader(new FileReader("10-IO\\data.txt"));
        String len;

        while((len = br.readLine()) != null){
            if (len.equals(next)){
                System.out.println("录入成功");
                break;
            }else{
                System.out.println("没有录入成功");
                break;
            }
        }
        br.close();

    }

}
