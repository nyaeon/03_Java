package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */
    public static String rockPaperScissors () {
        int hand = (int) (Math.random()*4);
        String result;
        if (hand == 0) {
            result = "바위";
        } else if (hand == 1) {
            result = "가위";
        } else {
            result = "보";
        }
        System.out.println(result);
        return result;
    }

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public static String tossCoin () {
        int coin = (int) (Math.random()*2);
        String result;
        if (coin == 0) {
            result = "앞면";
        } else {
            result = "뒷면";
        }
        System.out.println(result);
        return result;
    }

}
