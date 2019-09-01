package cn.itcast.day13.demo04ObjectMethodReference;

/*
  通过对象名， 引用成员方法：
    使用前提是对象名已经存在， 成员方法也存在
    就可以通过对象名引用成员方员
 */
public class Demo01ObjectMethodReference {

    public static void printUpp(Printble p){
        p.printble("hello");
    }

    public static void main(String[] args) {
        //Printble接口是一个函数式接口， 所以可以使用Lambda
        /*printUpp((s)->{
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            //调用MethodRerObject对象中的成员 PrintUpperCaseString（）方法， 把字符串按大写输出
            obj.PrintUpperCaseString(s);
        });*/

         //printUpp(s->new MethodRerObject().PrintUpperCaseString(s));
        /*
            使用方法引用优化Lambda
            对象是已经存在的methodRerObject
            成员方法是已经存在的PrintUpperCaseString
            所以可以使用对象名引用方法
        */
        MethodRerObject obj = new MethodRerObject();
        printUpp(obj::PrintUpperCaseString);

    }

}
