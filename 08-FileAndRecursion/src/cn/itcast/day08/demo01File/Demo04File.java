package cn.itcast.day08.demo01File;

import java.io.File;
import java.io.IOException;
/*
 createNewFile()  返回布尔类型
 mkdir()返回值布尔值类型
 mkdirs()
  delete （）删除文件
 */
public class Demo04File {

    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        delete （）删除文件
      */
    private static void show03() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\aaaa");
        boolean b1 = f1.delete();
        System.out.println("b1: " +b1);
    }

    /*
                 mkdir()返回值布尔值类型
                 mkdirs()
                 注意：
                      mkdir 只能创建单级文件
                      mkdirs 可以创建多级文件
     */
    private static void show02() {
        File f1 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1: " +b1);

        File f2 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\aaaa\\bbb\\ccc");
        boolean b2 = f2.mkdirs();
        System.out.println("b2: " +b2);



    }

    /*
       createNewFile()  返回布尔类型
       注意 ：
            会抛除异常     public boolean createNewFile() throws IOException
            只能创建文件 ， 不能创建文件夹
     */
    private static void show01() throws IOException {
        File f1 = new File("D:\\Test\\b.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1 :" +b1);

        File f2 = new File("D:\\IdeaProjects\\Advanced-code\\08-FileAndRecursion\\aaa.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2: " +b2);

        File f3 = new File("08-FileAndRecursion\\新建文件");
        System.out.println("b3: "+f3.createNewFile());
    }

}
