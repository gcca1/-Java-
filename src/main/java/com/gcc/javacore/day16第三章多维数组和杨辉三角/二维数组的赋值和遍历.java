package com.gcc.javacore.day16第三章多维数组和杨辉三角;

public class 二维数组的赋值和遍历 {
    public static void main(String[] args) {
        int[][] arrInt =new int[3][5];
        arrInt[0][0] = 1;
        arrInt[1][0] = 2;
        arrInt[2][0] = 3;

        arrInt[0][1] = 1;
        arrInt[1][1] = 2;
        arrInt[2][1] = 3;

        arrInt[0][2] = 1;
        arrInt[1][2] = 2;
        arrInt[2][2] = 3;

        arrInt[0][3] = 1;
        arrInt[1][3] = 2;
        arrInt[2][3] = 3;

        arrInt[0][4] = 1;
        arrInt[1][4] = 2;
        arrInt[2][4] = 3;

        for (int i =0;i< arrInt.length;i++){
            for (int j=0;j<arrInt[i].length;j++){
                System.out.print(" "+arrInt[i][j]);
            }
            System.out.println("");
        }
    }
}
