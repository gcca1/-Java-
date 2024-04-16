package com.gcc.javacore.day26第五章反射;

public class Student {
    private String name;
    private String stuNo;
    private double score;

    public Student() { 
    }

    public Student(String name, String stuNo, double score) {
        this.name = name;
        this.stuNo = stuNo;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
