package com.gcc.javacore.day19第四章getset方法和构造方法;

public class Person {
    //访问修饰符   //数据类型   //属性名==变量名
    //权限很大，任何类都可以访问，修改
    public          String     name;
    private int age;
    //私有的权限，只能在本类中使用
    private char sex;

    /**
     * 无参构造
     */
//    public Person(){
//
//    }

    //提供公共的get set 方法
    //get方法 获取属性值
    public char getSex(){
        return sex;
    }
    //set 方法赋值
    public void setSex(char _sex){
        sex=_sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int _age){
        if (_age<0){
            System.out.println("赋值失败，年龄不可能是负数");
        }else{
            age=_age;
        }

    }
    public String getName(){
        //this 关键字    表示当前对象/类的引用
        return "RNG:" +this.name;
    }
    //显式参数：String _name
    //隐式参数 实际上就是this
    public void setName (String name){
       this.name= name;
    }
}
