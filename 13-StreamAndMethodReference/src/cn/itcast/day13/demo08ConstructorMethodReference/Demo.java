package cn.itcast.day13.demo08ConstructorMethodReference;

/*
    类的构造器
 */
public class Demo {

    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builder(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法， 方法的参数PersonBuilder是一个函数式接口， 所以可以使用Lambda
/*
        printName("迪丽热巴 ", ( String name)->{
            return new Person(name);
        });
*/

        /*
            使用方法引用优化lambda
            构造方法new Person(String name)已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        printName("古力娜扎",Person::new);//使用Person类的构造方法，传递姓名，构造参数

    }

}
