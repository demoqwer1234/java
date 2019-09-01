package cn.itcast.day07.TestLambda;

public class Demo01 {

    public static void main(String[] args) {
        invokeDirect(()-> System.out.println("Director -->> 导演开始拍电影了"));    //重写Director 中的makeMovie方法
    }

    private static void invokeDirect(Director d) {
        d.makeMovie();                                //调用Director 中的抽象方法
    }

}
