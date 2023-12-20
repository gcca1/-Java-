package com.gcc.javacore.day20第四章访问权限和static单例模式;

import java.time.LocalDate;

public class Employee {

    /**
     * 静态属性  全局的变量，所有对象都可共享值
     */
    private static int nextId;

    /**
     * 通常是通过类名.静态属性进行访问
     * 静态方法可以访问静态属性但是不能访问实例（成员）属性
     * 静态方法
     * @return
     */
    public static int getNextId(){
        return nextId;
    }

    /**
     * 静态属性，通常是通过类名.静态属性进行访问
     */
    public static final double PI=3.14;

    private int id;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public char getSex() {
        return sex;
    }

    /**
     * 显示域（属性）初始化
     */
    private String name = "张三";
    private double salary = 3000;
    private LocalDate hireDay = LocalDate.now();

    //默认的访问修饰符
    final char sex ;

    public Employee(){
        sex ='男';
    }

    public double showSalary(){
        return salary;
    }
    /**
     * 成员方法  可以访问所属类所有对象的私有属性
     * @param employee
     * @return
     */

    public boolean equals(Employee employee) {

        return this.name.equals(employee.name);
    }
    public boolean equals(Person person) {

        return this.name.equals(person.getName());
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
