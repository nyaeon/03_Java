package com.ohgiraffers.section01;

public class Application_02 {
    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("===== 정수와 정수의 연산 =====");
        System.out.println("123 + 456 = " + (123 + 456)); // 덧셈
        System.out.println("123 - 23 = " + (123 - 23));  // 뺄셈
        System.out.println("123 * 10 = " + (123 * 10));  // 곱셈
        System.out.println("123 / 10 = " + (123 / 10));  // 나눗셈 (몫)
        System.out.println("123 % 10 = " + (123 % 10));  // 나눗셈 (나머지)

        System.out.println();

        // 실수와 실수의 연산
        System.out.println("===== 실수와 실수의 연산 =====");
        System.out.println("1.23 + 1.23 = " + (1.23 + 1.23));
        System.out.println("1.23 - 0.23 = " + (1.23 - 0.23));
        System.out.println("1.23 * 10.0 = " + (1.23 * 10.0));
        System.out.println("1.23 / 10.0 = " + (1.23 / 10.0));
        System.out.println("1.23 % 3.0 = " + (1.23 % 3.0)); // 근사치로 인해 오차 발생 가능

        System.out.println();

        // 정수와 실수의 연산 (결과는 항상 실수)
        System.out.println("===== 정수와 실수의 연산 =====");
        System.out.println("123 + 0.5 = " + (123 + 0.5));
        System.out.println("123 - 0.5 = " + (123 - 0.5));
        System.out.println("123 * 0.5 = " + (123 * 0.5));
        System.out.println("123 / 0.5 = " + (123 / 0.5));
        System.out.println("123 % 0.5 = " + (123 % 0.5));

        System.out.println();

        // 문자와 문자의 연산 (유니코드 값 연산)
        System.out.println("===== 문자와 문자의 연산 =====");
        System.out.println("'a' + 'b' = " + ('a' + 'b'));
        System.out.println("'a' - 'b' = " + ('a' - 'b'));
        System.out.println("'a' * 'b' = " + ('a' * 'b'));
        System.out.println("'a' / 'b' = " + ('a' / 'b'));
        System.out.println("'a' % 'b' = " + ('a' % 'b'));

        System.out.println();

        // 문자와 정수의 연산 (문자는 정수형으로 변환되어 연산됨)
        System.out.println("===== 문자와 정수의 연산 =====");
        System.out.println("'a' + 1 = " + ('a' + 1));
        System.out.println("'b' - 1 = " + ('b' - 1));
        System.out.println("'a' * 3 = " + ('a' * 3));
        System.out.println("'a' / 2 = " + ('a' / 2));
        System.out.println("'a' % 5 = " + ('a' % 5));

        System.out.println();

        // 문자와 실수의 연산 (문자는 실수형으로 변환되어 연산됨)
        System.out.println("===== 문자와 실수의 연산 =====");
        System.out.println("'a' + 0.5 = " + ('a' + 0.5));
        System.out.println("'b' - 0.5 = " + ('b' - 0.5));
        System.out.println("'a' * 0.5 = " + ('a' * 0.5));
        System.out.println("'a' / 0.5 = " + ('a' / 0.5));
        System.out.println("'a' % 0.5 = " + ('a' % 0.5));

        System.out.println();

        // 문자열과 문자열의 연산 (문자열 이어 붙이기)
        System.out.println("===== 문자열과 문자열의 연산 =====");
        System.out.println("\"Hello \" + \"World\" = " + ("Hello " + "World"));
        System.out.println("\"Java \" + \"Programming\" = " + ("Java " + "Programming"));

        System.out.println();

        // 문자열과 다른 형태의 연산
        System.out.println("===== 문자열과 다른 형태의 연산 =====");
        System.out.println("\"Hello \" + 123 = " + ("Hello " + 123)); // 문자열 + 정수 (이어 붙이기)
        System.out.println("\"Java \" + 3.14 = " + ("Java " + 3.14)); // 문자열 + 실수 (이어 붙이기)
        System.out.println("\"Character: \" + 'A' = " + ("Character: " + 'A')); // 문자열 + 문자 (이어 붙이기)
        System.out.println("\"Sum: \" + (10 + 20) = " + ("Sum: " + (10 + 20))); // 숫자 연산 후 문자열로 변환되어 이어 붙이기

        System.out.println();

        // 논리 연산은 모든 사칙연산이 안된다
        System.out.println("===== 논리값과 연산 =====");
        boolean flag1 = true;
        boolean flag2 = false;

        // 논리값은 비교 연산자 또는 논리 연산자 (&&, ||, !) 를 사용해야 함
        System.out.println("flag1 && flag2 = " + (flag1 && flag2)); // 논리 AND 연산
        System.out.println("flag1 || flag2 = " + (flag1 || flag2)); // 논리 OR 연산
        System.out.println("!flag1 = " + (!flag1)); // 논리 NOT 연산

        //숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기의 결과가 된다.
        System.out.println("\"123\" + \"456\" = " + ("123" + "456"));

        System.out.println("==========================================================");
        System.out.println("9 + 9 = " + (9 + 9));
        System.out.println("\"9\" + 9 = " + ("9" + 9));
        System.out.println("9 + \"9\" = " + (9 + "9"));
        System.out.println("\"9\" + \"9\" = " + ("9" + "9"));

        System.out.println("==========================================================");
        System.out.println("9 + 9 + \"9\" = " + (9 + 9 + "9"));  // 189
        System.out.println("9 + \"9\" + 9 = " + (9 + "9" + 9)); // 999
        System.out.println("\"9\" + 9 + 9 = " + ("9" + 9 + 9)); // 999
        System.out.println("\"9\" + (9 + 9) = " + ("9" + (9 + 9))); // 918

        System.out.println("============ 10과 20의 사칙연산 ==============");
        System.out.println("10 + 20 = " + (10 + 20));
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + (10 * 20));
        System.out.println("10 / 20 = " + (10 / 20));
        System.out.println("10 % 20 = " + (10 % 20));

        System.out.println("============ 10과 20의 사칙연산 ==============");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫");
    }
}

