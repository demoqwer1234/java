package cn.itcast.day01.demo01;

public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 20);
//        Person p2 = new Person("古力娜扎", 30);
        Person p2 = new Person("迪丽热巴", 20);

        boolean b = p1.equals(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(b);



    }

}
