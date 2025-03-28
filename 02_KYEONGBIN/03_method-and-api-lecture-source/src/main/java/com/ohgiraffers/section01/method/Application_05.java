package com.ohgiraffers.section01.method;  // 패키지 선언 - 해당 클래스가 속한 패키지

public class Application_05 {  // 클래스 선언 - Application_05 클래스 정의

    public static void main(String[] args) {  // main 메서드 - 프로그램의 시작점

        // Application_05 객체를 생성하여 testMethod() 호출
        Application_05 app = new Application_05();  // Application_05 클래스의 인스턴스를 생성
        app.testMethod();  // 생성된 객체를 통해 testMethod() 메서드를 호출

    }  // main() 메서드 종료

    /***
     * testMethod() 메서드는 간단한 출력만 하는 메서드입니다.
     * 메서드 실행 후 return 키워드가 자동으로 추가된다는 내용을 확인할 수 있습니다.
     */
    public void testMethod() {  // testMethod() 메서드 정의 (return 타입은 void, 즉 반환값이 없음)
        System.out.println("Check testMethod() is working");  // 메서드 호출 시 출력되는 문장

        return;  // return;은 사실 필수는 아닙니다. 컴파일러가 자동으로 메서드 끝에 return을 추가합니다.
    }  // testMethod() 메서드 종료

}  // Application_05 클래스 종료
