package cn.itcast.day07.demo02ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Demo01ThreadPool {

    public static void main(String[] args) {
        //使用线程池的工厂类Executors 里边的提供的静态方法newFixedThreadPool生产一个指定线程的数量的池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //调用Executors 中的submit方法 ， 传递线程任务， 开启线程， 执行run方法
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //调用shutdown 方法 ，销毁线程池 （不建议开启）
        es.shutdown();

      //  es.submit(new RunnableImpl());  //报错， 因为线程池已关闭

    }

}
