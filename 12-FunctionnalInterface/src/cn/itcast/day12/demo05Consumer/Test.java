package cn.itcast.day12.demo05Consumer;

import java.util.function.Consumer;

public class Test {

    public static void method(String []arr, Consumer<String> con1,  Consumer<String> con2){
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String [] arr= {"迪丽热巴, 女", "古力娜扎,女","马儿扎哈,男"};
        method(arr,(message)->{
            String name = message.split(",")[0];
            System.out.print("姓名：" +name);
        },
        (message)->{
            String sex = message.split(",")[1];
            System.out.println(" ,  性别:"+sex);
        });
    }



}
