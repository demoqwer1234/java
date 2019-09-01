package cn.itcast.day10.demo05PrintStream;
/*
    PrintStream
        println()为特有方法，写什么数据都是原样输出
        write()  方法会先查询ASSII码表

 */
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");
        PrintStream ps = new PrintStream("10-IO\\Print.txt");

        ps.write(97);   //a
        ps.println(97);    //97
        ps.println("helloWorld, w我是打印流");
        ps.close();
    }
}
