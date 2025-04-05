package com.ohgiraffers.section01.level01.basic;

public class Calculator {

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
    void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
    /*
    explain: String으로 반환해줘야 한다면 void는 안되고, 여기에 출력 문장을 해줘야 한다면
     */

    String sumTwoNumber(int a, int b) {
        return a + "과 " + b + "의 합은 " + (a + b) + "입니다.";
    }

    // 반환값 : String
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    String multi(int a, int b) {
        return a + "과 " + b + "의 곱은 " + a*b + "입니다.";
    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber2
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    //    풀이: 여기는 int로 반환해줘야 하고, 출력 내용이 나와야 하네, 그럼 출력은 실행문에서 해줘야겠지?
    int multiTwoNumber2(int a, int b) {
        int multiple = a * b;
        return multiple;
    }


}
