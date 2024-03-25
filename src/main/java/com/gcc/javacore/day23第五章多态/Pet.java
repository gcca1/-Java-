package com.gcc.javacore.day23第五章多态;

public  class Pet {
    private String name;
    private int health;
    private int love;

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    /**
     * 继承父类的print方法
     */
    public  void print(){
        System.out.println("宠物的姓名:"+this.name);
        System.out.println("宠物的健康值:"+this.health);
        System.out.println("宠物的喜爱度:"+this.love);
    }
    public void gotoHospital(){
        System.out.println("父类去医院");
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
