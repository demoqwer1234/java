package cn.itcast.day12.demo04Supplier;

import java.util.function.Supplier;

public class Demo01Supplier {

    /*
    `   Supplier为生产型接口， 指定接口为什么泛型， 那么接口get（）方阿飞， 就返回什么类型的数据
     */
    public static String  getString(Supplier<String > sup){
        String s = sup.get();
        return s;
    }

    public static void main(String[] args) {
        /*String s = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "胡歌";
            }
        });*/

        //使用Lambda优化
        String s = getString(()-> "卢本伟");
        System.out.println(s);
    }

}
