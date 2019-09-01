package cn.itcast.day06.demo09Synchronied.demo08Synchronied;


//静态锁保证安全
public class RunnableImpl implements Runnable {
    private static int ticket =100;
    @Override
    public void run() {
        System.out.println("this "+this);
        while(true){
                payticeket();
        }
    }


                            /*
                                 使用同步方法， 保证安全
                                 同步方法也会把方法内部的代码块锁住
                                 只让一个线程执行
                                 同步方法锁住的对象就是实现类对象 new RunnableImpl
                                 也就是this
                             */

    public static synchronized void payticeket(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" --> 正在卖第 " + ticket +" 张票");
            ticket--;
        }
    }
}
