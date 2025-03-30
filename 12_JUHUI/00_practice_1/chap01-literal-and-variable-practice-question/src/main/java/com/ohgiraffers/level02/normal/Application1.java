package com.ohgiraffers.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */

        /*
        char 타입 변수에 저장하면 자동으로 문자로 매핑되어 나오기 때문에,
        유니코드 값 자체를 출력하려면 int 타입 변수에 저장해야 한다.
         */
        int c = 'a';
        System.out.println("문자 a의 unicode : " + c);
    }
}
