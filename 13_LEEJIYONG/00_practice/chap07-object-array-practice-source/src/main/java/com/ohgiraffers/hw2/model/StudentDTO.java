package com.ohgiraffers.hw2.model;

public class StudentDTO {

    private int grade;
    private int classRoom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {

    }

    public StudentDTO(int grade, int classRoom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classRoom = classRoom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String information() {
        return String.format("%d, %d, %s, %d, %d, %d", grade, classRoom, name, kor, eng, math);
    }

    public double getAvg() {
        int sum = kor + eng + math;
        return (double) sum / 3;
    }
}
