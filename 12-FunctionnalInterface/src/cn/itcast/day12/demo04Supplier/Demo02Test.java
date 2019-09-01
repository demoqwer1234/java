package cn.itcast.day12.demo04Supplier;

import java.util.function.Supplier;

public class Demo02Test {

    public static int getMax(Supplier<Integer> sup ){
        return sup.get();
    }

    public static void main(String[] args) {
        int []arr ={12,67,100,15,78,120};
        int res = getMax(()->{
            int max= arr[0];
            for (int i : arr) {
                if (max < i){
                    max = i;
                }
            }
            return max;
        });

        System.out.println(res);
    }

}
