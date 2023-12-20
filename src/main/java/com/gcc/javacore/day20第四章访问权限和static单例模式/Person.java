package com.gcc.javacore.day20第四章访问权限和static单例模式;

import java.time.LocalDate;

public class Person {
    private  static  Person person;
    private Person(){

    }
    public static Person init(){
        return person  = new Person();
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
