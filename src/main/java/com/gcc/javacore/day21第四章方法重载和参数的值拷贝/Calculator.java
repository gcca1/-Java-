package com.gcc.javacore.day21第四章方法重载和参数的值拷贝;

public class Calculator {
    /**
     * 重载
     * 方法重载
     * 同一个类中
     * 方法名相同
     * 参数个数或类型不同
     * 与返回值，访问修饰符无关
     */
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,10);
        calculator.add(10.2,3.14);
    }
}
