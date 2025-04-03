package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {

    private int grade; // 학년
    private int classroom; // 반
    private String name; // 이름
    private int kor; // 국어 점수
    private int eng; // 영어 점수
    private int math; // 수학 점수

    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String information() {
        return grade + ", "
                + classroom + ", "
                + name + ", "
                + kor + ", "
                + eng + ", "
                + math + ", "
                + "평균: " + String.format("%.2f", totalAverage());

    }

    // 평균 점수를 계산하는 메서드
    public double totalAverage() {
        return (kor + eng + math) / 3.0;
    }
}


