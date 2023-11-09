package com.gcc.javacore.day09第三章if分支结构;

import java.util.Scanner;

public class MainTest1 {
    public static void main(String[] args) {
        //如果小明的java考试成绩>90分老师就奖励他一个苹果
        //否则罚跑800米
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小明的考试成绩:");
        int score = scanner.nextInt();
        if(score>90){
            System.out.println("奖励一个苹果");
        }else{
            System.out.println("跑800米");
        }
    }
}
