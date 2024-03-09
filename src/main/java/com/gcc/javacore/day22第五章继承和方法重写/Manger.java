package com.gcc.javacore.day22第五章继承和方法重写;

import java.time.LocalDate;

public class Manger extends Employee {
    /**
     * 奖金
     */
   private  double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Manger manger = new Manger();
        manger.getName();
        manger.setName("");
    }
}
