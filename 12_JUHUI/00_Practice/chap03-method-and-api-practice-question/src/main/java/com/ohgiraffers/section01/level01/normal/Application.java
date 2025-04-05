package com.ohgiraffers.section01.level01.normal;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        /* RamdomMaker 클래스의 메소드를 호출해서 실행 */
        RandomMaker rdm = new RandomMaker();

        String result;

        result = rdm.rockPaperScissors();
        System.out.println("가위 바위 보! : " + result);

        result = rdm.tossCoin();
        System.out.println("동전 던지기! 앞면(0) or 뒷면(1)? : " + result);
    }

}
