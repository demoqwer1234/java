package cn.itcast.day09.demo05Write;

/*
    续写和换行
         续写  append ()方法
                true表示创建对象不会覆盖源文件， 继续在文件末尾写数据
                false表示创建一个新文件， 覆盖源文件
        换行符
                windows : \r\n
                linux :   /n
                Mac:      /r
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Write {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\test\\d.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("hello"+i+"\r\n");

        }
        fw.close();
    }

}
