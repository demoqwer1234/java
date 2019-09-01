package cn.itcast.day06.demo10Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private int ticket =100;
    //创建一个ReentrantLock 对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while(true){
                if (ticket > 0) {

                    //调用lock方法
                    l.lock();
                    try {
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName()+" --> 正在卖第 " + ticket +" 张票");
                        ticket--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {

                        //使用finally无论程序是否异常， 最后都会释放lock  ， 提高程序效率
                        l.unlock();
                    }
                }
        }
    }
}
