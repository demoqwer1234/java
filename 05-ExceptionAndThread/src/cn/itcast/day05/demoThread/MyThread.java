package cn.itcast.day05.demoThread;

public class MyThread extends  Thread{

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程"+ i);
        }
    }

}
