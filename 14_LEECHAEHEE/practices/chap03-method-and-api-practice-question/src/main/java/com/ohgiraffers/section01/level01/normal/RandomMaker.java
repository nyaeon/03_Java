package com.ohgiraffers.section01.level01.normal;

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

    public static void rockPaperScissors() {
        double ranNum = Math.floor(Math.random() * 3 + 1);
        System.out.println((ranNum == 1) ? "가위" : ((ranNum == 2) ? "바위" : "보"));
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

    public static void tossCoin() {
        double ranNum = Math.floor(Math.random() * 2 + 1);
        System.out.println((ranNum == 1) ? "앞면" : "뒷면");
    }
}
