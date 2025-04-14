package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {

    private int grade;      // 학년
    private String major;   // 전공

    // 기본 생성자 생성
    public StudentDTO() {
    }

    // 매개변수 생성사 생성
    // name 값은 부모 필드 값에 직접 접근해서 초기화
    // age, height, weight는 부모 생성자를 통해 초기화
    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.name = name;
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

    public String information() {
        return super.information() + ", grade: " + grade + ", major: " + major;    }
}
