package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        
        final int AGE; // 상수의 변수명은 대문자로 표기(암묵적)
        
        AGE = 18;
      // AGE = 20; // 컴파일 에러
        System.out.println("AGE = " + AGE);
        
        
        int myAge = AGE;
        System.out.println("myAge = " + myAge);
    }
}
