package cn.itcast.day07.demo02ThreadPool;

public class RunnableImpl implements Runnable {
    //设置线程任务
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"生产一个新的线程");
    }
}
