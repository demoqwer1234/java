package cn.itcast.day09.demo02InputStream;

/*
    String(byte[] bytes)   把字节数组转换为字符串
    String(byte[] bytes, int offset, int length)  把字节数组的 一部分转换为字符串 ， offset数组的开始索引， length转换的字节个数

     int read(byte[] b)   从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\Test\\a.txt");

        byte [] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){      //必须使用len 进行接收
            System.out.println(new String(bytes,0,len));    //使用String的构造方法，  offset表示从0 索引开始， len表示需要转换的长度
        }
    }
}
