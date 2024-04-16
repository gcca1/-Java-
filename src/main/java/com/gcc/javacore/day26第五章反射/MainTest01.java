package com.gcc.javacore.day26第五章反射;

/**
 * 获得class对象
 */
public class MainTest01 {
    public static void main(String[] args) {
        //第一种
        Class clm= MainTest01.class;
        System.out.println(clm.getName());
        Class stu =Student.class;
        System.out.println(stu.getName());

    }

}
