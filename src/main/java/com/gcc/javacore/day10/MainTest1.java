package com.gcc.javacore.day10;

import java.util.Scanner;

public class MainTest1 {
    public static void main(String[] args) {
//        do{
//            循环操作
//        }while(循环条件)；
        //先执行操作，再判断条件。先斩后奏
        String answer ="";
        do{
            System.out.println("编写上机测试题");
            System.out.println("老师我合格了吗？");
            Scanner scanner =new Scanner(System.in);
            answer = scanner.next();
        }while (!answer.equals("yes"));
        System.out.println("恭喜考试成功通过");
    }
}
