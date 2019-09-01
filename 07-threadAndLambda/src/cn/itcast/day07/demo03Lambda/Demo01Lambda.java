package cn.itcast.day07.demo03Lambda;

public class Demo01Lambda {

    public static void main(String[] args) {
        //使用匿名内部类
       Runnable r = new Runnable(){
           @Override
           public void run() {
               System.out.println(Thread.currentThread().getName()+"创建一个新线程");
           }
       };
       Thread t = new Thread(r);
       t.start();

       //使用匿名内部类简化
       new Thread(new Runnable(){
           @Override
           public void run() {
               System.out.println(Thread.currentThread().getName()+"创建一个新线程");
           }
       }).start();

       //使用Lambda
        new Thread(() ->{
                System.out.println(Thread.currentThread().getName()+"创建一个新线程");
        }).start();

        //lambda省略优化
        new Thread(() ->System.out.println(Thread.currentThread().getName()+"创建一个新线程")).start();
    }
}
