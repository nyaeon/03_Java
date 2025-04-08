package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /***
         * 배열의 사용 벙법
         * 1.배열의 선어
         * 2.배열의 크기 할당
         * 3.배열의 인덱스 공간에 값 대입
         */
        int[] iArr;
       // char cArr[];  둘 다 선언 가능, 대괄호가 뒤에도 붙어도 돌아가지만 권장 x
       // iArr = new int[]; //배열은 반드시 크기를 할당해 주어야 한다
        iArr = new int[10];
        char[] cArr =new char[5];

        //참조자료형 변수 출력 결과 = toString()결과 -> 자료향의 16진수 주소값
        System.out.println(("iarr =")+iArr);
        System.out.println(("carr =")+cArr);
        System.out.println("iarr의 10진수 주소 :" + iArr.hashCode());
        System.out.println("carr의 10진수 주소 :" + cArr.hashCode());
        cArr =null;
        System.out.println("carr ="+cArr);
    }
}
