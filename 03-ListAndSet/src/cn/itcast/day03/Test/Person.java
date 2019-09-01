package cn.itcast.day03.Test;

import java.util.Objects;

public class Person implements Comparable<Person> {          //继承Comparable 接口，排序

    private String name ;
    private int age ;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String  toString (){
        return "name:" +name + "  age:  "+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {             //同一个人 如果名字和年龄相同， 则会被排除

       return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        // return this.getAge() - o.getAge();   //降序
        return o.getAge() - this.getAge();  //升序
    }
}
