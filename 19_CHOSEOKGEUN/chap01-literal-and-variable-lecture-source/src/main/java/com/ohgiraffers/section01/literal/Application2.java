package com.ohgiraffers.section01.literal;

public class Application2 {
 public static void main(String[] args) {

     // String lastFourWords = code.substring(code.length()-4, code.length()); 문자열의 마지막 4자리만 뽑기

 // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
     System.out.println("================ 정수와 실수의 연산 ================");
     System.out.println(123 + 0.5);
     System.out.println(123 - 0.5);
     System.out.println(123 * 0.5);
     System.out.println(123 / 0.5);
     System.out.println(123 % 0.5);

     System.out.println("================ 문자와 문자의 연산 ================");
     System.out.println('a' - 'b');  // 출력값 : -1
     System.out.println('a' * 'b');  // 출력값 : 9506 (아스키 코드 의거)
     System.out.println('a' / 'b');  // 출력값 : 0  (아스키 코드 의거)
     System.out.println('a' % 'b');  // 출력값 : 97 (아스키 코드 의거)

     System.out.println("================ 문자와 정수의 연산 ================");
     System.out.println('a' + 1);  // 98
     System.out.println('a' - 1);  // 96
     System.out.println('a' * 2);  // 194
     System.out.println('a' / 2);  // 48
     System.out.println('a' % 2);  // 1

     System.out.println("================ 문자와 실수의 연산 ================");
     System.out.println('a' + 1.0);  // 98.0
     System.out.println('a' - 1.0);  // 96.0
     System.out.println('a' * 2.0);  // 194.0
     System.out.println('a' / 2.0);  // 48.5
     System.out.println('a' % 2.0);  // 1.0

     // 결론은 문자는 내부적으로 숫자 취급을 한다
     // 결론은 지금까 숫자끼리의 연산을 확인한 것이다.

     // 문자열의 연산
     // 문자열과 문자열의 '+'연산만 가능하고, 연산결과는 무자열 합치기(이어 붙이기)가 된다.
     System.out.println("================ 문자열과 문자열의 연산 ================");
     System.out.println("hello" + "world");

     // 문자열과 문자열의 '+'연산만 가능하고, 연산결과는 무자열 합치기(이어 붙이기)가 된다.
     System.out.println("================ 문자열과 다른 형태의 연산 ================");
     System.out.println("hello" + 123); //hello123
     System.out.println("hello" + 123.456); //hello123.456
     System.out.println("hello" + 'a'); //helloa
     System.out.println("hello" + true); //helloture
     System.out.println("hello" + true); //helloture

     // 논리연산은 모든 사칙연산이 안되다.
     // 논리값과 문자얼의 + 연산만 사용가능하다.

     // 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기르이 공결과가 된다.
     System.out.println("============================================");
     System.out.println("123" + "456"); // 123456
     System.out.println("9" + 9); // 99 문자열 취급
     System.out.println(9 + "9"); // 99 문자열 취급
     System.out.println(9 + "9"); // 99 문자열 취급
     System.out.println(9 + 9 + "9"); // 189 문자열 취급 연산의 방향은 왼쪽에서 오른쪽
     System.out.println(9 + "9" + 9); // 999 문자열 취급 연산의 방향은 왼쪽에서 오른쪽
     System.out.println("9" + 9 + 9); // 999 문자열 취급 연산의 방향은 왼쪽에서 오른쪽
     System.out.println("============================================");

     System.out.println("============ 10과 20의 사칙연산 ==============");
     System.out.println("10과 20의 합 : " + (10 + 20));
     System.out.println("10과 20의 차 : " + (10 - 20));
     System.out.println("10과 20의 곱 : " + (10 * 20));
     System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
     System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));
    }
}
