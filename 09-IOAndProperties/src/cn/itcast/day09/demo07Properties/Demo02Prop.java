package cn.itcast.day09.demo07Properties;
/*
Store()方法： 把集合中的临时数据，写入硬盘中
        store(OutputStram  out, String comments)方法
        store(write  write, String comments)方法
            comment为声明
            字符流可以写中文， 字节流不能写中文

 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo02Prop {

    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        Properties pro = new Properties();

        pro.setProperty("赵丽颖","18");        //相当于Map集合中的put方法
        pro.setProperty("迪丽热巴","19");
        pro.setProperty("古力娜扎","20");

        //使用字符流
        FileWriter fw = new FileWriter("d:\\test\\v.txt");
        pro.store(fw,"save data");
        fw.close();
                    /*
                    #save data
                    #Sun Jul 21 17:18:02 CST 2019
                    赵丽颖=18
                    迪丽热巴=19
                    古力娜扎=20
                     */
    }

}
