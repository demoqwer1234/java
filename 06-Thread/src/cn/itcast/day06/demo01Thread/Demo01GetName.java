package cn.itcast.day06.demo01Thread;

public class Demo01GetName {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();           //Thread-0

        new MyThread().start();    //Thread-1
    }

}
