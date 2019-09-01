package cn.itcast.day06.Test;


public class Demo01test {

    public static void main(String[] args) {
        Mythread mt  = new Mythread();
        mt.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("=========");

        RunnableImpl run = new RunnableImpl();
        Thread t  =new Thread(run);
        t.start();
    }


}
