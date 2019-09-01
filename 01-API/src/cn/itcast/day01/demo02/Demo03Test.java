package cn.itcast.day01.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo03Test {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期   yyyy-MM-dd");
        String birday = sc.next();

        //用SimpleDateFormat 类中的parse方法， 把字符串的出生日期解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birday);
        System.out.println("date格式出生日期为： "+date);

        //把Date格式的出生日期转换为毫秒值
        Long birdaydate = date.getTime();
        System.out.println("出生日期毫秒值为： "+birdaydate);

        long today  = new Date().getTime();
        System.out.println("今天的毫秒值为; "+today);
        long time = today - birdaydate ;

        System.out.println(" 您所出生的天数为："+ time/1000/60/60/24);

    }

}
