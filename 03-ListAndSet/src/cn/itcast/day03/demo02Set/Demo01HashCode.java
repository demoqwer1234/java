package cn.itcast.day03.demo02Set;

public class Demo01HashCode {

    public static void main(String[] args) {
        Person  p1 = new Person();
        System.out.println(p1.hashCode());
        Person  p2 = new Person();
        System.out.println(p2.hashCode());

        System.out.println(p1);
        System.out.println(p2);

        String s1 = "abc";
        String s2 = "cba";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 = "重地";
        String s4 = "通话";
        System.out.println(s3.hashCode());            //哈希冲突
        System.out.println(s4.hashCode());

    }

}
