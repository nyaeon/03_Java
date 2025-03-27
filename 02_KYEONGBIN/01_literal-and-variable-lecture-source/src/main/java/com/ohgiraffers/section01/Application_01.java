package com.ohgiraffers.section01; // 패키지 선언 (파일의 위치를 나타냄)

public class Application_01 { // 클래스명은 파일명과 동일해야 함

    public static void main(String[] args) { // 코드 실행의 진입점 (main 메서드)

        // 다양한 형태의 값 출력
        System.out.println("Hello World");
        System.out.println("Hi!");

        // 실수 출력
        System.out.println(1.234);

        // 문자 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000'); // 널 문자 (Null Character)

        // 문자열 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println(""); // 빈 문자열 허용됨

        // 논리값 출력
        System.out.println(true);
        System.out.println(false);
    }
}
