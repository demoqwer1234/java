package cn.itcast.day09.Test;

/*
        文件的续写和换行输出

 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03Test {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\test\\b.txt",true);
        FileInputStream fis = new FileInputStream("d:\\test\\b.txt");
        for (int i = 0; i < 10; i++) {
            fos.write("i love java".getBytes());
            fos.write("\r\n".getBytes());

        }
        fos.close();
        int len = 0;
        byte []bytes = new byte[1024];
        while((len = fis.read(bytes)) !=  -1){

            System.out.println(new String(bytes,0,len));
        }

        fis.close();
    }

}
