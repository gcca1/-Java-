package com.gcc.javacore.day19第四章getset方法和构造方法;

public class MainTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getHireDay());


        Person person1 = new Person();
        person1.setName("小明");
        System.out.println(person1.getName());

        Person person = new Person();
        person.setName("小虎");
        System.out.println(person.getName());
        person.setAge(-10);
        System.out.println(person.getAge());
        char sex = '男';
        person.setSex(sex);
        System.out.println(person.getSex());
        //封装
        //1.第一步，属性私有化
        //2.第二步，提供公有get set 方法进行赋值和访问

    }
}
//class Person{
//    public String name;
//    public int age;
//}
