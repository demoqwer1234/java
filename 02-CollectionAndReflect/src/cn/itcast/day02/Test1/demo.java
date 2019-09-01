package cn.itcast.day02.Test1;

import java.util.ArrayList;

public class demo {

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        System.out.println("a  " +method(list,"a") );
        System.out.println("b  " +method(list,"b") );
        System.out.println("c  " +method(list,"c") );
    }

    private static int method(ArrayList<String  >  list ,String s) {
        int count =0;
        for(String string :list){
            if(s.equals(string)){                  //如果一致就+1
                count++;
            }
        }
        return count;
    }

}
