package cn.itcast.day09.demo05Write;

import java.io.FileWriter;
import java.io.IOException;

/*
        flash与close的区别
             flash 后还可以继续使用
             close 后不能继续使用

 */
public class Demo02Writer {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:\\Test\\b.txt");
        fw.write(97);

        //由于Writer类中， write方法，不是直接写在硬盘上， 所以需要刷新 flush()   或者关闭close（）
        fw.flush();
        fw.write(99);

        fw.close();           //
        fw.write(100);     //IOException: Stream closed
    }
}
