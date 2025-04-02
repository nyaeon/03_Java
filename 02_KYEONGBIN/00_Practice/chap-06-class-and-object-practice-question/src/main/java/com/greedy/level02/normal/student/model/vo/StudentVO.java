package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

    private int grade;
    private int classRoom;
    private String name;
    private double height;
    private char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int classRoom, String name, double height, char gender) {
    }

    public int getGrade() {
        return grade;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "StudentVO { " +
                "grade=" + grade +
                ", classRoom=" + classRoom +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", gender=" + gender +
                " }";
    }
}