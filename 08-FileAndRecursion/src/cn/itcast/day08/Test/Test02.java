package cn.itcast.day08.Test;

import java.io.File;
import java.io.IOException;

public class Test02 {

    public static void main(String[] args) throws IOException {
        File f1 = new File("d:\\Test\\c.jpg");            //只能创建文件， 不能创建文件夹
        if (!f1.exists()) {
            boolean newFile = f1.createNewFile();
            System.out.println(newFile);               //IOException
        }


    }

}
