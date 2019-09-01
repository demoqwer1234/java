package cn.itcast.day08.Test;

import java.io.File;
/*
                获取文件信息:文件名,文件大小,文件的绝对路径,文件的父路径
 */
public class Test06File {


    public static void main(String[] args) {
        File f1 = new File("d:\\Test\\a.txt");

        String name = f1.getName();    //文件名
        System.out.println(name);     //a.txt

        long length = f1.length();     //文件大小
        System.out.println(length);//    19

        String absolutePath = f1.getAbsolutePath();   //文件的绝对路径
        System.out.println(absolutePath);             //d:\Test\a.txt

        String parent = f1.getParent();      //文件的父路径
        System.out.println(parent);          //d:\Test
    }


}
