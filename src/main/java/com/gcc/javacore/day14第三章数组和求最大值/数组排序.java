package com.gcc.javacore.day14第三章数组和求最大值;

import java.util.Scanner;

public class 数组排序 {
    public static void main(String[] args) {
        //从键盘输入本次java考试五位学生的成绩，求考试成绩最高分
        Scanner scanner=new Scanner(System.in);
        //int类型的数组
        int[] arrScore=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"个学生成绩:");
            arrScore[i]=scanner.nextInt();
        }
//        for (int i=0;i<5;i++){
//            System.out.println(arrScore[i]);
//        }
        //打擂台，先假定最大值
        int max=0;
        //数组当中的每一个值，都取一遍。求最大
        for (int i=0;i<5;i++){
            if (arrScore[i]>max){
                max = arrScore[i];
            }
        }
        System.out.println("最大值:"+max);
    }
}
