package com.ogiraffers.section02;

public class Application1 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(-50000, 50000);
//            et.checkEnoughMoney(50000, -50000);
            et.checkEnoughMoney(50000, 30000);
        } catch (Exception e) { // e에는 위에 모든 정보가 들어감
            e.printStackTrace(); // 우리는 이걸 인지만 하면 된다고 함 // 예외처리를 한다는건 그 다음 코드를 실행하겠다는 것임

            System.out.println("Exit the Application");

        }
    }
}

