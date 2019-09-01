package cn.itcast.day12.Test2;

public class DemoInCalc {

    public static void main(String[] args) {
        int a=10, b= 20;
        //使用Lambda
      /*  getProduct(a,b,(int y1,int y2)->{
            return y1*y2;
        });*/

        //使用简化后
        getProduct(a,b,(y1,y2)->y1*y2);
    }

    public static void getProduct(int a, int b, IntCalc ic){
        int res = ic.calc(a, b);
        System.out.println(res);
    }

}
