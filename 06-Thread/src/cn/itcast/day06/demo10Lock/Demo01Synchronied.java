package cn.itcast.day06.demo10Lock;

/*
使用Lock锁，解决安全问题
lock.lock();  // block until condition holds
     try {
       // ... method body
     } finally {
       lock.unlock()
     }

 */

import cn.itcast.day06.demo07Synchronied.RunnableImpl;

public class Demo01Synchronied {

    public static void main(String[] args) {
        Runnable run = new RunnableImpl();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }

}
