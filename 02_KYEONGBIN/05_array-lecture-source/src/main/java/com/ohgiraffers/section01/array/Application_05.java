package com.ohgiraffers.section01.array;

import java.util.Random; // 랜덤 숫자를 생성하기 위한 Random 클래스 import

public class Application_05 {
    public static void main(String[] args) {

        // 카드의 모양을 저장한 배열
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};

        // 카드 숫자 또는 그림 문자를 저장한 배열 (10이 누락되지 않도록 포함)
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "ACE"};

        // 1. Math.random()을 사용하여 랜덤한 카드 선택
        int randomShapeIndex = (int) (Math.random() * shape.length);  // 0 ~ 3 범위의 랜덤 값 생성
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length);  // 0 ~ 12 범위의 랜덤 값 생성

        // 선택된 랜덤 카드를 출력
        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex] + " 카드입니다.");

        // 2. Random 클래스를 사용하여 랜덤한 카드 선택 (대체 방법)
        Random random = new Random(); // Random 객체 생성
        int randomShapeIndex2 = random.nextInt(shape.length); // 0~3 사이의 랜덤 값 생성
        int randomCardNumberIndex2 = random.nextInt(cardNumber.length); // 0~12 사이의 랜덤 값 생성

        // Random 클래스를 이용한 결과 출력
        System.out.println("Random 클래스를 사용하여 뽑은 카드는 " + shape[randomShapeIndex2] + " " + cardNumber[randomCardNumberIndex2] + " 카드입니다.");
    }
}
