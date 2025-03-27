package com.ohgiraffers.section05.typeCasting;

public class Application_01 {
    public static void main(String[] args) {

        // 정수와 long 타입의 연산
        int num1 = 10;
        long num2 = 20;

        // int와 long의 연산 결과는 자동으로 long 타입으로 형변환
        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);  // 결과: 30

        // 문자 'a'의 유니코드 값 (97)을 int로 출력
        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);  // 결과: 97 (문자 'a'의 유니코드 값)

        // int 값을 char로 변환 (65는 'A'의 유니코드 값)
        char ch2 = 65;
        System.out.println("ch2 = " + ch2);  // 결과: A

    }
}
