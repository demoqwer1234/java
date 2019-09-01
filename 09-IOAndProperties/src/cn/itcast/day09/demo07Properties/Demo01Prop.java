package cn.itcast.day09.demo07Properties;
/*
java.util 类 Properties
        唯一与流相关的map类
 */
import java.util.Properties;
import java.util.Set;

public class Demo01Prop {

    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Properties pro = new Properties();

        pro.setProperty("赵丽颖","18");        //相当于Map集合中的put方法
        pro.setProperty("迪丽热巴","19");
        pro.setProperty("古力娜扎","20");

        Set<String> set = pro.stringPropertyNames();   //相当于Map集合中的keyset()方法

        for (String key : set) {
            String value = pro.getProperty(key);         //相当于Map集合中的getkey()方法
            System.out.println("key " + key +"  value  "+value);
        }

    }

}
