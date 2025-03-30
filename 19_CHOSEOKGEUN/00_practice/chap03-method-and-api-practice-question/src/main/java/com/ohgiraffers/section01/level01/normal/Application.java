package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // RandomMaker 클래스의 메소드 호출해서 실행

        // 1. rockPaperScissors 메소드 호출
        String rockPaperScissorsResult = RandomMaker.rockPaperScissors();
        System.out.println("가위 바위 보 결과: " + rockPaperScissorsResult);

        // 2. tossCoin 메소드 호출
        String tossCoinResult = RandomMaker.tossCoin();
        System.out.println("동전 결과: " + tossCoinResult);
    }
}
