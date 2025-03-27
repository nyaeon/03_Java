package com.ohgiraffers.section02.variable;

public class Application_02 {

    public static void main(String[] args) {

        // 1. 정수를 취급하는 자료형
        byte bNum; // 1byte
        short sNum; // 2byte
        int iNum; // 4byte (Default)
        long lNum; // 8byte

        // 2. 실수를 취급하는 자료형
        float fNum; // 4byte
        double dNum; // 8byte

        // 3. 문자를 취급하는 자료형
        char ch; // 2byte
        String str; // 참조 자료형, 4byte

        // 4. 논리값을 취급하는 자료형
        boolean isTrue; // true or false

        // 자료형별 초기화
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 22000000000L; // long 타입에는 숫자 뒤에 'L'을 붙여야 함

        fNum = 3.15f; // float형은 숫자 뒤에 'f'를 붙여야 함
        dNum = -3.14;

        ch = 'a'; // 문자 'a'는 유니코드 값 97에 해당
        ch = 97; // 'a'는 97의 유니코드 값과 같음

        isTrue = true; // 논리 값

        // 학생 점수 예시
        int kor = 90;
        int math = 80;
        int eng = 75;

        // 총합 계산
        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        // 평균 계산
        System.out.println(sum / 3); // 정수 나눗셈
        double avg = sum / 3.0; // 실수로 나누기
        System.out.println("avg = " + avg); // 평균 출력
    }
}







