package cn.itcast.day08.demo01File;

import java.io.File;

/*
静态方法， 可以直接使用
       static String pathSeparator   与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
       static char pathSeparatorChar 与系统有关的路径分隔符。
        static String separator  与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        static char separatorChar 与系统有关的默认名称分隔符。

 */
public class demo {

    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);              //  ;

        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);         //;

        String separator = File.separator;
        System.out.println(separator);             //       正斜杠\

        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);        //       正斜杠\
    }

}
