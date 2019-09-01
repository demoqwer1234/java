package cn.itcast.day09.demo07Properties;

/*
    load（）方法
       用于读取数据
     注意：
         加上# 则不能读取， 相当于注释
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo03Prop {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("d:\\test\\v.txt");

        Properties pro = new Properties();

        pro.load(fr);
        Set<String> set = pro.stringPropertyNames();

        for (String key : set) {
            String value = pro.getProperty(key);
            System.out.println("key " + key +"  value "+value);
        }

        fr.close();

    }

}
