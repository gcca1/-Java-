package com.gcc.javacore.day17第四章类与对象属性和方法;

/**
 * 学生类
 */

public class Student {
    public String name;
    public int age;
    public String classname;
    public String hobby;
    public void showInfo(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("班级:"+classname);
        System.out.println("爱好:"+hobby);
    }

    public static void main(String[] args) {
        //创建对象的语法
        //类名 对象名 = new 类名();
        Student xiaoming = new Student();
        //使用"."进行以下操作
        //对象名.属性
        //对象名.方法()
        xiaoming.name="小明";
        xiaoming.age=18;
        xiaoming.classname="20班";
        xiaoming.hobby="装疯卖傻";
        xiaoming.showInfo();
    }
}
