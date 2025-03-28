package com.ohgiraffers.section01.method;

public class Application_07 {

    public static void main(String[] args) {

        // 정수 변수 선언 및 초기화
        int first = 100;  // 첫 번째 숫자
        int second = 50;  // 두 번째 숫자
        int third = 10;   // 세 번째 숫자 (현재 코드에서는 사용되지 않음)
        int fourth = 200; // 네 번째 숫자 (현재 코드에서는 사용되지 않음)

        // Calculator 클래스의 객체 생성
        Calculator cal = new Calculator(); // 'cal'은 Calculator 클래스의 인스턴스를 참조

        // add (두 숫자의 합 계산)
        System.out.println("The summary between two numbers: " + cal.plusTwoNumbers(first, second));
        // plusTwoNumbers() 메서드를 호출하여 두 숫자의 합을 계산하고 출력합니다.

        // Min (두 숫자 중 작은 값 계산)
        System.out.println("Which one is the small one? " + cal.minTwoNumbers(first, second));
        // minTwoNumbers() 메서드를 호출하여 두 숫자 중 더 작은 값을 계산하고 출력합니다.

        // Max (두 숫자 중 큰 값 계산) - Static 메서드 호출
        System.out.println("Which one is the big one? (Static Method) : " + Calculator.maxNumberOF(first, second));
        // maxNumberOF() 메서드는 static 메서드로, 클래스 이름을 통해 바로 호출할 수 있습니다.
        // 이 메서드는 두 숫자 중 더 큰 값을 반환합니다.

    }
}

