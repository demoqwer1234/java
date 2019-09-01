package cn.itcast.day10.demo04ObjectStream;

/*
    使用序列化
        对集合进行序列化与反序列化
        使用序列化 对集合进行存储和遍历
 */
import java.io.*;
import java.util.ArrayList;

public class DemoTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("赵丽颖",18));
        list.add(new Person("迪丽热巴",22));
        list.add(new Person("古力娜扎",21));
        list.add(new Person("范冰冰",19));

        //创建序列化与反序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10-IO\\person.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("10-IO\\person.txt"));

        //调用writeObject（）与 readObject（）方法，分别写入和读取
        oos.writeObject(list);
        Object o = ois.readObject();

        ois.close();
        oos.close();

        //强转 o 为ArrayLIst 集合
        ArrayList<Person> arr = (ArrayList<Person>) o;

        for (Person person : arr) {
            int age = person.getAge();
            String name = person.getName();
            System.out.println("name: "+name+" age :"+age);
        }
    }

}
