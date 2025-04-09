package com.com.greedy.level02.normal.book.model.vo;

public class StudentV {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentV() {
    }

    public StudentV(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void printInformation() {
        System.out.printf("학년 : %d\n반 : %d\n이름 : %s\n키 : %.1f\n성별 : %c", grade, classroom, name,
            height, gender);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
