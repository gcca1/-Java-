package com.gcc.javacore.day16;

/**
 * 杨辉三角
 */

public class 杨辉三角 {
    public static void main(String[] args) {
        int max =10;
        int[][] arrOld = new int[max][];
        //给int[10] 这个数组里的每个元素，在赋值成一个数值
        for (int i =0;i<max;i++){
            arrOld[i]= new int[i+1];
        }
        //未赋值之前的数组
        for (int i=0;i< arrOld.length;i++){
            for (int j=0;j<arrOld[i].length;j++){
                System.out.print(" "+arrOld[i][j]);
            }
            System.out.println();
        }
        //i代表的是行数，k代表的是下标
        for (int i=0;i<arrOld.length;i++){
            for (int j=0;j<arrOld[i].length;j++){
                int num =1;
                for (int k=1;k<=j;k++){
                    //4*(4-2+1)/2
                    //4前一个值 (行数-列的小标+1)/列的下标
                    //6*(6-2+1)/2 =15
                    num = num*(i-k+1)/k;
                }
                arrOld[i][j]= num;
            }
            System.out.println();
        }
        for (int[] arrInt:arrOld){
            for (int numInt:arrInt){
                System.out.print(" "+numInt);
            }
            System.out.println();
        }
    }

}
