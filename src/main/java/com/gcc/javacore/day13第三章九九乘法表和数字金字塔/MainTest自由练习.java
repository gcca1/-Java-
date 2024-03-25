package com.gcc.javacore.day13第三章九九乘法表和数字金字塔;

import java.util.Scanner;

public class MainTest自由练习 {
    //九九乘法表
    public static void main(String[] args) {
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+(i*j)+" ");
//            }
//            System.out.println("");
//        }
        //数字金字塔
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入行号:");
        int num = scanner.nextInt();
        for (int i =0;i<num;i++){
            for (int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i*2+1;j++){
                System.out.print(i+1);
            }
            System.out.println("");
        }
    }
}
