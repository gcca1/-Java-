package com.gcc.javacore.day14;

public class 数组 {
    public static void main(String[] args) {
        //声明数组 int类型的数组
//        int[] arrInt;
//        //分配空间
//        arrInt=new int[10];
//        //赋值 下标 从0开始
//        arrInt[0]=10;
//        arrInt[1]=11;
//        arrInt[2]=12;
//        System.out.println(arrInt[2]);
//
//
//        //简写
//        char[] arrChar =new char[5];
//        arrChar[0]=1;
//        arrChar[1]=1;
//        arrChar[2]=1;
//        arrChar[3]=1;
//        arrChar[4]=1;
//        //一般可以用循环
//        for (int i=0;i<5;i++){
//            arrChar[i]=1;
//        }
//        //数组越界异常：java.lang.ArrayIndexOutOfBoundsException: 5
//        //String类型的数据String[]
//
//        //另外两种，不是常用的声明并赋值
        int[] arrInt1={1,2,3};
        //下标          0 1 2
        System.out.println(arrInt1[1]);
        int[] arrInt2=new int[]{1,21,3};
        System.out.println(arrInt2[1]);
    }
}
