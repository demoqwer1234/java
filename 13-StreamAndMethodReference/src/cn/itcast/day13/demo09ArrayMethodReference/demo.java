package cn.itcast.day13.demo09ArrayMethodReference;

/*
    数组的构造器引用
 */
public class demo {

    public static int [] creatArray(int length,ArrayBuilder ab){
        return  ab.buildArray(length);
    }

    public static void main(String[] args) {
       /* int[] arr1 = creatArray(10, (len) -> {
            //根据数组长度创建，并返回
            return new int[len];
        });
        System.out.println(arr1.length);*/

        //使用方法引用
        /*
            已知创建的是int[]数组
            数组长度已知
            可以使用int[] new创建
         */
        int [] arr2 = creatArray(12, int[]::new);
        System.out.println(arr2.length);

    }




}
