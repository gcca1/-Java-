package com.gcc.javacore.day11第三章中断流程控制;

import java.util.Scanner;

public class MainTest1101 {
    public static void main(String[] args) {
        //循环录入10个学生的成绩，统计成绩大于等于80分的学生比例
        int num = 0;//计数器用来统计超过80分的个数
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生成绩");
            Scanner scanner = new Scanner(System.in);
            int score = scanner.nextInt();
            if (score >= 80) {
                num++;
                continue;
            }
            System.out.println(score + "continue测试");
        }
        int bi = num/10;
        System.out.println("80分占比:"+bi);
    }
}
