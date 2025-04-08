// ✅ ExceptionTest 클래스 개념 정리

package com.ogiraffers.section01.exception;

public class ExceptionTest {

    // 📌 메서드: checkEnoughMoney
    // 기능: 사용자가 가진 돈(money)과 물건의 가격(price)을 비교하여,
    //       충분하지 않으면 예외(Exception)를 발생시킨다.
    public void checkEnoughMoney(int price, int money) throws Exception {

        // 1. 가진 돈 출력
        System.out.println("가지고 계신 돈은: " + money + "원 입니다.");

        // 2. 가격과 비교
        if (money >= price) {
            System.out.println("You have enough money!");  // 충분하면 출력
        } else {
            // 3. 부족하면 예외 발생
            throw new Exception(); // 이 아래 코드는 실행되지 않음

            // System.out.println("You don't have enough money!"); ← 실행되지 않음
        }

        // 4. 예외가 없을 경우 출력
        System.out.println("Have a nice shopping!");
    }
}

/*
🧠 정리 요약
- throw new Exception(): 예외를 강제로 발생시킴
- throws Exception: 예외가 발생할 수 있음을 메서드에 명시
- 예외가 발생하면 이후 코드는 실행되지 않고 메서드가 종료됨
- 예외 처리를 하지 않으면 컴파일 에러 발생 (try-catch 또는 throws 필요)

📌 사용 예시
ExceptionTest et = new ExceptionTest();
et.checkEnoughMoney(5000, 3000); // 예외 발생
*/
