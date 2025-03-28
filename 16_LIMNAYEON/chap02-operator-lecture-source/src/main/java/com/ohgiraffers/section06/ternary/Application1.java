package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        // 삼항연산자
        // (조건식) ? 참일 때 사용할 값1 : 거짓일 때 사용할 값2

        int num1 = 10;
        int num2 = 20;

        String result1 = (num1 > 0)? "양수다." : "양수가 아니다.";
        System.out.println(result1);


        boolean result2 = (num2 > 0) ? true : false;
        System.out.println(result2);

        int num3 = 0;
        int num4 = 1;
        int num5 = -1;

        String result3 = (num3>0) ? "양수다." : (num3 == 0) ? "0이다." : "음수다.";
        String result4 = (num4>0) ? "양수다." : (num4 == 0) ? "0이다." : "음수다.";
        String result5 = (num5>0) ? "양수다." : (num5 == 0) ? "0이다." : "음수다.";

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
