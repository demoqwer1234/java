package cn.itcast.day06.demo02SetName;

public class DemoMyThread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.setName("小强");
        mt.start();

        new MyThread("汪汪").start();
    }

}
