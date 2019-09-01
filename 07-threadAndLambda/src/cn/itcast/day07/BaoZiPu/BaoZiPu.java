package cn.itcast.day07.BaoZiPu;

public class BaoZiPu extends Thread {
    //创建一个包子对象
    private  BaoZi bz ;

    //使用带参变量， 为这个包子变量开始赋值
    public   BaoZiPu(BaoZi bz){
        this.bz = bz;
    }


    @Override
    public void run() {
        int count = 0;

        //使用同步锁机制 ， 保证包子线程安全,两个线程只能有一个在执行
        synchronized (bz) {
            while (true) {
                //对包子铺进行判断
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (bz.flag == false) {
                    if (count % 2 == 0) {
                        //生产薄皮 牛肉馅包子
                        bz.Pi = "薄皮";
                        bz.xian = "牛肉馅";
                    } else {
                        //生产冰皮  奶黄包子
                        bz.Pi = "冰皮";
                        bz.xian = "奶黄馅";
                    }
                    ;
                    System.out.println("包子铺正在生产 " + bz.Pi + bz.xian + "的包子");

                    //睡眠3 秒钟 用来生产包子
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    bz.flag = true;
                    count++;

                    //唤醒吃货线程
                    bz.notify();
                    System.out.println("包子已经生产好了， 吃货开吃了");

                }
            }
        }
    }
}
