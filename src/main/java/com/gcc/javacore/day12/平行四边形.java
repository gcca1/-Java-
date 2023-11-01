package com.gcc.javacore.day12;

public class 平行四边形 {
    public static void main(String[]args){
//        int num= 5;
//        for (int j=0;j<5;j++){
//            for (int i=0;i<num;i++){
//                System.out.print(" ");
//            }
//            for (int i =0;i<5;i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//            num--;
//        }
        for (int j=5;j>0;j--){
            for (int i=0;i<j-1;i++){
                System.out.print(" ");
            }
            for (int i =0;i<5;i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        for (int j=0;j<5;j++){
//            for (int i=0;i<5-j;i++){
//                System.out.print(" ");
//            }
//            for (int i =0;i<5;i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}
