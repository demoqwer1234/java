package cn.itcast.day01.demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {
//        DateFormat d = new DateFormat();
        method();
        System.out.println("============");
        method2();
    }
       //转换为现代的文本模式
    public static void method() {
        SimpleDateFormat ss = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date d =new Date();
        String str = ss.format(d);

        System.out.println(d);
        System.out.println(str);
    }

    //转为原本模式
    public static void method2() throws ParseException {

        SimpleDateFormat sss = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = sss.parse("2019年07月03日10时49分46秒");
        System.out.println(date);

    }

}
