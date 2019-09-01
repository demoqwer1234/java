package cn.itcast.day06.demo06ThreadSafe;

public class Demo01 {

    public static void main(String[] args) {
        Runnable run =   new Runnable(){
            @Override
            public void run() {
                int ticket = 100;
                while(true){
                    if (ticket >0){
                        try {
                            Thread.sleep(10);        //睡眠十秒 提高错误率
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"  正在卖第 " + ticket +" 张票");
                        ticket--;
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
