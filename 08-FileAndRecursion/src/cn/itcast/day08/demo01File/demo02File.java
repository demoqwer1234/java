package cn.itcast.day08.demo01File;

import java.io.File;

/*
public String getName()返回由此抽象路径名表示的文件或目录的名称。该名称是路径名名称序列中的最后一个名称。如果路径名名称序列为空，则返回空字符串。
public String getPath()将此抽象路径名转换为一个路径名字符串。所得字符串使用默认名称分隔符分隔名称序列中的名称
public String getAbsolutePath()返回此抽象路径名的绝对路径名字符串
public long length()返回由此抽象路径名表示的文件的长度。如果此路径名表示一个目录，则返回值是不确定的
 */
public class demo02File {

    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
        File file = new File("D:\\Test\\a.txt");
        long length = file.length();
        System.out.println(length);             //19
    }

    //public String getPath()
    private static void show03() {
        File file1 = new File("D:\\Test\\a.txt");
        String path1 = file1.getPath();
        System.out.println(path1);

        File file2 = new File("a.txt");
        String path2 = file2.getPath();
        System.out.println(path2);

        System.out.println(file2.toString());            //等效于getPath(),重写了toString方法


    }

    //public String getAbsolutePath()
    private static void show02() {
        File file = new File("D:\\Test\\a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        File file2 = new File("a.txt");
        String absolutePath1 = file2.getAbsolutePath();
        System.out.println(absolutePath1);

    }

    //public String getName()
    private static void show01() {
        File file = new File("D:\\Test\\a.txt");
        String name = file.getName();
        System.out.println(name);
    }

}
