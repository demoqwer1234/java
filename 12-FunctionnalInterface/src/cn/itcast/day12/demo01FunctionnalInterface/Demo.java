package cn.itcast.day12.demo01FunctionnalInterface;

public class Demo {

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写");
            }
        });

        show(new MyFunctionalInterfaceImpl());

        show(()->{
            System.out.println("使用lambda表达式重写");
        });

        show(()-> System.out.println("使用lambda优化"));


    }

    private static void show(MyFunctionalInterface fun) {
        fun.method();
    }

}
