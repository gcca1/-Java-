package com.gcc.javacore.day12第三章双重循环打印图形;

public class 打印矩形 {
    public static void main(String[] args) {
        for (int j =0;j<5;j++){
            for (int i=0;i<5;i++){
                System.out.print("*");
            }
            System.out.println("");
            //System.out.print("\r\n");
        }
    }
}
