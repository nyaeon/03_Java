package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    public void checkEnougMoney(int price, int money) throws Exception {
        System.out.println("가진 돈은 " + money + " 원이다");
        if(money >= price){
            System.out.println("금액 보유");
        }else {
            //System.out.println("금액 부족");
            throw new Exception(); // 예외 발생 구문 이하 구문은 동작하지 않고 종료

        }
        System.out.println("홈플러스 가격이 착해");
    }

}
