package cn.itcast.day03.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedhashSet {

    public static void main(String[] args) {
        LinkedHashSet<String > set = new LinkedHashSet<>();
        Collections.addAll(set,"王昭君","王昭君","西施","杨玉环","貂蝉");
        Collections.addAll(set,"妲己");
        System.out.println(set);

        set.add("林黛玉");
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==========");
        for(String str : set){
            System.out.println(str);
        }

    }

}
