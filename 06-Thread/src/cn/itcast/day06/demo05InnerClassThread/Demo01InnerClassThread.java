package cn.itcast.day06.demo05InnerClassThread;


/*
三种匿名方式实现thread
 */
public class Demo01InnerClassThread {

    public static void main(String[] args) {
        new Thread() {                          //匿名内部类实现thread
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "白马" + i);
                }
            }
        }.start();


        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "黑马" + i);
                }
            }
        };
        new Thread(run).start();

        new Thread (new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "皇马" + i);
                }
            }
        }).start();

    }
}
