package cn.itcast.day06.Test;

public class Mythread extends  Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
