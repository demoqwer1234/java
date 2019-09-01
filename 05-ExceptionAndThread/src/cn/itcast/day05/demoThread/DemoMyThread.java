package cn.itcast.day05.demoThread;

public class DemoMyThread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程" + i);
        }
    }

}
