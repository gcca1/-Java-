package com.gcc.javacore.day09;

import java.util.Scanner;

public class MainTest2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的得分:");
        int score = scanner.nextInt();
        if(score>=80){
            System.out.println("良好");
        }else if(score>=60){
            System.out.println("中等");
        }else{
            System.out.println("差");
        }
        System.out.println("程序结束");
    }
}
