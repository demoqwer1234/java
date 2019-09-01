package cn.itcast.day10.Test;
/*
   序列转化
 */
import java.io.*;
import java.util.ArrayList;

public class Demo05TestPerson {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("赵丽颖",18));
        list.add(new Person("迪丽热巴",22));
        list.add(new Person("古力娜扎",21));
        list.add(new Person("范冰冰",19));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("10-IO\\person.txt"));

        oos.writeObject(list);
        oos.flush();
        oos.close();

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("10-IO\\person.txt"));
        int len = 0;
        Object o = ois.readObject();

        //强制转化为 ArrayList类型
         ArrayList<Person> arr = (ArrayList<Person>) o;

        for (Person person : arr){
            int age = person.getAge();
            String name = person.getName();
            System.out.println(name+"  "+age);
        }

    }

}
