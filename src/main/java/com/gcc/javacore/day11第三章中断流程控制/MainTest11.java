package com.gcc.javacore.day11第三章中断流程控制;

import java.util.Scanner;

public class MainTest11 {
    public static void main(String[] args) {
        //循环录入某学生5门课的成绩并计算平均分，
        //如果某分数录入为负，停止录入并提示录入错误
        int sum = 0;
        boolean flag =true;
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"门成绩:");
            Scanner scanner= new Scanner(System.in);
            int score =scanner.nextInt();
            if (score<0){
                System.out.println("录入错误程序停止");
                flag = false;
                break;
            }
            sum =sum+score;
        }
        if (flag){
            int average=sum/5;
            System.out.println("平均分:"+average);
        }

    }
}
