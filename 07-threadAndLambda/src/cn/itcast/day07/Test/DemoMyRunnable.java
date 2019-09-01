package cn.itcast.day07.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoMyRunnable {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        MyRunnable r = new MyRunnable();

        es.submit(new Thread(r));
        es.submit(new Thread(r));

       //es.shutdown();                //关闭线程
    }
}
