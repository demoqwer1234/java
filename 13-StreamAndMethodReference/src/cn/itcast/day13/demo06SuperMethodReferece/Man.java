package cn.itcast.day13.demo06SuperMethodReferece;

/*
    通过super引用父类
 */
public class Man extends Human{
    //重写父类sayHello方法
    @Override
    public void sayHello(){
        System.out.println("hello,我是man");
    }

    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        /*method(()->{
            //创建一个父类对象
            Human h = new Human();
            //调用父类sayHello方法
            h.sayHello();
        });*/

        //因为有子父类关系， 所以可以直接调用super
     /*  method(()->{
           super.sayHello();
       });*/

       //使用super引用类方法
        method(super::sayHello);
    }
    public static void main(String [] args){
        new Man(). show();
    }

}
