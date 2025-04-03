package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        // 1. 정수를 취급하는 자료형
        // 변수를 선언
        byte bNum;  // 1byte
        short sNum; // 2byte
        int iNum;   // 4byte(default)
        long lNum;  // 8yte

        // 2. 실수를 취급하는 자료형
        float fNum;  // 4byte
        double dNum; // 8byte

        // 3. 문자를 취급하는 자료형
        char ch;     // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue; // 1byte
        // is가 붙어있으면 99프로 거의 boolean 타입이다.

        // 5. 문자열을 취급하는 자료형(기본 자료형은 아니고 참조 자료형이다.)
        String str; // 4byte
        // class를 만들때 기본원칙은 첫 글자가 대문자여야 한다.

        // 자료형 별로 초기화
        bNum = 1;
        sNum = 2;
        iNum = 4;
//        lNum = 22000000000; 에러가 나옴.
        lNum = 220000000000L; // long형에 대입되는 값은 L을 붙인다. 소문자도 가능.
        lNum = 8;

        fNum = 3.14f; // double형으로 인식되는 실수를 float에 담을 때에는 f를 붙인다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;    // char는 양수 가능

        isTrue = true;

        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum / 3);
        double avg = sum / 3.0;
        System.out.println("avg = " + avg);
        // 나눗셈은 일반적으로 실수 결과가 나오며 나눌 때 항 중에 하나 이상은 실수값이어야 한다.
        // 대괄호 : 브레이스
    }
}
