package com.ohgiraffers.section01.level01.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    static String rockPaperScissors() {
        List<String> rps = Arrays.asList("가위", "바위", "보");
        int randomNum = (int) (Math.random() * 3);

        String result = rps.get(randomNum);
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

    static String tossCoin() {
        List<String> coin = Arrays.asList("앞", "뒤");
        int randomNum = (int) (Math.random() * 2);

        String result = coin.get(randomNum);
        System.out.println(result);
        return result;
    }

}
