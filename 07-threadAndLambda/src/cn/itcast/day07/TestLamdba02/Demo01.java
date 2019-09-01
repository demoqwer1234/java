package cn.itcast.day07.TestLamdba02;

public class Demo01 {

    public static void main(String[] args) {

        //Lambda最简模式
        int sum = invokeCalc(120, 100,(int a, int b ) -> a-b );

        //Lambda 标准模式
        /*int sum = invokeCalc(200, 100, (int a, int b) ->{
                return  a-b ;
        });*/

        //原始模式
        /*int sum = invokeCalc(1000, 100, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a - b;
            }
        });*/


        System.out.println(sum);

    }

    private static int invokeCalc(int a, int b , Calculator ca ) {
        int sum = ca.cal(a ,  b );
        return sum;
    }
}
