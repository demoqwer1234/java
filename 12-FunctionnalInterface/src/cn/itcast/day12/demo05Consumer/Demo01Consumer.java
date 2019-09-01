package cn.itcast.day12.demo05Consumer;

import java.util.function.Consumer;

public class Demo01Consumer {
    /*
        Comsumer接口为消费型接口， 泛型使用String,
        可以用Consumer消费字符串

     */
    public static void method(String name, Consumer<String > con){
        //accept （）方法接收name
        con.accept(name);
    }

    public static void main(String[] args) {
        String name = "迪丽热巴";
        method(name, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(name);
                //把字符串反转输出
                String res = new StringBuffer(name).reverse().toString();       //使用StringBuffered中的reverse（）方法，进行反转
                System.out.println("反转后为：" +res);
            }
        });
    }

}
