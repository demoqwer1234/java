package cn.itcast.day07.BaoZiPu;

public class ChiHuo extends  Thread {

    private BaoZi bz ;

    public ChiHuo (BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        synchronized (bz) {

            while (true) {
                //如果没有包子， 吃货线程进入等待
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (bz.flag == true) {
                    System.out.println("吃货开始吃包子");

                    //睡眠5 秒钟 用于吃货吃包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("吃货正在吃" +bz.Pi+bz.xian+"的包子");
                    bz.flag = false;

                    //唤醒包子铺线程开始生产包子
                    bz.notify();
                    System.out.println("吃货已经把" +bz.Pi+bz.xian+"的包子吃完了,包子铺生产包子");
                    System.out.println("==============");
                }
            }
        }
    }
}
