package com.greedy.level02.normal.student.model.vo;

public class Application {
    public static void main(String[] args) {
        StudentVO student = new StudentVO(1, 2, "홍길동", 175.5, '남');;
        student.printinformation();
    }
}
