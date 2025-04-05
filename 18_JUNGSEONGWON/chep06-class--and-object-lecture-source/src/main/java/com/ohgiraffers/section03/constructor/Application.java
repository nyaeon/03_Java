package com.ohgiraffers.section03.constructor;

import com.ohgiraffers.section03.dto.RequestClass;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /*
        * 생성자란?
        * 인스턴스를 생성 할때 호출하는 반환형이 없는 함수로 기본 생성자와 매개변수 있는 생성자로 나눌 수 있다.
        *
        *
        * 클래스명 레퍼런스변수명  = new 생성자(); --> 객체생성
        * */

        User user1 = new User();
        System.out.println(user1.infromation());

        User user2 = new User("user01","pass01","홍길동");
        System.out.println(user2.infromation());

        User user3 = new User("user02", "pass02", "유관순",new Date());
        System.out.println(user3.infromation());

        RequestClass r= new RequestClass();
        r.requestMethod(user2); //하나의 주소값을 여러 명이 사용을 하니 얕은 복사이다.

//        r.requestMethod2(user);
//        System.out.println(user2);
    }
}
