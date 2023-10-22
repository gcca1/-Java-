package com.gcc.javacore.day11;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
//        小明参加计算机编程大赛
//        如果第一名，现金10000元
//        如果第二名，奖励笔记本电脑一部。
//        如果第三名，奖励移动硬盘一个
//        否则，不给任何奖励
        System.out.println("请输入您此次的名次");
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
//        if(num==1){
//            System.out.println("现金奖");
//        }else if(num==2){
//            System.out.println("笔记本电脑");
//        }else if(num==3){
//            System.out.println("移动硬盘");
//        }else{
//            System.out.println("没有奖励");
//        }
        //switch语句
        //条件：1.等值判断2.3个判断以上
        switch (num){
            case 1:
                System.out.println("现金奖");
                break;
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("移动硬盘");
                break;
            default:
                System.out.println("没有奖励");
                break;
        }

    }
}
