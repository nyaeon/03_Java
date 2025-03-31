package com.ohgiraffers.section01.level01.normal;

import static com.ohgiraffers.section01.level01.normal.RandomMaker.*;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        // 가위바위보
        String result = rockPaperScissors();
        System.out.println(result);

        // 코인
        String coin = tossCoin();
        System.out.println(coin);
    }

}
