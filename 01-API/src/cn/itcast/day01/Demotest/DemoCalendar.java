package cn.itcast.day01.Demotest;


import java.util.Calendar;

public class DemoCalendar {

    public static void main(String[] args) {

        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.YEAR, 2018);
        ca.set(Calendar.MONTH, 7);
        ca.set(Calendar.DATE, 5);
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH)+1;
        int date = ca.get(Calendar.DATE);

        System.out.println(year + "年" + month + "月" + date + "日");

        char week = getWeek(ca.get(Calendar.DAY_OF_WEEK));
        //输出结果
        System.out.println(year + "年" + month + "月" + date + "日是星期" + week);
    }

    //定义方法，获取星期汉字
    public static char getWeek(int a) {
        char[] c = {' ', '日', '一', '二', '三', '四', '五', '六'};
        return c[a];
    }
}




