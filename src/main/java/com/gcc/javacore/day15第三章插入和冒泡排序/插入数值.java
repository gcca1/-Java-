package com.gcc.javacore.day15第三章插入和冒泡排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 插入数值
 */
public class 插入数值 {
    public static void main(String[] args) {
//        有一组学员的成绩{85，99，82，63， 60}，
//        将它们按降序排列。要增加一个学员的成绩，将它插入成绩序列，并保持降序
        //第一个步骤，找到插入的位置，数组下标。{85，99，82，63， 60}
        //第二步，平移下标之后的值。{85，99，82，63，63， 60}
        //第三步，赋值{85，99，82，70，63， 60}
        int[] arrInt ={99,88,82,63,60};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组");
        int num = scanner.nextInt();
        int index = arrInt.length;//默认插入最后一个位置
        //第一步，找到插入的下标
        for (int i =0;i< arrInt.length;i++){
            if (num>arrInt[i]){
                index = i;
                break;
            }
        }
        //第二步，给数组扩容
        int[] arrIntNew = Arrays.copyOf(arrInt,arrInt.length+1);
        System.out.println("新创建的数组");
        //   {99，88，82，63， 60,0}
        System.out.println(Arrays.toString(arrIntNew));
        //第三步，平移
        for (int i =arrIntNew.length-1;i>index;i--){
            arrIntNew[i] = arrInt[i-1];
        }
        //{99,88,82,63,63,60}
        System.out.println("平移后的数组");
        System.out.println(Arrays.toString(arrIntNew));
        //第四步，赋值给对应的下标数组
        arrIntNew[index]= num;
        System.out.println("最终的数组");
        System.out.println(Arrays.toString(arrIntNew));

    }
}
