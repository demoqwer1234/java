package cn.itcast.day08.Test;

import java.io.File;

public class Test03 {

    public static void main(String[] args) {     //单级文件夹的创建
        File file = new File("d:\\Test\\dd");
        boolean b = file.mkdir();
        System.out.println(b);
    }

}
