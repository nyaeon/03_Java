package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private  int kor;
    private int eng;
    private int math;


    public StudentDTO() {
    }

    public StudentDTO(int math, int eng, int kor, String name, int classroom, int grade) {
        this.math = math;
        this.eng = eng;
        this.kor = kor;
        this.name = name;
        this.classroom = classroom;
        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String information(){
        return "학년 : " + grade + ", "
                + "반 : " + classroom + ", "
                + "이름 : " + name  + ", "
                + "국어점수 = "+ kor  + ", "
                + "영어점수 = "+ eng  + ", "
                + "수학점수 = "+ math;

    }






}
