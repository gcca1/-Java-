package com.gcc.javacore.day22第五章继承和方法重写;

public class Pet {
    protected String name;
    protected int health;
    protected int love;
    public void print(){
        System.out.println("宠物的姓名:"+this.name);
        System.out.println("宠物的健康值:"+this.health);
        System.out.println("宠物的喜爱值:"+this.love);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
