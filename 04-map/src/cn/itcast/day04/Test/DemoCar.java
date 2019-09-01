package cn.itcast.day04.Test;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoCar {

    public static void main(String[] args) {
        Car car1 = new Car("雪佛兰","白色");
        Car car2 = new Car("本田","红色");
        Car car3 = new Car("丰田","黑色");
        Car car4 = new Car("雪佛兰","白色");           //与car1 的值相同

        HashMap<Car , Integer> map = new HashMap<>();
        map.put(car1 , 12000);
        map.put(car2 , 13000);
        map.put(car3 , 14000);
        map.put(car4 , 20000);
        System.out.println(map);

        Set<Map.Entry<Car, Integer>> set = map.entrySet();

        Iterator<Map.Entry<Car, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Car, Integer> en = it.next();
            Car key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key +" == " +value);
        }
        System.out.println("=============");

        for (Map.Entry<Car, Integer> entry: set){
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+ "==" +value);
        }

    }
}
