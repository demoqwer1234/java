package cn.itcast.day13.Test01;

import java.util.*;
import java.util.function.Function;

/*
Function接口中，最主要的抽象方法，R apply( T t) 根据T的参数获取R的结果

    Function接口使用
        1.	使用lambda表达式分别将以下功能封装到Function对象中
        a)	求Integer类型ArrayList中所有元素的平均数
        b)	将Map<String,Integer>中value存到ArrayList<Integer>中
        2.	已知学生成绩如下
        姓名	成绩
        岑小村	59
        谷天洛	82
        渣渣辉	98
        蓝小月	65
        皮几万	70
        3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩

 */
public class Test2Function {
    //求学生的平均分
    public static void main(String[] args) {
        //  a)	求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer> ,Integer>f1 = (list)->{
            int sum = 0;
            for (Integer i : list) {
                sum =sum +i;
            }
            return sum / list.size();
        };

        // b)	将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String ,Integer>,ArrayList<Integer>  > f2 = (map)->{
            ArrayList<Integer> list = new ArrayList<>();
            Set<String> set = map.keySet();
            for (String key : set) {
                Integer value = map.get(key);
                list.add(value);
            }
            return list;
        };

        Map<String , Integer> map = new HashMap<>();
        map.put("岑小村",69);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);

        // 3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
        Integer avg = f2.andThen(f1).apply(map);
        System.out.println("平均分："+avg);

    }
}
