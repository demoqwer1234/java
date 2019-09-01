package cn.itcast.day09.Demo01OutputStream;


/*
        续写  append ()方法
                true表示创建对象不会覆盖源文件， 继续在文件末尾写数据
                false表示创建一个新文件， 覆盖源文件
        换行符
                windows : \r\n
                linux :   /n
                Mac:      /r
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\Test\\z.txt",true);
        for (int i = 0; i <10 ; i++) {
            fos.write("您好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }

}
