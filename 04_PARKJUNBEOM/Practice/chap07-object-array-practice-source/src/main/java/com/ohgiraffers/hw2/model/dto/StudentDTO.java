package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    int grade;
    int classroom;
    String name;
    int kor;
    int eng;
    int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor,
                      int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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

    public String information() {
        return "학년 :" + getGrade() + "반 : " + getClassroom() +
                " 이름 : " + getName() + " 국어 점수 : " + getKor() +
                " 영어 점수 : " + getEng() + " 수학 점수 : " + getMath();

    }
}
