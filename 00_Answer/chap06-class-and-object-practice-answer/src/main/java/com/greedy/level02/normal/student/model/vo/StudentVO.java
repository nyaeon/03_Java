package com.greedy.level02.normal.student.model.vo;

public class StudentVO {

    private int grade;

    private int classroom;
    private String name;

    private double height;

    private char gender;

    public StudentVO() {
    }

    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
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


    /*
     * 출력에서 한줄 줄바꿈은 \n 을 이용해서 사용할 수 있다.
     *
     * \n과 같은 문자를 이스케이프 문자라고하구요. 다른 종류는 수업때 더 추가해드릴께요
     * */
    public String printInformation() {

        return "학년 : " + this.grade + "\n"
                + "반 : " + this.classroom + "\n"
                + "이름 : " + this.name + "\n"
                + "키 : " + this.height + "\n"
                + "성별 : " + this.gender + "\n";
    }
}
