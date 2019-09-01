package cn.itcast.day08.demo03Filter;

import java.io.File;
import java.io.FileFilter;


/*进行条件限定  打印后缀只有.java的文件*/

public class fileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {

        //进行一个条件限定， 如果是文件夹 ， 则也返回true
        if (pathname.isDirectory()){
            return  true;
        }

        return pathname.getPath().toLowerCase().endsWith(".java");
    }
}
