package com.gcc.javacore.day20第四章访问权限和static单例模式;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setName("张三");
//
//        Employee employee1 = new Employee();
//        employee1.setName("李四");
//
//        employee.equals(employee);
//
//        employee.showSalary();
        Employee employee0 = new Employee();
        employee0.setId();
        System.out.println(employee0.getId());
        Employee employee1 = new Employee();
        employee1.setId();
        System.out.println(employee1.getId());
        Employee employee2 = new Employee();
        employee2.setId();
        System.out.println(employee2.getId());
        Employee employee3 = new Employee();
        employee3.setId();
        System.out.println(employee3.getId());
        //employee0.sex;
        System.out.println(Employee.PI);
        Employee.getNextId();

        //                    看成是工厂
        LocalDate localDate = LocalDate.now();
        Person person = Person.init();

        /**
         * 访问修饰符
         * static属性 方法 类名.属性/方法
         * 单例模式（工厂方法）
         */





    }
}
