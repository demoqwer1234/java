package cn.itcast.day06.demo07Synchronied;

/*
使用同步代码块，解决安全问题
synchronized(){

}
 */

public class Demo02Synchronied {

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
