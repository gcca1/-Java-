package com.gcc.javacore.day16第三章多维数组和杨辉三角;

import java.util.Scanner;

public class 二维数组 {
    public static void main(String[] args) {
        //统计5个班各5名学生Java课程的成绩，如何计算5个班各自的总成绩
        int[][] scoreArr = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"班:");
            int sum = 0;
            for (int j =0;j<5;j++){
                System.out.println("请输入第"+(j+1)+"的学生的成绩");
                scoreArr[i][j]= scanner.nextInt();
                sum = sum+scoreArr[i][j];
            }
            System.out.println("第"+(i+1)+"班总成绩:"+sum);
        }
//        for (int i =0;i< scoreArr.length;i++){
//            int sum = 0;
//            for (int j=0;j<scoreArr[i].length;j++){
//                System.out.println("第"+(i+1)+"班,第"+(j+1)+"学生成绩:"+scoreArr[i][j]);
//                sum = sum+scoreArr[i][j];
//            }
//            System.out.println("第"+(i+1)+"班总成绩:"+sum);
//        }
    }
}
