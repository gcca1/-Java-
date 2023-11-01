package com.gcc.javacore.day12;

public class MainTest12 {
    public static void main(String[]args){
        //地球和太阳自转公转，典型的双重循环
        for (int j=1;j<=5;j++){
            System.out.println("第"+j+"年开始公转开始");
            for (int i=1;i<=10;i++){
                System.out.println("自转"+i+"圈,第"+i+"天过去了");
            }
            System.out.println("第"+j+"年开始公转结束");
        }
    }
}
