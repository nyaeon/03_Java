package com.greedy.level02.normal.student.model.vo;

import java.util.Scanner;

public class StudentVO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentVO() {
    }

    private Scanner sc = new Scanner(System.in);

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        grade = sc.nextInt();
        return grade;
    }

    public int getClassroom() {
        classroom = sc.nextInt();
        return classroom;
    }

    public String getName() {
        name = sc.next();
        return name;
    }

    public double getHeight() {
        height = sc.nextDouble();
        return height;
    }

    public char getGender() {
        gender = sc.next().charAt(0);
        return gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        System.out.println("학년 :" + grade);
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
        System.out.println("반 : " + classroom);
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("이름 : "+ name);
    }

    public void setHeight(double height) {
        this.height = height;
        System.out.println("키 : " + height );
    }

    public void setGender(char gender) {
        this.gender = gender;
        System.out.println("성별 : " + gender);
    }

    public void printInformation(){
        System.out.println(" 학년 :" + this.grade
                            + " 반 : " + this.classroom
                            + " 이름 : "+ this.name
                            + " 키 : " + this.height
                            + " 성별 : " + this.gender);

    }
}
