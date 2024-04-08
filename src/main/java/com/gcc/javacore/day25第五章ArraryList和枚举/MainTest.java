package com.gcc.javacore.day25第五章ArraryList和枚举;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        //复数 可以用数组存储
        //数组的缺点，长度是固定的
        Student[] students = new Student[5];
        Student stu1 = new Student("张三1", "001", 100);
        Student stu2 = new Student("张三2", "002", 100);
        Student stu3 = new Student("张三3", "003", 100);
        Student stu4 = new Student("张三4", "004", 100);
        Student stu5 = new Student("张三5", "005", 100);
        Student stu6 = new Student("张三6", "006", 100);
        Student stu10= new Student("张三10", "010", 100);
        students[0]=stu1;
        students[1]=stu2;
        students[2]=stu3;
        students[3]=stu4;
        students[4]=stu5;
        //students[5]=stu6;

        //动态数组类
        ArrayList<Student>arrayList = new ArrayList();
        //赋值
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        arrayList.add(stu4);
        arrayList.add(stu5);
        arrayList.add(stu6);
        arrayList.add(2,stu10);

        //Student student =(Student) arrayList.get(4);
//        for(int i=0;i< arrayList.size();i++){
//            //取值
//          Student student =(Student) arrayList.get(i);
//            System.out.println(student);
//
//        }
        arrayList.remove(0);
        for(int i=0;i< arrayList.size();i++){
            //取值
            Student student =arrayList.get(i);
            System.out.println(student);

        }
        System.out.println(arrayList.contains(stu6));

        int[] num =new int[3];
         ArrayList arrayList1=new ArrayList();
         arrayList1.add(3);


    }

}
