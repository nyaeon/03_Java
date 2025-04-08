package com.ohgiraffers.section02.abstractclass;

public class Smartphone extends Product {

    @Override
    public void abstractMethod() {
    System.out.println("product클래스의 abstmethod를 오버아이딩한 메소드");
    }
    public void printSmartphone() {
        System.out.println("smartphone클래스의 printsmartphone 매소드 호출");
    }
}
