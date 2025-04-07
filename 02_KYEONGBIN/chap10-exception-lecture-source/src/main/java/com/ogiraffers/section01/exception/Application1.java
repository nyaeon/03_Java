// ✅ Application1 클래스 개념 정리

package com.ogiraffers.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {

        /*
         * ⚠ 예외 처리에 대한 설명
         *
         * 1. 강제로 예외를 발생시키는 방법
         *    → throw new 예외클래스명();
         *
         * 2. 예외 처리 방법
         *    - throws로 메서드 호출부에 예외를 위임 (이 예제처럼)
         *    - try-catch 문으로 예외를 직접 처리
         */

        // 1. ExceptionTest 인스턴스 생성
        ExceptionTest et = new ExceptionTest();

        // 2. 첫 번째 메서드 호출 → 돈이 충분하므로 예외 발생 X
        et.checkEnoughMoney(10000, 50000);

        // 3. 두 번째 메서드 호출 → 돈이 부족하므로 예외 발생 O
        et.checkEnoughMoney(50000, 10000);

        // 4. 예외 발생 시 이 문장은 실행되지 않음
        System.out.println("Quit the service!");
    }
}

/*
🧠 정리 요약
- main 메서드에 throws Exception을 사용해 예외를 호출한 곳(main)으로 위임
- 첫 번째 호출은 정상적으로 통과
- 두 번째 호출에서 Exception 발생 → 프로그램 종료
- 아래 println("Quit the service!")는 실행되지 않음

📌 실제 출력 결과
가지고 계신 돈은: 50000원 입니다.
You have enough money!
Have a nice shopping!
가지고 계신 돈은: 10000원 입니다.
(여기서 예외 발생 → 프로그램 중단)

⚠ 예외를 try-catch로 감싸지 않았기 때문에 에러 메시지와 함께 종료됨
*/
