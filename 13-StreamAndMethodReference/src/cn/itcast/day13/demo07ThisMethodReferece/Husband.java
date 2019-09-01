package cn.itcast.day13.demo07ThisMethodReferece;

/*
    通过this引用本类的成员
 */
public class Husband {

    public void buy(){
        System.out.println("买房子");
    }
    public void marry(Richable r ){
        r.rich();
    }
    public void happy(){

         //marry(()->buy());

         /*
            使用this调用本类方法
          */
         marry(this::buy);
    }


    public static void main(String[] args) {
        new  Husband().happy();
    }


}
