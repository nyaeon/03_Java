// ✅ Application2 클래스 개념 정리

package com.ogiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        // 1. ExceptionTest 클래스의 객체 생성
        ExceptionTest et = new ExceptionTest();  // Create an instance

        try {
            // 2. checkEnoughMoney 호출
            //    가격: 1만, 가진 돈: 5만 → 충분하므로 예외 발생 X
            et.checkEnoughMoney(10000, 50000);

            // 3. 예외가 발생하지 않으면 이 문장도 실행됨
            System.out.println("===== Could buy the product! =====");
        } catch (Exception e) {
            // 4. 예외가 발생한 경우 실행됨 (이번 경우엔 실행되지 않음)
            System.out.println("===== Could not buy the product! =====");
        }

        // 5. 항상 실행되는 종료 메시지
        System.out.println("Exit the application!");
    }
}

/*
🧠 정리 요약
- checkEnoughMoney(10000, 50000): 돈이 충분하기 때문에 예외 발생 X
- try 블록 안의 모든 코드 정상 실행
- catch 블록은 실행되지 않음
- 마지막 println("Exit the application!")은 항상 실행됨

📌 실제 출력 결과
가지고 계신 돈은: 50000원 입니다.
You have enough money!
Have a nice shopping!
===== Could buy the product! =====
Exit the application!
*/
