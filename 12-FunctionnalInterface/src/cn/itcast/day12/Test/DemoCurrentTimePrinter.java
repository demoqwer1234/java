package cn.itcast.day12.Test;

public class DemoCurrentTimePrinter {

    public static void main(String[] args) {
        CurrentTimePrinterImpl ctp =new CurrentTimePrinterImpl();
        //使用内部类
        /*ctp.showLongTime(new CurrentTimePrinter() {
            @Override
            public void printCurrentTime() {
                System.out.println(System.currentTimeMillis());
            }
        });*/

        //使用Lambda表达式
        ctp.showLongTime(()->{
            System.out.println(System.currentTimeMillis());   //获取当前系统毫秒值
        });

        //使用Lambda优化
      //  ctp.showLongTime(()-> System.out.println(System.currentTimeMillis()));
    }

}
