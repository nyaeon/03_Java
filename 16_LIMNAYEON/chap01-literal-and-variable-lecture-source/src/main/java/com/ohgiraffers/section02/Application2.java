package com.ohgiraffers.section02;

public class Application2 {
    public static void main(String[] args) {

        // 1. 정수를 취급하는 자료형
        // 변수를 선언
        byte bNum;      // 1byte
        short sNum;     // 2byte
        int iNum;       // 4byte
        long lNum;      // 8byte

        // 2. 실수를 취급하는 자료형
        float fNum;     // 4byte
        double dNum;    // 8btte

        // 3. 문자를 취급하는 자료형
        char ch;      // 2byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue;   // 1byte

        // 5. 문자열을 취급하는 자료형(참조 자료형
        String str;       // 4byte

        // 자료형 별로 초기화
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 220000000L; // long형에 대입되는 값은 L을 붙인다.

        fNum = 3.14f;      // double로 인식되는 실수를 float에 담을 때는 f를 붙인다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;    // char는 양수만 가능

        isTrue = true;

        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        System.out.println(sum / 3);
        double avg = sum / 3.0; // 나눗셈을 일반적으로 실수 결과가 나오며
                                // 나눌 때 항 중에 하나 이상은 실수값이어야 한다.

        System.out.println("avg = " + avg);
    }
}
