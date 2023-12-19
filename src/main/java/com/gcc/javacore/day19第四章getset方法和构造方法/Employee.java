package com.gcc.javacore.day19第四章getset方法和构造方法;

import java.time.LocalDate;

/**
 * 标准的Java 类 Java bean
 */

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    //1.private 私有的访问修饰符 权限，只能在本类当中使用
    //2.get set 方法。 get set 方法，是如何编写的。作用
    //3.this 当前对象的引用
    //4.构造方法
    /**
     * 构造器  它的作用：就是创建对象，初始化属性
     * 特点1 构造器与类名同名
     * 特点2 每个类有1个或多个构造器
     * 特点3 当我们不显式声明构造方法的话，编译器会主动帮我们生成一个无参构造方法
     * 特点4 构造器是没有返回值的
     * 特点5 构造器结合着 new 关键字调用
     * 构造方法
     */
    public Employee(){
        this.name = "张三";
        this.salary = 10000;
        this.hireDay = LocalDate.now();
    }
    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
