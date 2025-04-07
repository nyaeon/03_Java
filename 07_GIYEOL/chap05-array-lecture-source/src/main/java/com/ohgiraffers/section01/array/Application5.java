package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        String[] shape ={"SPADE","CLOVER","HEART","DIAMOND"};
        String[] cardnumber ={"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
        int randomshapeindex = (int)(Math.random()*shape.length); //0~3까지
        //new Random().nextInt(shape.length);
        int randomcardindex = (int)(Math.random()*cardnumber.length); //0~12개까지
    System.out.println("당신이 뽑은 카드는 "+shape[randomshapeindex]+" "+cardnumber[randomcardindex]+"입니다.");
    }
}
