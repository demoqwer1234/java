package cn.itcast.day08.Test;


import java.io.File;

public class Test01 {

    public static void main(String[] args) {
        File f1 = new File("d:\\Test");
        System.out.println(f1.getAbsoluteFile());

    }

}
