package cn.itcast.day08.demo01File;
/*
    exists())  判断是否存在该文件
    //isDirectory()  判断是否为文件目录
    //isFile()      判断是否为文件
 */
import java.io.File;

public class demo03File {

    public static void main(String[] args) {
        show02();
    }

    //isDirectory()  判断是否为文件目录
    //isFile()      判断是否为文件
    private static void show02() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion");
        System.out.println(f1.isDirectory());  //true
        System.out.println(f1.isFile());       //false

        File f2 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\08-FileAndRecursion.iml");
        System.out.println(f2.isDirectory());    //false
        System.out.println(f2.isFile());             //true
    }

    //exists()
    private static void show01() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion");
        System.out.println(f1.exists());     //true

        File f2 = new File("D:\\IdeaProjects\\Advanced-code\\09-FileAndRecursion");
        System.out.println(f2.exists());      //false

        File f3 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\08-FileAndRecursion.iml");
        System.out.println(f3.exists());   //true

    }

}
