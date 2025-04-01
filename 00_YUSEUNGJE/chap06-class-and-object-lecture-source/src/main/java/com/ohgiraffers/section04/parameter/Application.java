package com.ohgiraffers.section04.parameter;

public class Application {

    public static void main(String[] args) {

        /*
        * 파라미터로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형(참조자료형)
        * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
        * 5. 가변인자
        * */

        // 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
        // 리터럴 값(참조 주소값 X)을 전달해서 메소드를 호출 시에는 서로 다른 지역 변수는 서로 영향 X
        int num = 20;
        System.out.println("call by value 전 : " + num);

    }
}
