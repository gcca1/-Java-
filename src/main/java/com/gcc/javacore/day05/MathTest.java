package com.gcc.javacore.day05;

public class MathTest {
    public static void main(String[] args) {
        //人物坐标
        int x1 =10,y1=20;
        int x2 =15,y2=25;
        //求人物之间的距离
        int xx = (x2-x1)*(x2-x1);
        int yy = (y2-y1)*(y2-y1);
        //开平方根
        System.out.println(Math.sqrt(xx+yy));
        System.out.println(Math.sqrt(4));

        //自动(隐士)类型转换
        //小类型会自动转换为大类型
        int num =10;
        double numd =20.0;
        double sum =num+numd;
        System.out.println(sum);
        short nums =10;
        double sum1= num+nums;
        System.out.println(sum1);
        //强制类型转换
        //大类型向小类型转换需要强制转换转换过程中会丢失精度
        double num2 =9.1;
        int res =(int)Math.round(num2);
        System.out.println(res);
        res = (int) num2;
        System.out.println(res);

        //二元运算符
        int num3 =10;
        //num3=num3+5;
        num3+=5;

    }
}
