package cn.itcast.day07.demo04Lambda;

public class Demo01Cook {

    public static void main(String[] args) {

        //使用匿名内部类
        methodCook(new Cook() {
            @Override
            public void cooker() {
                System.out.println("吃饭了");
            }
        });

        //使用lambda简化
        methodCook(()->{
            System.out.println("吃饭了了");
        });

        //lambda省略优化
        methodCook(()->System.out.println("吃饭了了"));
    }

    private static void methodCook(Cook c) {
        c.cooker();
    }
}
