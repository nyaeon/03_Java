package com.greedy.level02.student.model.vo;

public class StudentVO {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    // 기본 생성자 생성
    public StudentVO() {
    }

    // 모든 필드를 초기화하는 생성자 작성
    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    // 필드값 출력용 메소드 printInformation, void로 선언된 메소드는 값을 반환하지 않고, 단순히 출력만 해야 할 때 사용
    public void printInformation(){
        System.out.println("학년 : " + grade + "\n" + " 반 : " + classroom + "\n" + "이름 : " + name + "\n" + "키 : " + height + "\n" + "성별 : " + gender);
    }

    // 필드 수정용 메소드 setters, 필드값 리턴용 메소드 getter
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
