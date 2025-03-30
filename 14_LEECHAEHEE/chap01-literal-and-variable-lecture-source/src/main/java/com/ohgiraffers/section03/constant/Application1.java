package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        final int AGE; // 상수 변수명은 대문자로 표기
        AGE = 18;
        // AGE = 20;  // 상수 변수는 한번 초기화하면 값 수정 불가능
        System.out.println("AGE = " + AGE);
    }
}
