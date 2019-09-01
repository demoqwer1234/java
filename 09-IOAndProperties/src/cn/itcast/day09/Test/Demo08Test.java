package cn.itcast.day09.Test;
/*
    IO对象Properties结合使用,设置properties文件
        我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
        请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
        score.txt文件内容如下：
        zhangsan = 90
        lisi = 80
        wangwu = 85

     需要用到load（）方法，用于读取数据
     用到 store（）方法， 用于写入数据

 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo08Test {

    public static void main(String[] args) throws IOException {
        //创建字符流对象   也可以使用字节流对象
        FileReader fr = new FileReader("d:\\test\\score.txt");
        FileWriter fw = new FileWriter("d:\\test\\score.txt",true);    //需要加上true ，调用apoend方法， 防止被覆盖
        Properties pro = new Properties();

        pro.load(fr);                    //读数据
        pro.store(fw,"");      //写数据

        Set<String> set = pro.stringPropertyNames();
        for (String key : set) {
            if ("lisi".equals(key)){
                pro.setProperty(key,"100");
            }

            String value = pro.getProperty(key);
            System.out.println("key: "+key+" ||value ；" +value);
        }
    }

}
