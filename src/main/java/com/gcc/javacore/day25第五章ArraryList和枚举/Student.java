package com.gcc.javacore.day25第五章ArraryList和枚举;

public class Student {
    private String name;
    private String stuNo;
    private int score;

    public Student() {
    }

    public Student(String name, String stuNo, int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", score=" + score +
                '}';
    }

}
