package cn.itcast.day04.demo06DDZ;


import java.util.*;

public class DemoDDZ {

    public static void main(String[] args) {
        List<String > numbers  =  List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        List<String > colors = List.of("♠","♥","♣","♦");


        Map<Integer, String > poker = new HashMap<>();
        ArrayList<Integer> pokerindex = new ArrayList<>();         //用ArrayList 查询更快
        int index = 0;

        //把大王和小王都放入poker中
        poker.put(index,"大王");
        pokerindex.add(index);
        index++;
        poker.put(index,"小王");
        pokerindex.add(index);
        index++;


        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color+number);
                pokerindex.add(index);
                index++;
            }
        }

        //洗牌
        Collections.shuffle(pokerindex);

        //发牌
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < pokerindex.size(); i++) {
            int num = pokerindex.get(i);
            if(i >= 51){
                diPai.add(num);
            }else if(i % 3 == 0){
                p1.add(num);
            }else if(i % 3 == 1){
                p2.add(num);
            }else if(i % 3 == 2){
                p3.add(num);
            }
        }
        //排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(diPai);

        //看牌
        lookPoker("刘德华",p1,poker);
        lookPoker("周润发",p2,poker);
        lookPoker("谭维维",p3,poker);
        lookPoker("底牌",diPai,poker);

    }

    private static void lookPoker(String name, ArrayList<Integer> list,Map<Integer, String > poker) {
        System.out.print(name +": ");
        for (Integer index :list){
            //根据list中的索引，找到poker中的value
            String value = poker.get(index);
            System.out.print(value+ "  ");
        }
        System.out.println();
    }

}
