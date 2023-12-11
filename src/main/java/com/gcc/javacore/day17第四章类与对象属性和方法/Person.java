package com.gcc.javacore.day17第四章类与对象属性和方法;

/**
 * 人类
 * 类是构造对象的模板和蓝图
 * 类是对象的抽象，对象是类的具体
 */

public class Person {
    //名词==属性
    //访问修饰符   类型   属性名
    /**
     * 年龄
     */
    public int age;
    /**
     * 体重
     */
    public int weight;
    //动词 == 方法（函数）
    //<访问修饰符> 返回类型 <方法名>（<形式参数类表>）{
//    方法的主体
// }
    //没有任何数据返回是返回值类型 void
    //访问修饰符 返回类型 方法名词 run（无参数列表）
    public void run(){
        //无参无返回值的方法
        System.out.println("走起！");
    }
    public void eat(String food){
        //有参数无返回值的方法
        System.out.println("吃的是:"+food);
    }
    public String buy(){
        //无参数，有返回值的方法
        String yan="烟";
        return yan;
    }
    public String upgrade(int time){
        //有参数，有返回值的方法
        return "等级加1";
    }
}
