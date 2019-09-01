package cn.itcast.day12.demo05Consumer;

import java.util.function.Consumer;

public class Demo02AndThen {

    public static  void method(String str, Consumer<String > con1,Consumer<String > con2){
        /*
            不使用andThen方法

         */
        /*con1.accept(str);
        con2.accept(str);*/

        /*
            使用andThen（）方法进行连接
         */
        con1.andThen(con2).accept(str);

    }

    public static void main(String[] args) {
        method("Hello",
                (c)->{                       //把Hello作为c进行传递
                    System.out.println(c);
                        //把数据转换为大写
                    System.out.println("大写为："+c.toUpperCase());
                 },
                (c)->{
                    //把数据转换为小写
                    System.out.println("小写为："+c.toLowerCase());
                }
        );
    }

}
