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
    public static String rockPaperScissors() {
        String[] hand = { "가위", "바위", "보"};
        String randomHand = hand[(int) (Math.random() * hand.length)];
        /*
        hand[0] = "가위"; 이런 식으로 되어서 randomHand에 값으로 들어감.
         */
        switch (randomHand) {
            case "가위":
                System.out.println("가위");
                break;
            case "바위":
                System.out.println("바위");
                break;
            case "보":
                System.out.println("보");
                break;
        }
        return randomHand;
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
    public static String tossCoin() {
        int coinFlip = (int) (Math.random() * 2); // 0 또는 1 반환
        if (coinFlip == 0) {
            System.out.println("앞면");
        } else {
                System.out.println("뒷면");
        }
        return String.valueOf(coinFlip);
    }

}
