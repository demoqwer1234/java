package cn.itcast.day05.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception {

    public static void main(String[] args) throws ParseException  {
        //编译期异常
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sim.parse("1999-05-13");

       /* Date date = null;
        try {
            date = sim.parse("1999-05-13");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        System.out.println(date);
        System.out.println("==========");

        //运行期异常


        //错误

    }

}
