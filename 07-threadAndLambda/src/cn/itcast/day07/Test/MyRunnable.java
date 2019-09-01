package cn.itcast.day07.Test;

public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("我需要一个老师");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("老师来了"+Thread.currentThread().getName());
            System.out.println("教我学Java， 教完后，老师回办公室");
            System.out.println("============");
        }

    }
}
