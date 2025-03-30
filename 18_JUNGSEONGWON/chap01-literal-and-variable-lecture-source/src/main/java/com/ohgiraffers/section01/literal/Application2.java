package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("================ 정수와 정수의 연산 ====================");
        System.out.println(123+456);
        System.out.println(123 - 23);
        System.out.println(123 * 10); // 곱하기
        System.out.println(123 / 10); // 나누기 -> 몫만 나온다.
        System.out.println(123 % 10); // 나누기 -> 나머지만 나온다.
        System.out.println("================= 실수와 실수의 연산 ====================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 3.0); // 나머지에 대한 내용은 약간의 오차가 발생할 수 있다.
        System.out.println("================= 정수와 실수의 연산 ====================");
        // 언제나 정수와 실수의 연산의 결관는 항상 실수가 나온다.
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        System.out.println("================= 문자와 문자의 연산 ====================");
        // 문자의 연산에서는 아스키코드로 변환을 자동으로 하여 계산을 한다.
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        System.out.println("================= 문자와 정수의 연산 ====================");
        System.out.println('a' + 1); //98
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
        System.out.println("================= 문자와 실수의 연산 ====================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 결론은 문자는 내부적으로 숫자 취급을 한다.
        // 결국 지금까지 숫자끼리의 연산을 확인한 것이다.

        // 문자열의 연산
        // 문자열과 문자열의 연산은 '+' 연산만 가능하고, 연산의 결과는 문자열 합치기(이어 붙이기)가 된다.
        System.out.println("================= 문자열과 문자열의 연산 ====================");
        System.out.println("hello" + "world");
    /*  System.out.println("hello" - "world"); // 이때 빨간 줄은 오류 노란 줄은 주의 이다.
        System.out.println("hello" * "world");
        System.out.println("hello" / "world");
        System.out.println("hello" % "world");
     */
        System.out.println("================= 문자열과 다른 형태의 연산 ====================");
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        // 논리 연산은 모든 사칙연산이 안된다.
        // 논리 값과 문자열의 + 연산만 사용가능하다.
        // 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기의 결과가 된다.
        System.out.println("123" + "456");
        System.out.println("============================================================");
        System.out.println(9 + 9);
        System.out.println("9" + 9); // 문자열 99
        System.out.println(9 + "9"); // 문자열 99
        System.out.println("9" + "9"); // 문자열 99
        System.out.println("9" + "9"); // 문자열 99
        System.out.println("============================================================");
        System.out.println(9 + 9 + "9"); // 189 연산의 방향은 왼쪽에서 오른쪽으로 진행이 된다는 것을 알 수 있다.
        System.out.println(9 + "9" + 9); // 문자열 999
        System.out.println("9" + 9 + 9); // 문자열 999
        System.out.println("9" + (9 + 9)); // 문자열 918 괄호를 넣으면 괄호가 게산이 되고 문자열이 된다.
        // 자료형으로 변환을 할 때 문자열로 변환을 하고 싶은 경우 맨 왼쪽을 문자열로 지정해주면 문자열로 다 바뀐다.
        System.out.println("==================== 10과 20의 사칙연산 =====================");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("=================== 10과 20의 사칙연산 ======================");
        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
