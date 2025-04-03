package com.ohgiraffers.section03.Constant;

// 상수는 한번 담기면 이후엔 담지 않는다는 의미를 가진다. (종단의 의미를 가진다.)
// ex) 누군가 클래스를 가지고 가면 가지고 가지 말라는 뜻
public class Application2 {

    public static void main(String[] args) {

        // 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40; // 소문자도 가능하지만 소문자로 작성하는 건 관례상 사용 X

        // 2. 단어와 단어 연결은 언더스코어(_)
        final int MAX_AGE = 60;
        final int MIN_AGE = 60;
        final int minAGE = 60; // 낙타봉 표기법도 관례상 사용 X



    }
}
