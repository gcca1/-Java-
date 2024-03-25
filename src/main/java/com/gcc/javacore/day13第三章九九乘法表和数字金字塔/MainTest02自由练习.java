package com.gcc.javacore.day13第三章九九乘法表和数字金字塔;

import java.util.Scanner;

public class MainTest02自由练习 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入练习进度");
        String pra=input.next();
        if(pra.equals("盈盈,怎么样,可以了吗?")) {
            System.out.println("不行,高音部分唱的还不是很好,钢琴还要继续练啊!");
        }else if(pra.equals("早上5点练声,上午练钢琴,下午到声乐老师家练习唱歌,晚上练习舞蹈基本功")) {
            System.out.println("很棒");
        }else {
            System.out.println("请重新输入");
        }
        input.close();
    }
}
