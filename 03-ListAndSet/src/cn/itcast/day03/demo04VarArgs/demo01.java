package cn.itcast.day03.demo04VarArgs;

public class demo01 {

    //可变参数变量
    public static void main(String[] args) {
        int count = method(12, 8.8, "dajl", 65);

        int count1 = method1(12,24,35,54);
        System.out.println(count1);
    }

    public static int  method1( int ...arr) {     //一个方法只能有一个可变变量   ，有多个参数时，可变变量写最后面
        int count =0;
        for (int i : arr){
            count = i+count;
        }
        return count;
    }

    public static int  method(int a, double b,String s, int ...arr)     //一个方法只能有一个可变变量   ，有多个参数时，可变变量写最后面
        {
          return 0;
        }
}
