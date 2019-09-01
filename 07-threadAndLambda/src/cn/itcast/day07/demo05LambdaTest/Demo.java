package cn.itcast.day07.demo05LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

    public static void main(String[] args) {
        Person [] arr ={
               new   Person("迪丽热巴",25),
                new Person("古力娜扎" ,19),
                new Person ("范冰冰",30),
        };

        //对数组Person按年龄进行排序  ,,重写Comparator方法
    /*    Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda简化
        Arrays.sort(arr,(Person o1, Person o2)-> {
                return o1.getAge() - o2.getAge();
        });*/

        //lambda省略优化
        Arrays.sort(arr,(Person o1, Person o2)-> o1.getAge() - o2.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }

    }

}
