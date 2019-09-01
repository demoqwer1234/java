package cn.itcast.day08.demo01File;

import java.io.File;

/*
遍历文件夹
        listFiles()  连着文件夹的路劲一起打印出来
        list()遍历整个文件夹
 */
public class Demo05File {

    public static void main(String[] args) {
        show2();
    }

    /*
         listFiles()  连着文件夹的路劲一起打印出来
     */
    private static void show2() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion");
        File[] arr = f1.listFiles();          //listFiles 返回一个File数组，表示该文件的所有子文件 或 目录
        for (File file : arr) {
            System.out.println(file);
        }
    }

    /*
             list()遍历整个文件夹
                 还能遍历出 隐藏文件夹
     */
    private static void show1() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion");
        String[] list = f1.list();           //list  返回一个String数组，表示该文件的所有子文件 或 目录
        for (String s : list) {
            System.out.println(s);
        }
    }

}
