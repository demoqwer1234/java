package cn.itcast.day08.demo01File;

import java.io.File;

/*
        File(File parent, String child)根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。

 */
public class demo01File {

    public static void main(String[] args) {
        show01();

        show02("D:\\Test","a.txt");

        show03();
    }

    private static void show03() {
        File parent = new File("d\\");
        File file = new File(parent,"Test\\a.txt");
        System.out.println(file);                              //d\Test\a.txt
    }

    //File(String parent, String child)
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);          //D:\Test\a.txt
    }

    // File(String pathname)
    private static void show01() {
        File  file  = new File("D:\\Test\\a.txt");   //D:\Test\a.txt
        File  file2  = new File("D:\\Test");         //D:\Test
        System.out.println(file);
    }
}
