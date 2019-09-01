package cn.itcast.day10.demo05PrintStream;

/*
    PrintStream中
        使用System.setOut改变输出语句目的地为参数中传递的打印流目的地
        static void setOut (PrintStream ps)
            重新分配”标准“流
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");


        PrintStream ps  = new PrintStream("10-IO\\目的地是打印流.txt");
        System.setOut(ps);   //把输出语句， 目的地改变为目的地打印流
        System.out.println("我是在目的地是打印流 中输出");
    }

}
