package com.ohgiraffers.hw1.model.dto;


public class StudentDTO extends PersonDTO {
    private int grade;
    private String major;

    public StudentDTO() {}

    public StudentDTO(String name, int age, double weight, double height,int grade, String major) {
        super(age,weight,height);
        this.grade = grade;
        this.major = major;
        setName(name);
    }
    public String information(){
        return super.information()+" 학년 : " +grade+" 전공 : "+major;
    }
}
