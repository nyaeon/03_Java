package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {
        String result = RandomMaker.rockPaperScissors();
        System.out.println(result);

        String reuslt = RandomMaker.tossCoin();
        System.out.println(reuslt);
        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
    }

}

