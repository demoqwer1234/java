package cn.itcast.day05.Test02;

public class DemoMyThread {

    public static void main(String[] args) {       //双线程   这边为主线程
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 1; i <= 100; i++) {
            if (i %2  == 1){
                System.out.println("子线程打印奇数" +i);
            }
        }
    }

}
