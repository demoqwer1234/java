package cn.itcast.day08.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Test08FileListFile {

    public static void main(String[] args) {
       /* File file = new File("d:\\Test");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }*/

       /* File f2 = new File("d:\\Test");
        File[] files2 = f2.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir ,name).isDirectory()  || name.toLowerCase().endsWith(".java");
            }
        });*/

        File f3 = new File("d:\\Test");
        File[] files3 = f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()  || pathname.getName().toLowerCase().endsWith("txt")  ;
            }
        });

        for (File f : files3) {
            System.out.println(f);
        }
    }
}
