package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        final int AGE;  // 상수의 변수명은 대문자로 표기(암묵적) # 상수는 변하지 않는 고정값

        AGE = 18;
//        AGE = 20;

        System.out.println("AGE = " + AGE);

        int myAGE = AGE;
        System.out.println("myAGE = " + myAGE);
    }
}
