package com.gcc.javacore.day15第三章插入和冒泡排序;

import java.util.Arrays;

/**
 * Arrays 工具类的方法介绍
 */
public class Arrays工具类的方法介绍 {
    public static void main(String[] args) {
//        boolean equals(array1,array2)  比较array1和array2两个数组是否相等
//        sort(array)    对数组array的元素进行升序排列
//        String toString(array)  将一个数组array转换成一个字符串
//        void fill(array,val)  把数组array所有元素都赋值为val
//        copyOf(array,length)  把数组array复制成一个长度为length的新数组，返回类型与复制的数组一致
//        int binarySearch(array, val)  查询元素值val在数组array中的下标（要求数组中元素已经按升序排列）
          int[] arrInt1 ={1,2,3};
          int[] arrInt2 ={8,2,3};
        System.out.println(Arrays.equals(arrInt1,arrInt2));
        Arrays.sort(arrInt2);
        System.out.println(Arrays.toString(arrInt2));
        Arrays.fill(arrInt1,10);
        System.out.println(Arrays.toString(arrInt1));
        int[] arrIntnew = Arrays.copyOf(arrInt2,4);
        System.out.println(Arrays.toString(arrIntnew));

        int[] arrInt3 ={8,3,1};
        Arrays.sort(arrInt3);
        //先升序，升序完为{1，3，8}，则8的下标就为2
        System.out.println(Arrays.binarySearch(arrInt3,8));

    }
}
