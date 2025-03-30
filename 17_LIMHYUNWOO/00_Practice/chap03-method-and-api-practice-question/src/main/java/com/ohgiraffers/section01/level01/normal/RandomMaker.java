package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {
    public static String rockPaperScissors() {
        Random random = new Random();
        int randomNum  = random.nextInt(3)+1;
        String re_maker = "";
        if(randomNum==1) {
            re_maker = "바위";
        } else if(randomNum==2) {
           re_maker = "가위";
        } else{
            re_maker = "보";
        }
        return re_maker;
    }
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
    public static String tossCoin(){
        Random random = new Random();
        int backfront = random.nextInt(2)+1;
        String re_maker = "";
        if(backfront==1){
            re_maker = "앞면";
        } else {
            re_maker = "뒷면";
        }
        return re_maker;
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

}
