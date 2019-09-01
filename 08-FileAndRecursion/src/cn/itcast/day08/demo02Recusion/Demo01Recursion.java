package cn.itcast.day08.demo02Recusion;
/*
    递归求阶乘
 */
public class Demo01Recursion {

    public static void main(String[] args) {
        int sum = methodRecursion(3);
        System.out.println(sum);
    }

    private static int  methodRecursion(int n) {
        if (n== 1){
            return 1;
        }
        return  n * methodRecursion(n-1);
    }

}
