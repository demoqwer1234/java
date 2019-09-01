package cn.itcast.day04.demoJDK9;


import java.util.List;
import java.util.Map;
import java.util.Set;


//一旦用of添加后，便不能再用put方法，或者add方法修改
public class DemoJDK9 {

    public static void main(String[] args) {
        List<String > list = List.of("aaa","bbb","ccc","ddd");

        Set<String > set = Set.of("a","b","c");

        Map<Integer,String> map =Map.of(90,"aaa",80,"bbbb",70,"ccc" );
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);

    }

}
