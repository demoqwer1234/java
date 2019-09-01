package cn.itcast.day06.demo07Synchronied;



public class Demo01Synchronied {

    public static void main(String[] args) {

        Runnable run =   new Runnable(){
            @Override
            public void run() {
                //创建票
                int ticket = 100;
                //创建一个锁对象
                Object obj = new Object();
                while(true){
                    //同步代码块
                    synchronized (obj){
                        if (ticket >0){
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
            }
        };

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();

    }
}
