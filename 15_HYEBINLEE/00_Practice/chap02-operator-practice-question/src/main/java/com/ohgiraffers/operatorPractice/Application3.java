package com.ohgiraffers.operatorPractice;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
         * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
         *
         * M
         *
         * ---- 출력 결과 ---
         * 남자입니다.
         * */
        // 문자형 변수 선언 및 초기화
        char gender = 'M';

        // 삼항 연산자를 이용한 성별 판별
        String result = (gender == 'M') ? "남자입니다." : "여자입니다.";

        // 결과 출력
        System.out.println(result);
    }
}
