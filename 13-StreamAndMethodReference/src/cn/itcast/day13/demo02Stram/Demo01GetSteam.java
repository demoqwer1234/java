package cn.itcast.day13.demo02Stram;

import java.util.*;
import java.util.stream.Stream;

public class Demo01GetSteam {

    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String , Integer> map = new HashMap<>();
        //获取一个键值对， 存储到stream中
        Stream<String> stream3 = map.keySet().stream();
        //获取值，存储到stream中
        Collection<Integer> values = map.values();
        Stream<Integer> stream4 = values.stream();
        //获取键值对  (键与值得映射关系)
        Set<Map.Entry<String, Integer>> enteySet = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream5 = enteySet.stream();

        //把数组转化为stream
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);          //调用stream.of()方法
        //把可变参数转化为stream
        Integer[] arr  ={6,7,8,9};
        Stream<Integer> stream7 = Stream.of(arr);
        //把字符串得数组
        String [] arr2 = {"a","bb","ccc"};
        Stream<String> stream8 = Stream.of(arr2);
    }


}
