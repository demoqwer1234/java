package cn.itcast.day08.demo03Filter;

import java.io.File;

/*
    递归打印多级目录
      用过滤器
        d:\Test
        d:\Test\a
        d:\Test\a\aa
        d:\Test\a\aa\a.java
        d:\Test\a\aa\a.java\a.java
        d:\Test\a\aa\a.java\a.txt
        d:\Test\a.txt
        d:\Test\b
        d:\Test\b\2b
        d:\Test\b\2b\abc.java
        d:\Test\b\2b\bb.jpg
        d:\Test\b\2b\jj.JAVA
        d:\Test\b\b
        d:\Test\b\b\b.txt
        d:\Test\b\b\bb
        d:\Test\b\b\bb\b.java
        d:\Test\b\b\bb\b.txt
        d:\Test\b.txt
 */
public class Demo01FileFilter {

    public static void main(String[] args) {
        File file = new File("d:\\Test");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
       // System.out.println(dir);        //打印被遍历的目录名称
        File[] files = dir.listFiles( new fileFilterImpl());       //连接一个过滤器
        for (File file : files) {
            if (file.isDirectory()){        //判断是否文件， 如果是文件夹则继续遍历   否则打印文件
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
