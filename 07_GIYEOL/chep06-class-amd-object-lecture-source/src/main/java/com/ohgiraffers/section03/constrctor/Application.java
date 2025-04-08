package com.ohgiraffers.section03.constrctor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /**
         * 생성자란
         * 인스턴스를 생성할 떄 호출하는 반환형잉 없는 함수로 기본 생성자와 매개변수 있는 생성자
         * 나누기 가능
         *
         * 클래스명 레퍼런스변수명 = new 생성자 (); > 객체 생성
         */
        User user1 = new User();
        System.out.println(user1.information());

        User user2 = new User("user01","pass01","길동");
        System.out.println(user2.information());

        User user3 = new User("user02","pass02","유관순",new Date());
        System.out.println(user3.information());
    }
}