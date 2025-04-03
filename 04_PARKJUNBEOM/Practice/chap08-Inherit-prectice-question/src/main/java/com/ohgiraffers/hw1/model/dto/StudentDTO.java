package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height,
                      double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String information(){
        return "name="  + super.getName() + ", age=" + super.getAge() + ", height=" + super.getHeight() +
                ", weight=" + super.getWeight() + ", grade=" + grade+", major=" + major;
    }
}
