package com.ohgiraffers.section01.literal;

public class Application1 {

    /***
     * 메소드의 요약기능을합니다.
     * @param args
     */

    public static void main(String[] args) {
        // 한줄 주석
        /*
         * 여기도 주석
         * 아래도 주석
         * 여러줄 주석
         */
        System.out.println("Hello World!");

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
        //System.out.println(''); // 아무 문자도 기록하지 않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");


    }
}

//JAVA의 첫 상단에는 패키지가 무조건 들어와야 한다.
// 패키지가 없으면 생성은 되지만 다른곳에서 참조해서 쓸 수 없다.
// 어디있는지 모르기 때문.
// public class의 명칭에 파일명을 써야한다.
// main(method) : 기능
// .은 참조한다는 기능
