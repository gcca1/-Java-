package com.gcc.javacore.day12;

public class 等腰三角形 {
    public static void main(String[] args) {
//        int num=1;//1,3,5,7,9
//        for(int j=0;j<5;j++){
//            for (int i=0;i<5-j;i++){
//                System.out.print(" ");
//            }
//            for (int i=0;i<num;i++){
//                System.out.print("*");
//            }
//            System.out.println("");
//            num=num+2;
//        }
        for(int j=0;j<5;j++){
            for (int i=0;i<5-j;i++){
                System.out.print(" ");
            }
            for (int i=0;i<2*j+1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
