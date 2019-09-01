package cn.itcast.day13.Test01;

/*
    Pedicate接口使用
        1.	请在测试类main方法中完成以下需求
        已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
        a)	使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
        b)	使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        c)	使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数

            遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
        i.	打印自然数的个数
        ii.	打印负整数的个数
        iii.	打印绝对值大于100的偶数的个数
        iv.	打印是负整数或偶数的数的个数

 */
import java.util.ArrayList;
import java.util.function.Predicate;

public class Test01Predicate {

    public static ArrayList<Integer> method(Integer []arr, Predicate<Integer > i){   //判断型接口
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer e : arr) {
            boolean b = i.test(e);
            if (b){
                list.add(e);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1=method(arr, (Integer i) -> i >= 100);        //自然数
        list2=method(arr, (i) -> Math.abs(i) >= 100);     //绝对值是否大于100
        list3 = method(arr, (i) -> i % 2 == 0);         //偶数

        long count = list1.stream().count();
        System.out.println("自然数的个数"+count);
        System.out.println("负整数的个数"+(arr.length-count));
        long count1 = list2.stream().count();
        System.out.println("绝对值大于100的偶数的个数"+count1);
        long count2 = list3.stream().count();
        System.out.println("偶数"+count2);

    }
}
