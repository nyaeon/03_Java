package com.ohgiraffers.section01.level02.normal;

import java.util.Random;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */

        // 정수형 배열 선언
        int[] iArr = new int[10];

        // 배열 전체, 최대값, 최소값 저장할 변수 선언 및 초기화
        String arr = "";
        int maxNum = 1;
        int minNum = 10;

        // 1~10 사이의 난수로 배열 할당
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = new Random().nextInt(10) + 1;
        }

        // 배열 전체 값, 최대값, 최소값 출력
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] > maxNum) {
                maxNum = iArr[i];
            }
            if (iArr[i] < minNum) {
                minNum = iArr[i];
            }
            arr += iArr[i] + " ";
        }

        System.out.println(arr);
        System.out.println("최대값 : " + maxNum);
        System.out.println("최소값 : " + minNum);
    }
}
