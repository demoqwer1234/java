package cn.itcast.day01.demo06Integer;

public class demo01Integer {

    public static void main(String[] args) {
        //构造方法
        Integer a = new Integer(100);
        System.out.println(a);

        Integer b = new Integer("100");
        System.out.println(b);

        //静态方法
        Integer c = Integer.valueOf(100);
        System.out.println(c);
        Integer d = Integer.valueOf("100");
        System.out.println(d);

        //拆箱
        int i = a.intValue();             //把包装类转化为int类型
        System.out.println(i);


    }

}
