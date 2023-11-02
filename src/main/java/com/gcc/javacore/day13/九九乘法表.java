package com.gcc.javacore.day13;

public class 九九乘法表 {
    public static void main(String[] args) {
        //9行 第一个数 每行的开头都是行数 例如 3行 3*1 3*2 3*2
        //第二个数，1到行数 例如第三行 1， 2 ，3，
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println("");
        }
    }
}
