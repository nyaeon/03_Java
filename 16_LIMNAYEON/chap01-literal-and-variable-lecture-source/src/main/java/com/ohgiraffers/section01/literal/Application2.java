package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main (String[] args){

        // 정수와 정수의 연산
        System.out.println("================== 정수와 정수의 연산 ==================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10); // 곱하기
        System.out.println(123 / 10); // 나누기(몫)
        System.out.println(123 % 10); // 나머지

        System.out.println("================== 실수와 실수의 연산 ==================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0); // 약갼의 오차가 발생할 수 있다.

        // 정수와 실수의 연산 결과는 언제나 항상 실수가 나온다.
        System.out.println("================== 정수와 실수의 연산 ==================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // 문자의 연산
        System.out.println("================== 문자와 문자의 연산 ==================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("================== 문자와 정수의 연산 ==================");
        System.out.println('a' + 1); // 98
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("================== 문자와 정수의 연산 ==================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 결론은 문자는 내부적으로 숫자 취급을 한다.
        // 결국 지금까지 숫자끼리의 연산을 확인한 것이다.

        // 문자열의 연산
        // 문자열과 문자열의 '+' 연산만 가능하고, 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("================== 문자열과 문자열의 연산 ==================");
        System.out.println("Hello" + " World!");
//        System.out.println("Hello" - " World!");
//        System.out.println("Hello" * " World!");
//        System.out.println("Hello" / " World!");
//        System.out.println("Hello" % " World!");

        System.out.println("================== 문자열과 다른 형태의 연산 ==================");
        System.out.println("Hello" + 123);
        System.out.println("Hello" + 456.123);
        System.out.println("Hello" + 'a');
        System.out.println("Hello" + true);

        // 논리연산은 모든 사칙연산이 되지 않는다.
        // 논리결과 문자열의 +연산만 사용 가능하다.

        // 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기의 결과가 된다.
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
