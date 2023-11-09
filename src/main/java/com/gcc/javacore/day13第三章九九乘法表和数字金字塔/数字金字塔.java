package com.gcc.javacore.day13第三章九九乘法表和数字金字塔;

import java.util.Scanner;

public class 数字金字塔 {
    public static void main(String[] args) {
        System.out.println("请输入行号:");
        Scanner scanner =new Scanner(System.in);
        int num= scanner.nextInt();
        //外层循环
        for (int i=0;i<num;i++){
            for (int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            //1，3，5，7，9
            for (int j=0;j<i*2+1;j++){
                System.out.print(i+1);
            }
            System.out.println("");
        }
    }
}
