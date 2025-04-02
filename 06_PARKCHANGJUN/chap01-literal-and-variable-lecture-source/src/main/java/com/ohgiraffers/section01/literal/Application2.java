package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("============= 정수와 정수의 연산 =============");
        System.out.println(123 + 456);
        System.out.println(123 - 123);
        System.out.println(123 * 10); // 곱하기
        System.out.println(123 / 10); // 나누기를 한 몫의 값
        System.out.println(123 % 10); // 나누기를 한 나머지값
        System.out.println("============= 실수와 실수의 연산 =============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0); // 나머지에 대한 것은 약간의 오차가 발생할 수 있다.

        // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("============= 정수와 실수의 연산 =============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5); // 결과의 내용이 실수로 나온다.

        // 문자의 연산
        System.out.println("============= 문자와 문자의 연산 =============");
        System.out.println('a' + 'b'); // a : 97, b = 98
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        // 문자와 문자의 연산 아스키코드로 연산이 된다.

        System.out.println("============= 문자와 문자의 연산 =============");
        System.out.println('a' + 1); // 98
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("============= 문자와 문자의 연산 =============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 결론은 문자는 내부적으로 숫자 취급을 한다.
        // 결국 지금까지 숫자끼리의 연산을 확인한 것이다.

        // 문자열의 연산
        // 문자열과 문자열의 '+' 연산만 가능, 연산 결과는 문자열 합치기(이어 붙이기))가 된다.
        System.out.println("============= 문자와 문자의 연산 =============");
        System.out.println("hello" + "world!");
//        System.out.println("hello" - "world!");
//        System.out.println("hello" * "world!");
//        System.out.println("hello" / "world!");
//        System.out.println("hello" % "world!");

        System.out.println("============= 문자열과 다른 형태의 연산 =============");
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);
        // 문자열에서의 연산은 플러스만 가능하다.

        // 논리연산을 모든 사칙연산이 안된다.
        // 논리값과 문자열의 + 연산만 사용가능하다.

        // 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기의 결과가 된다.
        System.out.println("123" + "456");
        System.out.println("===============================================");

        System.out.println("===============================================");
        // 연산의 방향은 왼쪽에서 오른쪽
        // 연산을 할때 자료형으로 제일 바꾸기 쉬운방법은 왼쪽 첫번째로 위치하는거다.
        // 문자열이 맨 앞에 있으면 문자형이기 때문이다.1
    }

}
