package cn.itcast.day03.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","二丫","钱六","孙七");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);

            if(s.equals("二丫")){      // 或者
           // if(s == "二丫"){               //相同则替换
                list.set(i,"王二丫");
            }
        }
        System.out.println(list);

    }

}
