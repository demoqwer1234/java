package cn.itcast.day06.demo03Sleep;


public class Demo01Sleep {

    public static void main(String[] args) {
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);            //睡眠一秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
