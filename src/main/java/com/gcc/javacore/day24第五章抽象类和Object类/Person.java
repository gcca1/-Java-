package com.gcc.javacore.day24第五章抽象类和Object类;

/**
 * 抽象类
 */
public abstract class Person {
    private String name;

    /**
     * 抽象方法
     * 特点：没有方法体
     * 关键字 abstract
     *抽象方法，必须在抽象类中
     */
    public abstract void getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

