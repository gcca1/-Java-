package com.gcc.javacore.day09;

import java.util.Scanner;

public class MainTest3 {
    public static void main(String[] args) {
        //嵌套if选择结构
        Scanner scanner = new Scanner(System.in);
        System.out.println(":请输入你的最快速度");
        double speed = scanner.nextDouble();
        if(speed<=10){
            System.out.println("进入决赛");
            System.out.println("请输入你的性别");
            String sex = scanner.next();
            //String比较一定不要用==要用.equals
            if(sex.equals("女")){
                System.out.println("女子组决赛");
            }else{
                System.out.println("男子组决赛");
            }

        }else{
            System.out.println("没进入决赛");
        }
        System.out.println("程序结束");


    }
}
