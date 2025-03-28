package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args) {

        // 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.

        final int AGE1 = 20;
        final int AGE2 = 30;
        final int AGE3 = 40;    // 소문자로 작성하는 건 관례상 X

        // 2. 단어와 단어 연결은 언더스코어(_)를 사용한다.
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAGE = 30;    // 낙타봉 표기법도 관례상X
    }
}
