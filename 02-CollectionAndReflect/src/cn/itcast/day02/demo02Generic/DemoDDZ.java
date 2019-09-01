package cn.itcast.day02.demo02Generic;

import java.util.ArrayList;
import java.util.Collections;

public class DemoDDZ {

    public static void main(String[] args) {
        //准备牌
        ArrayList<String > poker = new ArrayList<>();
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"} ;
        String[] color = {"♠","♥","♦","♣"};

        poker.add("大王");
        poker.add("小王");
        for(String number:num){
            for(String colorr : color){
                //System.out.println(colorr+number);
                poker.add(colorr+number);
            }
        }

        //洗牌
        Collections.shuffle(poker);          //使用shuffle方法进行随机打乱循序
//        System.out.println(poker);

        //发牌
        ArrayList<String > player1 = new ArrayList<>();
        ArrayList<String > player2 = new ArrayList<>();
        ArrayList<String > player3 = new ArrayList<>();
        ArrayList<String > Dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >=51){
                Dipai.add(p);
            }else if (i % 3 == 0){
                player1.add(p);
            }else if (i % 3 == 1){
                player2.add(p);
            }else if (i % 3 == 2){
                player3.add(p);
            }
        }

        System.out.print("张三:  ");
        method(player1);

        System.out.println();
        System.out.print("李四： ");
        method(player2);

        System.out.println();
        System.out.print("王五： ");
        method(player3);

        System.out.println();
        System.out.print("底牌： ");
        method(Dipai);
     }

     public static void method( ArrayList<String > list ){
        for (String s : list){
            System.out.print(" "+s+" ");
        }
     }

}
