package cn.itcast.day06.demo09Synchronied.demo08Synchronied;

/*
使用同步方法，解决安全问题

 */

import cn.itcast.day06.demo07Synchronied.RunnableImpl;

public class Demo01Synchronied {

    public static void main(String[] args) {
        Runnable run = new RunnableImpl();

        System.out.println(run);
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
