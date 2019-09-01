package cn.itcast.day12.demo03LambdaTest;

public class Demo01Runnable {

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"->" +"线程开始启动了");   //获取当前线程的名字
            }
        });
        startThread(()-> System.out.println(Thread.currentThread().getName()+"->" +"线程开始启动了"));
    }

    public static void startThread(Runnable run){
        new Thread(run).start();
    }

}
