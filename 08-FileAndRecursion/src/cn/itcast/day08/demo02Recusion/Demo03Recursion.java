package cn.itcast.day08.demo02Recusion;

import java.io.File;

/*
    递归打印多级目录
      需求:
            只打印.java文件
 */
public class Demo03Recursion {

    public static void main(String[] args) {
        File file = new File("d:\\Test");
        getAllFile(file);
    }

    /*
            使用递归打印， 后缀名为.java 的文件
     */
    public static void getAllFile(File dir) {
        //System.out.println(dir);            //打印被遍历的目录名称
        File[] files = dir.listFiles();       //listFiles 返回一个File数组，表示该文件的所有子文件 或 目录
        for (File file : files) {
            if (file.isDirectory()){        //判断是否文件， 如果是文件夹则继续遍历   否则打印文件
                getAllFile(file);
            }else{

                String name = file.getName(); //获取文件的名称
              //  String name = file.getPath();    //getPath()   也可以获取， 它的返回类型也是String
                //String name = file.getAbsolutePath();     //getAbsolutePath()   也可以获取， 它的返回类型也是String
                String s = name.toLowerCase();  // 把大写转换为小写
                boolean b = s.endsWith(".java");  //判断后缀名， 是否为.java       返回类型为boolean

                //  boolean b1 = file.getPath().toLowerCase().endsWith(".java");   或者链式写法

                if (b){                            //如果是， 则打印出来
                    System.out.println(file);
                }
            }
        }
    }
}
