package com.ohgiraffers.section01.method;  // 패키지 선언 - 해당 클래스가 속한 패키지

public class Application_06 {  // Application_06 클래스 정의

    public static void main(String[] args) {  // main 메서드 - 프로그램의 시작점

        // main() 호출 시 출력되는 문장
        System.out.println("main() is called");

        // testMethod() 메서드 호출 후 반환값을 result 변수에 저장
        String result = testMethod();  // testMethod()가 반환하는 값을 result에 저장
        System.out.println("result: " + result);  // result 값을 출력

        // testMethod() 메서드를 호출하여 바로 출력
        System.out.println("result2 = " + testMethod());  // testMethod() 호출 결과 바로 출력

        System.out.println("main() is finished");  // main() 종료 메시지 출력

    }  // main() 메서드 종료

    /***
     * testMethod()는 "test"라는 값을 반환하는 메서드입니다.
     * 반환 타입은 String으로, 메서드 실행 후 "test"라는 값을 반환합니다.
     */
    public static String testMethod() {  // 반환 타입은 String, static 메서드
        System.out.println("test() is called");  // testMethod() 호출 시 출력되는 문장
        return "test";  // "test" 값을 반환

//        return ""; // null이나 빈 문자열을 반환할 수도 있습니다. 하지만 여기선 "test" 값을 반환합니다.
    }  // testMethod() 메서드 종료

}  // Application_06 클래스 종료
