package cn.itcast.day01.Demotest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String s1 = sim.format(date);
        System.out.println(s1);

    }

}
