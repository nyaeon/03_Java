package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        // 정수와 정수의 연산
        System.out.println("=================== 정수와 정수의 연산 ==================");
        System.out.println(123 + 456);
        System.out.println(132- 23);
        System.out.println(132 * 10);
        System.out.println(123 / 10);
        System.out.println(132 % 10);
        System.out.println("=================== 정수와 정수의 연산 ==================");

        System.out.println("=================== 실수와 실수의 연산 ==================");
        System.out.println(12.3 + 4.56);
        System.out.println(13.2 - 2.3);
        System.out.println(13.2 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.32 % 10.0); //약간의 오차가 생김
        System.out.println("=================== 실수와 실수의 연산 ==================");

        // 정수와 실수의 연산 결과는 항상 실수가 나옴
        System.out.println(123 + 4.56);
        System.out.println(132 * 2.3);
        System.out.println("=================== 실수와 정수의 연산 ==================");

        // 문자 연산

        System.out.println("=================== 문자와 문자의 연산 ==================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b'); // 아스키코드의 정수로 자동 현변환되어 계산

        System.out.println("=================== 문자와 정수, 실수의 연산 ==================");
        System.out.println('a' + 1);
        System.out.println('a' * 1.4);
        // 문자는 결국 내부적으로 숫자 취급

        // 문자열 연산
        // '+' 연산만 가능하고, 결과는 문자열 합치기
        System.out.println("=================== 문자열 연산 ==================");
        System.out.println("Hello" + "world");

        System.out.println("=================== 문자열과 다른 형태의 연산 ==================");
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'A');
        System.out.println("Hello" + true);
        // 모두 이어 붙이기 가능

        // 논리연산은 사칙연산 불가능
        // 숫자로 된 문자열끼리의 합은 문자열 이어붙이기
        System.out.println("123" + "456");

        System.out.println("==========================================================");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        System.out.println("==========================================================");
        System.out.println(9 + 9 + "9");  // 189
        System.out.println(9 + "9" + 9); // 999
        System.out.println("9" + 9 + 9); // 999
        System.out.println("9" + (9 + 9)); // 918

        System.out.println("============ 10과 20의 사칙연산 ==============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);


        System.out.println("============ 10과 20의 사칙연산 ==============");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
