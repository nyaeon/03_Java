package com.ohgiraffers.literal;

public class Application2 {
public static void main(String[] args) {
    System.out.print("정수와 정수의 연산 :");
    System.out.println(123+456);
    System.out.println(123-23);
    System.out.println(123*10);
    System.out.println(123/10);
    System.out.println(123%10); //연산 후 나머지 값

    System.out.println("실수와 실수의 연산 :");
    System.out.println(1.23+1.23);
    System.out.println(1.23-0.23);
    System.out.println(1.23*10.0);
    System.out.println(1.23/10.0);
    System.out.println(1.23/3.0); // 오차가 발생

    System.out.println("정수와 실수의 연산 :"); // 정수와 실수 연산값은 실수로 나옴
    System.out.println(123+0.5);
    System.out.println(123-0.5);
    System.out.println(123*0.5);
    System.out.println(123/0.5);
    System.out.println(123%0.5);

    System.out.println("문자와 문자의 연산 :");
    System.out.println('a'+'b');
    System.out.println('a'-'b');
    System.out.println('a'*'b');
    System.out.println('a'/'b');
    System.out.println('a'%'b');


    System.out.println("문자와 정수의 연산 :");
    System.out.println('a'+1);
    System.out.println('a'-1);
    System.out.println('a'*2);
    System.out.println('a'/2);
    System.out.println('a'%2);

    System.out.println("문자와 실수의 연산 :");
    System.out.println('a'+1.0);
    System.out.println('a'-1.0);
    System.out.println('a'*2.0);
    System.out.println('a'/2.0);
    System.out.println('a'%2.0);

    //문자열의 연산
    // 문자열과 문자열의 + 연산만 가능, 연산의 결과는 문자열 합치기(이어 붙이기)

    System.out.println("문자열과 문자열의 연산 :");
    System.out.println("hello"+"world");
   /*
    System.out.println("hello"-"world");
    System.out.println("hello"*"world");
    System.out.println("hello"/"world");
    System.out.println("hello"%"world");
    */

    System.out.println("문자열과 다른 형태의 연산 :");
    System.out.println("hello"+123);
    System.out.println("hello"+123.456);
    System.out.println("hello"+'a');
    System.out.println("hello"+true);

    //논리 연산은 모든 사칙연산이 불가함
    //논리값과 문자열의 +연산만 사용가능
    System.out.println("123"+"456");
    //자료형 변경시 문자형 변수를 앞쪽에 배치하면 됨
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


    int a =10;
    int i=1;
    while(i<=10){
    System.out.println(a+i);
    i++;









    }













}
}
