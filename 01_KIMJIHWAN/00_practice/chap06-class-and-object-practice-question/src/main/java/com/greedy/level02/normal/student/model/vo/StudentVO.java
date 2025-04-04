package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentVO() {}

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    void printinformation(){
        System.out.println("학생의 학년은? : " + grade);
        System.out.println("학생의 반은? : " + classroom);
        System.out.println("학생의 이름은? : " + name);
        System.out.println("학생의 키는? : " + height);
        System.out.println("학생으 ㅣ성별은? : " + gender);
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
}
