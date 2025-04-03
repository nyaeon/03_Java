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
    public static String rockPaperScissors() {
        Random random = new Random();
        int choice = random.nextInt(3);

        if (choice == 0) {
            System.out.println("가위");
        } else if (choice == 1) {
            System.out.println("바위");
        } else {
            System.out.println("보");
        }
        return "";
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
        Random random = new Random();
        int coin = random.nextInt(2);

        if (coin == 0) {
            System.out.println("앞면");
        } else {
            System.out.println("뒷면");
        }
        return "";
    }
}
