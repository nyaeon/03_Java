package com.ohgiraffers.section01.literal;

public class APplication2 {
    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("================= 정수와 정수의 연산 ====================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("================= 실수와 실수의 연산 ====================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 10.0); // 근사치 계산이라 약간의 오차가 있다.

        // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("================= 정수와 실수의 연산 ====================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 문자의 연산
        System.out.println("================= 문자와 문자의 연산 ====================");
        // 아스키 코드의 숫자로 출력된다.
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("================= 문자와 정수의 연산 ====================");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        System.out.println("================= 문자와 실수의 연산 ====================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 결론은 문자는 내부적으로 숫자 취급을 한다.
        // 결국 지금까지 숫자끼리의 연산을 확인했다.

        // 문자열의 연산
        // 결과 문자열과 문자열의 연산은 '+' 연산만 가능, 문자열 이어붙이기가 된다.
        System.out.println("================= 문자열과 문자열의 연산 ====================");
        System.out.println("hello" + "world");
        // System.out.println("hello" - "world");
        // System.out.println("hello" * "world");
        // System.out.println("hello" / "world");
        // System.out.println("hello" % "world");

        System.out.println("================= 문자열과 다른 형태의 연산 ====================");
        System.out.println("hello" + 123); // hello123
        System.out.println("hello" + 123.345); // hello123.234
        System.out.println("hello" + 'a'); // helloa
        System.out.println("hello" + true); // hellotrue

        // 논리연산은 모든 사칙연산이 안됨
        // 논리값과 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기의 결과가 된다.
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
