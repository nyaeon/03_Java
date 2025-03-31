package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {
        String[] shape = {"SPADE", "HEART", "CLUB", "DIAMOND"};
        String[] cardNumber = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

        int randomShapeIndex = (int) (Math.random() * shape.length); // 0 ~ 3
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length); // 0 ~ 12

        System.out.println("당신이 뽑은 카드는 : " + shape[randomShapeIndex] + " "
                + cardNumber[randomCardNumberIndex] + "카드 입니다.");

    }
}
