package cn.itcast.day13.demo05StaticMethodReferece;
/*
    同过类名引用静态成员
 */

public class Demo01 {

    public static void calc(int num, Calcable c){
        int res = c.calABS(num);
        System.out.println(res);
    }

    public static void main(String[] args) {
        /*calc(-100,(num)->{
            return Math.abs(num);
        });
*/

        /*
            使用方法引用优化Lambda表达式
            math类是存在的
            abs（）方法是静态存在， 所以可以直接类名调用
         */
         calc(-200,Math::abs);
    }

}
