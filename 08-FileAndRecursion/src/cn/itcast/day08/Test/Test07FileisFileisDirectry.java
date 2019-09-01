package cn.itcast.day08.Test;

import java.io.File;

public class Test07FileisFileisDirectry {

    //文件夹或文件的判断
    public static void main(String[] args) {
        File file = new File("d:\\Test\\a.txt");
        boolean directory = file.isDirectory();            //是否为文件夹   isDirectory()
        System.out.println(directory);

        boolean file1 = file.isFile();                 //是否为文件    isFile()
        System.out.println(file1);

     /*   File file2 = new File("d\\Test\\a");
        boolean file3 = file2.isFile();
        System.out.println(file3);

        boolean directory1 = file2.isDirectory();
        System.out.println(directory1);*/
    }

}
