package cn.itcast.day06.demo04Runnable;

public class Demo01Runnable {

    public static void main(String[] args) {
        Runnable run = new RunnableIpml();

        //创建Thread对象, 构造方法中传递Runnable接口的实现类对象
        Thread  t = new Thread(run);
        t.start();
        for (int i = 0; i < 20; i++) {

            System.out.println(Thread.currentThread().getName() +"-->" +i);
        }
    }

}
