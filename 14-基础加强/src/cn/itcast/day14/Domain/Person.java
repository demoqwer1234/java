package cn.itcast.day14.Domain;

public class Person {

    private String name;
    private int age;
    public String a;
    public String b;
    public String c;
    public String d;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String e){
        System.out.println("eat"+e);
    }

}
