package com.ohgiraffers.section06.ternary;

public class Application_01 {
    public static void main(String[] args) {

        // 🌟 삼항 연산자 (조건 연산자)
        // 형식: (조건식) ? 참일 때 값 : 거짓일 때 값

        int num1 = 10;
        int num2 = 20;

        // 조건식 결과에 따라 다른 문자열을 저장
        String result1 = (num1 > 0) ? "양수입니다." : "0 또는 음수입니다.";
        System.out.println(result1); // "양수입니다."

        // boolean 값 판별 (불필요한 삼항 연산자 제거)
        boolean result2 = (num2 > 0);
        System.out.println(result2); // true

        System.out.println(); // 개행

        // 여러 값에 대한 삼항 연산자 활용
        int num3 = 0;
        int num4 = 1;
        int num5 = -1;

        // 중첩 삼항 연산자를 이용하여 양수, 0, 음수를 판별
        String result3 = (num3 > 0) ? "양수입니다." : (num3 == 0) ? "0입니다." : "음수입니다.";
        String result4 = (num4 > 0) ? "양수입니다." : (num4 == 0) ? "0입니다." : "음수입니다.";
        String result5 = (num5 > 0) ? "양수입니다." : (num5 == 0) ? "0입니다." : "음수입니다.";

        // 결과 출력
        System.out.println("num3 판별 결과: " + result3); // "0입니다."
        System.out.println("num4 판별 결과: " + result4); // "양수입니다."
        System.out.println("num5 판별 결과: " + result5); // "음수입니다."
    }
}
