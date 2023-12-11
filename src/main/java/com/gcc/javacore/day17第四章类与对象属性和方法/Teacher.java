package com.gcc.javacore.day17第四章类与对象属性和方法;

public class Teacher {
    /**
     * 年龄
     */
    public String name;
    public String major;
    public String hobby;
    public int teachAge;
    public void showInfo(){
        System.out.println("姓名:"+name);
        System.out.println("专业:"+major);
        System.out.println("爱好:"+hobby);
        System.out.println("教龄:"+teachAge);

    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="任逍遥";
        teacher.major="java";
        teacher.hobby="讲课";
        teacher.teachAge=10;
        teacher.showInfo();
    }
}
