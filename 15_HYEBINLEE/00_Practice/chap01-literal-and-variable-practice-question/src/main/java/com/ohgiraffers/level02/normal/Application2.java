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
        // 과목 점수 변수 선언 및 초기화
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        // 총점 및 평균 계산 (정수형 변환)
        int total = (int) (korean + math + english);
        int average = total / 3;

        // 결과 출력
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);
    }
}
