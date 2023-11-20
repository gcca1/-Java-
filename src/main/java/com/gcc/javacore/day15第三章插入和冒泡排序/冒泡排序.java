package com.gcc.javacore.day15第三章插入和冒泡排序;

import java.util.Arrays;

/**
 *冒泡排序
 */
public class 冒泡排序 {
    public static void main(String[] args) {
//        int num1 =10;
//        int num2 = 20;
//        //nmu1= 10;
//        //num2 =20;
//        int temp =0;
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println(num1);
//        System.out.println(num2);
//
//        外层循环 N-1
//        内层循环 N-1-i

        //冒泡
        int[] arrInt = {10,50,30,40,89};
        for (int i =0;i< arrInt.length-1;i++){
            for (int j =0;j< arrInt.length-i-1;j++){
                if (arrInt[j]<arrInt[j+1]){
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
