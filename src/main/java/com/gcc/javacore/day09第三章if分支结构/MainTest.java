package com.gcc.javacore.day09第三章if分支结构;

public class MainTest {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("主方法"+num);
        {
            System.out.println("块作用域"+num);
            int num2 = 20;
            System.out.println(num2);
        }
        //ystem.out.println(num2);
    }
}
