package com.ohgiraffers.section03.constructor;

public class Application {
    public static void main(String[] args) {
    /*
    *생성자란?
    * 인스턴스츨 생성할 때 호출하는 반환형이 없는 함수로 기본 생성자와 매개변수 있는 생성자로
    * 나눌 수 있다.
    *
    * 클래스명
     */

        User user1 = new User();
        System.out.println(user1.information());
    }
}
