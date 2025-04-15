package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnougMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            // System.out.println("상품을 구입하기 위한 금액이 부족합니다.");
            throw new Exception();  // 예외발생구문 이하 구문은 동작하지 않고 종료된다.
        }

        System.out.println("즐거운 쇼핑하세요~~~");
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