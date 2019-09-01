package cn.itcast.day04.Test;

import java.util.Objects;

public class Car {

    private String name ;
    private String color;

    public Car(){

    }
    public Car (String name, String color){
        this.name = name;
        this.color = color;
    }
    public void getName(String name){
        this.name = name;
    }
    public String setName(){
        return name;
    }

    public void getColor (String color) {
        this.color = color;
    }
    public String setColor (String color){
        return color;
    }

    @Override
    public String toString(){
        return name + " : " +color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color);
    }
}
