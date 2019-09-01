package cn.itcast.day09.Test;

/*
    字节输入流一次读取一个字节数组数据
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Demo05Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\test\\b.txt");          //in为读数据

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            String s = new String(bytes, 0, bytes.length);
            System.out.println(s);
        }

        fis.close();
    }

}
