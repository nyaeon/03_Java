package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 배열의 사용 방법
         * 1. 배열의 선언
         * 2. 배열의 크기 할당
         * 3. 배열의 인덱스 공간에 값 대입
         * */

        // 둘다 가능 - 대괄호가 뒤에 붙어도 돌아가지만 권장되진 않음
        int[] iArr;
        // char cArr[];
        // iArr = new int[]; // 배열은 반드시 크기를 할당해주어야한다.

        // 참조자료형 변수 출력 결과 = toString()의 결과와 같음 -> 자료형 @ 16진수의 주소값
        iArr = new int[10];
        char[] cArr = new char[5];

        System.out.println("iArr = " + iArr); // [I@36baf30c
        System.out.println("cArr = " + cArr); // [C@23fc625e

        System.out.println("iArr의 10진수 주소" + iArr.hashCode());
        System.out.println("cArr의 10진수 주소" + cArr.hashCode());
        
        cArr = null;
        System.out.println("cArr = " + cArr);
                
    }
}
