package com.ohgiraffers.section03.math;
// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lang 패키지를 의미한다.
// 워낙 기본이 되는 패키지이다보니, 생략해도 컴파일러가 처리해준다.

public class Application1 {
    public static void main(String[] args) {
        System.out.println("-12.4의 절대값 : " + Math.abs(-12.4));
        System.out.println("10과 20 중 더 작은 것은: " + Math.min(10, 20));
        System.out.println("10과 20 중 더 큰 것은: " + Math.max(10, 20));
        System.out.println("난수 생성: " + Math.random());
    }
}
