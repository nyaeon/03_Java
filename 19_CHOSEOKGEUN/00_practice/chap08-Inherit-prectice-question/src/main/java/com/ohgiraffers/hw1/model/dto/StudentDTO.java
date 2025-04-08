package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade;  // 학년
    private String major;   // 전공

    public StudentDTO() {}

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;  // protected name -> personDTO 에서 가져옴
        this.grade = grade;
        this.major = major;
    }

    public String information() {
        return super.information() + ", 학년: " + grade + ", 전공: " + major;
    }
}
