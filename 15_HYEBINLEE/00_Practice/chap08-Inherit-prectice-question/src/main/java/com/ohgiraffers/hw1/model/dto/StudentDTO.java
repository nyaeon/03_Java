package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
  int grade;
  String major;

  public StudentDTO(){}
  public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
    this.setName(name);
    this.setAge(age);
    this.setHeight(height);
    this.setWeight(weight);
    this.setGrade(grade);
    this.setMajor(major);
  }

  @Override
  public String information(){
    return super.information()+String.format(", grade=%d, major=%s", grade, major);
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

}
