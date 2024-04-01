package com.gcc.javacore.day24第五章抽象类和Object类;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee extends Person{

    private double salary;
    private LocalDate hireDay;

    @Override
    public void getDescription() {

        System.out.println("员工姓名:"+super.getName());
        System.out.println("薪水:"+this.salary);
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
