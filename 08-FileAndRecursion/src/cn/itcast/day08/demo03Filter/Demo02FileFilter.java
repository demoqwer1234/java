package cn.itcast.day08.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

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
public class Demo02FileFilter {

    public static void main(String[] args) {
        File file = new File("d:\\Test");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
       // System.out.println(dir);        //打印被遍历的目录名称

        /*File[] files = dir.listFiles( new fileFilter(){       //使用匿名内部类
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".jpg");
            }
        });*/

        /*File[] files = dir.listFiles((File pathname) ->{
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getPath().toLowerCase().endsWith(".txt");
            });*/

        //使用最简lambda 优化(因为FileFilter 接口中只有一个重写方法)
      //  File[] files = dir.listFiles(( pathname) ->pathname.isDirectory()|| pathname.getPath().toLowerCase().endsWith(".txt"));


        //FilenameFilter 也可以作为过滤器
      /*  File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {    //dir 代表文件夹，， name代表文件名
                return new File(dir, name).isDirectory() ||  name.toLowerCase().endsWith(".java");
            }
        });*/

        //使用最简lambda 优化(因为FilenameFilter 接口中只有一个重写方法)
        File[] files = dir.listFiles((d, name)->new File(d, name).isDirectory() || name.toLowerCase().endsWith(".txt"));



        for (File file : files) {
            if (file.isDirectory()){        //判断是否文件， 如果是文件夹则继续遍历   否则打印文件
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
