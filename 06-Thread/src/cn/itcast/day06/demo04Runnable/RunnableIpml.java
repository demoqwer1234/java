package cn.itcast.day06.demo04Runnable;

public class RunnableIpml implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() +"-->" +i);
        }
    }
}
