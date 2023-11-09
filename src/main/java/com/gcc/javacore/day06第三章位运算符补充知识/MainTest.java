package com.gcc.javacore.day06第三章位运算符补充知识;

public class MainTest {
    public static void main(String[] args) {
        //密钥
        int key = 5;
        //原数值
        int num1 = 2; // 0010
        int num2 = 3; // 0011
                      // 0010
        //& 与运算  都为1，结果为1
 //       int resNum = num1&num2;
 //       System.out.println(resNum);
        //| 或运算  只要有一个为1的，结果就为1
  //       resNum = num1|num2;
  //      System.out.println(resNum);
        //^ 异或 不一样的为1
  //      resNum = num1^num2;
//        System.out.println(resNum);
        //加密后的数值
        int resNum = num1^key;
        System.out.println(resNum);
        //原数值
        System.out.println(resNum^key);

        //CPU是如何计算2+3=？
        //第一步   ^运算
        //0010
        //0011
        //0001
        //第二步    与运算
        //0010
        //0011
        //0010
        //第三步 左移1位
        System.out.println(~num1);





    }
}
