package com.ohgiraffers.h2.model.dto;

public class StudentDTO {

  int grade;
  int classroom;
  String name;
  int kor;
  int eng;
  int math;

  public StudentDTO() {
  }

  public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
    this.grade = grade;
    this.classroom = classroom;
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public String information() {
    return String.format("%d학년 %d반 %s의 국어점수는 %d점, 영어점수는 %d점, 수학점수는 %d점 입니다.",
        grade, classroom, name, kor,
        eng, math);
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

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }
}
