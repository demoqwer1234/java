package cn.itcast.day06;
/*
模拟使用wait 与 notify 方法
 */
public class demo12WaitAndNotify {

    public static void main(String[] args) {
        Object obj = new Object();

        //创建顾客
        new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("顾客告知老板包子数量");

                    //保证等待与唤醒只能有一个执行， 需要使用同步技术
                    synchronized (obj){
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("顾客开始吃包子");
                    System.out.println("========");
                }
            }
        }.start();

        //创建老板做包子
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //让老板5秒之后开始做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板做好包子，唤醒顾客吃");
                        obj.notify();
                    }
                }
            }
        }.start();

    }

}
