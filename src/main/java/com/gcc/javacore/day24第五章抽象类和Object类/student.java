package com.gcc.javacore.day24第五章抽象类和Object类;

public class student extends Person{

    private double score;

    @Override
    public void getDescription() {

        System.out.println("学生的姓名:"+super.getName());
        System.out.println("学生的分数:"+this.score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
