// ✅ Application3 클래스 개념 정리

package com.ogiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        // 1. ExceptionTest 객체 생성
        ExceptionTest et = new ExceptionTest();

        try {
            // 2. checkEnoughMoney 메서드 호출
            //    예외가 발생하지 않으면 아래 문장까지 실행됨
            et.checkEnoughMoney(50000, 10000);  // 가격: 5만, 가진 돈: 1만 → 예외 발생
            System.out.println("===== Could buy the product! =====");

        } catch (Exception e) {
            // 3. 예외 발생 시 catch 블록 실행
            System.out.println("===== Could not buy the product! =====");
        }

        // 4. 예외와 관계없이 항상 실행되는 코드
        System.out.println("Exit the application!");
    }
}

/*
🧠 정리 요약
- try 블록 안에서 예외가 발생할 수 있는 코드를 실행
- 예외 발생 시, 바로 catch 블록으로 이동하여 예외 처리
- catch 블록에서는 사용자에게 에러 메시지를 보여주거나 복구 작업 수행 가능
- 예외가 발생하든 안 하든 마지막 println은 항상 실행됨

📌 실행 흐름 예시
1. "가지고 계신 돈은: 10000원 입니다." 출력
2. Exception 발생 → catch 블록으로 이동
3. "===== Could not buy the product! =====" 출력
4. "Exit the application!" 출력
*/
