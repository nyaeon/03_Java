package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        // 삼항 연산자
        // (조건식) ? 참일때 값 : 거짓일때 값

        int num1 = 10;
        int num2 = 20;

        String result1 = (num1 > 0) ? "양수다." : "양수가 아니다.";
        System.out.println(result1);

        boolean result2 = (num2 > 0) ? true : false;
        System.out.println(result2);

        int num3 = 1;
        int num4 = 0;
        int num5 = -1;

        String result3 = (num5 > 0 ) ? "양수다." : (num5 == 0) ? "0이다." : "음수다.";
        System.out.println(result3);
    }
}
