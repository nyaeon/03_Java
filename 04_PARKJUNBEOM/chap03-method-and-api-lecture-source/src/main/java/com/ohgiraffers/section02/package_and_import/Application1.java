package com.ohgiraffers.section02.package_and_import; // 현재 클래스가 속한 패키지
// import 등록을 생략해도 사용가능ㅎ나 패키지가 있는데, java.lang 패키지를 의미한다.
// 워낙 기본이 되는 패키지이다보니, 생략해도 컴파일이 됨


// 다른 패키지에 있는 Calculator 클래스를 사용하기 위해 해당 클래스를 임포트합니다.
// 이 경우, Calculator 클래스를 풀 네임으로 사용하고 있습니다.

public class Application1 {

    public static void main(String[] args) {

        // Calculator 클래스를 풀 네임으로 사용하여 객체를 생성합니다.
        // com.ohgiraffers.section01.method.Calculator는 Calculator 클래스의 풀 패키지 경로입니다.
        com.ohgiraffers.section01.method.Calculator calculator =
                new com.ohgiraffers.section01.method.Calculator(); // 객체 생성

        // plusTwoNumbers 메서드를 호출하여 두 숫자의 합을 구함
        int plusResult = calculator.plusTwoNumbers(100, 50);
        System.out.println("The plus result is: " + plusResult); // 결과 출력

        // maxNumberOF 메서드를 호출하여 두 숫자 중 더 큰 값을 구함
        int maxResult = calculator.maxNumberOf(100, 50);
        System.out.println("The max result is: " + maxResult); // 결과 출력

    }
}