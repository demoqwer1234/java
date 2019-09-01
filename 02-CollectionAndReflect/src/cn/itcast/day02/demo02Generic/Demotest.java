package cn.itcast.day02.demo02Generic;

public class Demotest {

    public static void main(String[] args) {
        //使用泛型创建 String类型
        GeneticClass<String > s = new GeneticClass<>();
        s.setName("张三");
        System.out.println(s.getName());

        //使用泛型创建Integer类型
        GeneticClass<Integer> ge = new GeneticClass<>();
        ge.setName(12);
        System.out.println(ge.getName());

        //默认使用Object类型
        GeneticClass ge2 = new GeneticClass();
        ge2.setName("张三");
        System.out.println(ge2.getName());

    }

}
