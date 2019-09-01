package cn.itcast.day05.demo03Exception;

import java.util.Scanner;

public class Demo01RegisterException {

    static String[] useNames = {"张三","李四", "王五"};

    public static void main(String[] args) /*throws RegisterException*/ {

        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入你想注册的名字");
        String useName = sc.next();


        checkName(useName);

    }

    private static void checkName( String useName )/* throws RegisterException*/ {

        for (String name : useNames){
            if (name.equals(useName)){
                System.out.println("该名字已经注册过");
                try {
                    throw new RegisterException();
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法
                }
            }
        }
        System.out.println("您注册成功");
    }
}
