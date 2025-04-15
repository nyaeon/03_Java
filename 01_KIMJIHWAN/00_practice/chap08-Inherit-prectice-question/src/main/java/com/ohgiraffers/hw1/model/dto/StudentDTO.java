package com.ohgiraffers.hw1.model.dto;

import com.ohgiraffers.hw1.run.Application;

public class StudentDTO extends PersonDTO {
    private int grade;      // 학년
    private String major;   // 전공


    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor() {
        this.major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
