package cn.itcast.day03.demo05Collection;

public class Person implements  Comparable<Person>{   //接口实现sort排序

    private String name;
    private int age;

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
    public String toString() {
        return  "name: " + name + " - age :"+ age;
    }

    @Override
    public int compareTo(Person o) {
//        return 0;              //认为元素都是相同的

        //自定义比较规则，比较两个人的年龄， （this 参数Person）
        //return this.getAge() - o.getAge();                  //升序
        return o.getAge()  - this.getAge();                 //降序
    }
}
