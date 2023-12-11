package com.gcc.javacore.day17第四章类与对象属性和方法;

public class MainTest {
    public static void main(String[] args) {
        //创建对象的语法
        //类名 对象名 = new 类名();
        Person person= new Person();
        //使用“.”进行以下操作
        //对象名.属性
        person.age =20;
        person.weight = 120;
        //对象名.方法()
        //方法可以反复的调用
        //方法调用的流程
        person.run();
        person.run();
        String food ="苹果";
        person.eat(food);
        String yan = person.buy();
        System.out.println("买回来的是:"+yan);
       String dengji = person.upgrade(10);
        System.out.println(dengji);
        System.out.println("程序结束");

    }
}
