package com.gcc.javacore.day18第四章对象和对象的引用Date和LocalDateTime;

import com.gcc.javacore.day19第四章getset方法和构造方法.Person;

import java.time.LocalDateTime;
import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
         //Math
        //Scanner
        //预定义 事先定义好的，jdk 提供

        //基本数据类型
        //int float double
        //数据类型 变量名称 = 值
        int    num  =  10;
        //数据类型(类类型/引用类型)
        Date now =     new Date();
             //变量名称   值
             //对象名称(对象变量)= 真正的对象
        //new Date().setTime();
        //now.setTime();
        Employee employee = new Employee();
        employee.setHireDay(new Date());
        employee.setDateTime(LocalDateTime.now());
        System.out.println(employee.getHireDay());
        Date date = employee.getHireDay();
        date.setTime(1000l);
        System.out.println(date);
        System.out.println(employee.getHireDay());
        LocalDateTime localDateTime = employee.getDateTime();
        localDateTime = localDateTime.plusDays(11);
        System.out.println(localDateTime);
        System.out.println(employee.getDateTime());

        Person person = new Person();
        person.name ="张三";

    }
}

