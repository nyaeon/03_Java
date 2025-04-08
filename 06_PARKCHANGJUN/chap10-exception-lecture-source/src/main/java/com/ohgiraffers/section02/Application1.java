package com.ohgiraffers.section02;

// 패키지 중에 자바 랭은 자동으로 컴파일러가 추가해준다.

public class Application1 {

    public static void main(String[] args) {


        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnougMoney(-50000, 50000);
//            et.checkEnougMoney(50000, -50000);
            et.checkEnougMoney(50000, 30000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 예외처리를 한다는건 다음 코드를 수행한다는 것
        System.out.println("프로그램을 종료합니다.");
    }
}

