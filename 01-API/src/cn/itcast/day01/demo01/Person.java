package cn.itcast.day01.demo01;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
/*
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    public Person() {
    }
/*    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;
            return this.age == p.age  && this.name .equsls(p.name);
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
                                                //getClass() != o.getClass()  使用反射技术，判断是否为Person类型，等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
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
}
