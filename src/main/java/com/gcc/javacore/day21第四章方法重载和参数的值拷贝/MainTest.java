package com.gcc.javacore.day21第四章方法重载和参数的值拷贝;

import java.util.Scanner;

public class MainTest {

    public void setNum(int numA,int numB){
        numA = 100;
        System.out.println("setNum"+numA);
        numB = 100;
        System.out.println("setNum"+numB);

    }

    public static void main(String[] args) {
        //构造重载
        StringBuilder stringBuilder =new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder("hello");
        Scanner scanner = new Scanner(System.in);

        MainTest mainTest = new MainTest();
        int a= 10;
        int b=10;
        //参数的值传递
        mainTest.setNum(a,b);
        System.out.println("main"+a);
        System.out.println("main"+b);

        //垃圾回收机制
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
