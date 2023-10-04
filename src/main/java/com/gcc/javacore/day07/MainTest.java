package com.gcc.javacore.day07;

public class MainTest {
    //小括号就是方法
    public static void main(String[] args) {
        //字符类型 单个字符
        char chr = '中';

        String str ="";
        String str1 ="hello";
        String str2 ="中国";
        String hello ="Hello World";
        System.out.println(hello);
        System.out.println(str2.length());
        System.out.println(str2.charAt(1 ));
        //字符串拼接
       /* System.out.println(str2+str1);
        System.out.println(str2.concat(str1));*/
        //一定不要使用==判断字符串是否相等，要用equals 方法
        /*System.out.println(str1.equals(str2));
        System.out.println("中国".equals(str2));*/
        String strTom = "tom";
        String strJerry ="Tom";
        System.out.println(strTom.equals(strJerry));
        //忽略大小写
        System.out.println(strTom.equalsIgnoreCase(strJerry));
        //字符串截取
        String strHello = "Hello World";
        //                 012345678910
        System.out.println(strHello.substring(0,5));
        System.out.println(strHello.substring(2,4));
        System.out.println(strHello.substring(2,strHello.length()));
        System.out.println(strHello.substring(2));
        //从头开始找第一次出现的位置
        System.out.println(strHello.indexOf("o"));
        System.out.println(strHello.lastIndexOf("o"));
        int index = strHello.lastIndexOf("o");
        String subStr = strHello.substring(0,index);
        String res = subStr+"0" +strHello.substring(8);
        System.out.println(res);
        res = strHello.replace("0","o");
        System.out.println(res);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append("中国");
        String sb = stringBuilder.toString();
        System.out.println(sb);
        System.out.println(stringBuilder);




        



    }
}




