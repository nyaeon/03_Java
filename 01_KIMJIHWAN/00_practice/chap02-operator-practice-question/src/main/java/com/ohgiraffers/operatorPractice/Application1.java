package com.ohgiraffers.operatorPractice;

public class Application1 {

    public static void main(String[] args) {
        int a = 9;

        String isTrue = (a == 2 * a)? "짝수": "홀수";
        System.out.println("예)정수 9를 선언했을 경우");
        System.out.println("");
        System.out.println(isTrue);

        /*
         * 임의의 정수를 하나 선언하고 선언한 숫자가 짝수이면 "짝수다", 짝수가 아니면
         * "홀수다"를 출력하세요
         *
         * ------- 출력 결과 화면 ----------
         *
         * 예)정수 9를 선언했을 경우
         *
         * 홀수
         * */

    }
}
