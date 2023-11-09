package com.gcc.javacore.day04第三章变量和常量;

public class Day04MainTest {

    //程序是消耗内存的
    //java中有八种基本类型
    //4种整型   byte 1字节  short 2字节 int 4字节 long 8字节
    // 2种浮点型（小数类型） float  double
    // 1种字符型   char  ''
    // 1种真假    boolean  true false
    public static void main(String[] args) {
        //声明一个变量
        byte numByte;//1字节
        short numShort;
        int   numInt;
        long numLong;
        float numFloat;
        double numDouble;
        char strChar;
        boolean flag;
        //给变量赋值
        numByte = 10;
        numShort =100;
        numInt =1000;
        numLong =100;
        numFloat =3.14f;
        numDouble =3.1415;
        strChar = 'A';
        flag = false;
        //声明并赋值
        int numA = 10;
        char strCharB ='B';
        //变量的命名规则
        //首字母小写
        //不允许数字开头
        //驼峰命名法
        System.out.println(numByte);

        //常量 只能被赋值一次 常量名称大写
        final float PI = 3.14f;



    }
}
