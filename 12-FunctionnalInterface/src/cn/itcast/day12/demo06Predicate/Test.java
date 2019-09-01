package cn.itcast.day12.demo06Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

    public static  ArrayList<String> check(String[] arr, Predicate<String > pre1, Predicate<String > pre2){
        ArrayList<String > list = new ArrayList<>();
        for (String message : arr) {
            boolean b = pre1.and(pre2).test(message);
            if (b){
                list.add(message);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String > list ;
        String [] arr ={"迪丽热巴,女", "古力娜扎,女","马儿扎哈,男","赵丽颖, 女"};

        list = check(arr,(message)->{
            String name = message.split(",")[0];
            return name.length() ==4 ;
        },(message)->{
            String sex = message.split(",")[1];
            return sex.equals("女");
        });

        for (String message : list) {
            System.out.println(message);
        }
    }
}
