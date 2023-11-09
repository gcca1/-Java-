package com.gcc.javacore.day08第三章Scanner控制台输入;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入姓名;");
//        Scanner scanner = new Scanner(System.in);
 //       String name = scanner.next();
 //       System.out.println("姓名:"+name);
//        String name = scanner.nextLine();
//        System.out.println("姓名:"+name);
//        System.out.println("请输入年龄:");
//        int num = scanner.nextInt();
//        System.out.println("年龄:"+num);
          int year = 2021;
          int month = 8;
          int day = 30;
        System.out.printf("%d年%x月%x日\n",year,month,day);

        Scanner scanner = new Scanner(Paths.get("D:\\javacore\\src" +
                        "\\main\\resources" +
                        "\\a.txt"),"UTF-8");
        String str =  scanner.nextLine();
        System.out.println(str);
        str =  scanner.nextLine();
        System.out.println(str);

        PrintWriter printWriter = new PrintWriter("b.txt");
        printWriter.println("任逍遥编程逆向");
        printWriter.close();


    }
}
