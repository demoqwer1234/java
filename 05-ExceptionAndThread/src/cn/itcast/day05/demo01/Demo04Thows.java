package cn.itcast.day05.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;

public class Demo04Thows {

//    FileNotFoundException extends IOException extends Exception        //文件的继承关系

    public static void main(String[] args) throws Exception{    //异常都抛给JVM处理
        FilePath("c\\a.txt");
    }

    private static void FilePath(String fileName) throws Exception{
        if(!fileName.equals("c\\a.txt")){
            throw new FileNotFoundException("传递的文件路劲不是c\\a.txt");

        }

        if(fileName.endsWith(".txt")){
            throw new IOException("传递的文件名不是txt");
        }
        System.out.println("读文件");
    }

}
