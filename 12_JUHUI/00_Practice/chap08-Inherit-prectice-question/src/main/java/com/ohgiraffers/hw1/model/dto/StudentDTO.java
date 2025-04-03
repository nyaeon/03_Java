package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO{

    private int grade; //학년
    private String major; // 전공

    public StudentDTO() {}

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {

        //
        super(age, height, weight);
        // 부모 필드에서 불러와 초기화하지 않았던 name에 값을 넣어주며 초기화해줌
        this.name = name;

        this.grade = grade;
        this.major = major;

    }

    //getter
    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    //setter
    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 부모클래스의 필드가 private로 선언되어 있으면 직접 접근 불가함. 그래서 getter 메소드 사용해야 함.
    public String information() {
        return "name = " + name + ", "
                + "age = " + getAge() + ", "
                + "height = " + getHeight() + ", "
                + "weight = " + getWeight() + ", "
                + "grade = " + grade + ", "
                + "major = " + major;
    }
}
