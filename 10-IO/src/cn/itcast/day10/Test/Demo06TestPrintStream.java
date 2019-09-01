package cn.itcast.day10.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo06TestPrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("10-IO\\Print.txt");
        ps.println("最新");
        ps.println(97);
        System.out.println(97);

        System.setOut(ps);
        System.out.println("我不在控制台输出");

    }

}
