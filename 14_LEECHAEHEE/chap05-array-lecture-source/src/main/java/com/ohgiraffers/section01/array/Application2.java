package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /* 배열 사용 방법
         * 1. 배열의 선언
         * 2. 배열의 크기 할당
         * 3. 배열의 인덱스 공간의 값 대입
         * */

        int[] iArr;
//        char cArr[]; 이렇게 뒤에 대괄호를 붙여서도 선언 가능하지만, 권장 x
//        iArr = new int[];  배열은 반드시 크기를 할당해주어야 함.
        iArr = new int[10];

        // 참조자료형 변수 출력 결과 - toString()의 결과 -> 자료형@16진수 주소값
        char[] cArr = new char[5];
        System.out.println("iArr = " + iArr.toString());
        System.out.println("cArr = " + cArr);
    }
}
