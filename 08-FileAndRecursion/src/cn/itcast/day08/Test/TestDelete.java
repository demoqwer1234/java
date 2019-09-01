package cn.itcast.day08.Test;

import java.io.File;

public class TestDelete {

    public static void main(String[] args) {
        File file = new File("d:\\Test\\dd");       //删除文件和文件夹       要求文件夹 '" 是一个空文件夹
        boolean d = file.delete();
        System.out.println(d);
    }

}
