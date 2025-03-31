package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {
    Random random = new Random();
    String answer = RandomMaker.rockPaperScissors();
    System.out.println(answer);

    String answer2 = RandomMaker.tossCoin();
    System.out.println(answer2);
        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
    }

}
