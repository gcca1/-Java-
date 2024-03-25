package com.gcc.javacore.day23第五章多态;

/**
 *企鹅类
 */

public class Penguin extends Pet{
    
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name,health,love);
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("企鹅的性别："+this.sex);
    }

    @Override
    public void gotoHospital() {
        System.out.println("企鹅去医院");
    }
    public void swimming(){
        System.out.println("和企鹅一起游泳");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
