package cn.itcast.day01.demo03;

import java.util.Calendar;


public class demoCalendar {

    public static void main(String[] args) {
        //method();
        //method1();
        method03();
    }

    private static void method03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONDAY,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONDAY );    //获取的时西方的月份，0-11   东方为1-12.所以得+1
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void method1() {
        Calendar c = Calendar.getInstance();
         c.set(Calendar.YEAR,9999);
            c.set(Calendar.MONDAY,9);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONDAY );    //获取的时西方的月份，0-11   东方为1-12.所以得+1
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    private static void method() {
        Calendar c = Calendar.getInstance() ;
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONDAY );    //获取的时西方的月份，0-11   东方为1-12.所以得+1
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

}
