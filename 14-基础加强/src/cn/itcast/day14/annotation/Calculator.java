package cn.itcast.day14.annotation;

public class Calculator {

    @Check
    public void add(){
        String str = null;
        str.equals("");
        System.out.println("1+0 ="+(1+0));
    }

    @Check
    public void sub(){
        System.out.println("1-1 =" +(1-1) );
    }

    @Check
    public void mul(){
        System.out.println("4*5 = "+(4*5));
    }
    @Check
    public void div(){
        System.out.println("1/0 = "+(1/0));
    }

    public void show(){
        System.out.println("永无bug");
    }

}
