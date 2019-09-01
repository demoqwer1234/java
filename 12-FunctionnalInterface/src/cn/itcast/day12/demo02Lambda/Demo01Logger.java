package cn.itcast.day12.demo02Lambda;

/*
    日志案例：
        此时存在一个性能浪费，
        由于message是一个字符串拼接信息，当level ！=1 时， 程序仍然继续 将message进行拼接， 导致性能上的浪费
 */


public class Demo01Logger {

    public static void main(String[] args) {
        String msg1= "hello";
        String msg2 = "World";
        String msg3 = "java";

        show(2,msg1+msg2+msg3);
        show(1,msg1+msg2+msg3);
    }

    private static void show(int level , String message) {

        if (level == 1) {
            System.out.println(message);
        }
    }
}
