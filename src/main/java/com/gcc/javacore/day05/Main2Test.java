package com.gcc.javacore.day05;

public class Main2Test {
    public static void main(String[] args){
        //自增
        int n =15;
        //n = n+1;
        //n+=1;
        n++;
        System.out.println(n);

        //自减
        int m=15;
        //m = m-1;
        //m-=1;
        m--;
        System.out.println(m);

        //前++ 先++ 再赋值
        //后++ 先赋值，再++
        //后++运算级别比前++运算级别高
        int n1 =7;
        int m1 =7;
        int a = 2*n1++;
        //a=(2*n1);
        //n1++;
        System.out.println(a);
        int b= 2*++m1;
        System.out.println(b);

    }
}
