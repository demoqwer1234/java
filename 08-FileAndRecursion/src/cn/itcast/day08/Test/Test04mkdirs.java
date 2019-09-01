package cn.itcast.day08.Test;

import java.io.File;

public class Test04mkdirs {

    public static void main(String[] args) {          //多级文件夹的创建
        File f = new File("d:\\Test\\fff\\vvv\\z");
        boolean b = f.mkdirs();
        System.out.println(b);
    }

}
