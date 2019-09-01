package cn.itcast.day06.demo01Thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        //String name = getName();
        //System.out.println(name);

      //  Thread t = Thread.currentThread();
        //System.out.println(t);

        //链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
