package com.gcc.javacore.day22第五章继承和方法重写;

import java.time.LocalDate;

/**
 * 员工类
 */
public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 薪水
     */
    private double salary;
    /**
     * 发薪日
     */
    private LocalDate hireday;

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

    public LocalDate getHireday() {
        return hireday;
    }

    public void setHireday(LocalDate hireday) {
        this.hireday = hireday;
    }
}
