package com.ohgiraffers.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        double KOR = 80.5;
        double MATH = 50.6;
        double ENG = 70.8;
        int total = (int) (KOR + MATH + ENG);
        int average = (int) (KOR + MATH + ENG) / 3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);


    }
}
