package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

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

    public StudentDTO() {}
    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        setName(name);
        setGrade(grade);
        setMajor(major);
    }

    @Override
    public String information() {
        return super.information() + ", Grade: " + grade + ", Major: " + major;
    }
}
