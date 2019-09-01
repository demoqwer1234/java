package cn.itcast.day01.Demotest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;

public class DemoFormat {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sim  = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sim.parse("2018-09-09");
        System.out.println(date);
        SimpleDateFormat sim2  = new SimpleDateFormat("yyyy年MM月dd日");
        String str = sim2.format(date);
        System.out.println(str);
    }

}
