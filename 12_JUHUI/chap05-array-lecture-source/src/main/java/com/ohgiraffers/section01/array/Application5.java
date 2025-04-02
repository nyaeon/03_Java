package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {

    public static void main(String[] args) {

        String[] shape = {"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};
        //System.out.println(shape[5]); 오류임. 범위를 넘어가서
        String[] cardNumber = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE" };

        //int randomShapeIndex = new Random().nextInt(shape.length); 얘도 되지만 밑의 예시도 보여주기 위해 주석처리
        int randomShapeIndex = (int) (Math.random() * shape.length); // 0~3까지 나옴
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length); // 0~3까지 나옴

        System.out.println("당신이 뽑은 카드는 " + shape [randomShapeIndex] + " "
        + cardNumber[randomCardNumberIndex] + "카드 입니다.");
    }
}
