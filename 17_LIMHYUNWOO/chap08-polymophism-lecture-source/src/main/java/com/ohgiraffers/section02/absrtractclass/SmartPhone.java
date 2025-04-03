package com.ohgiraffers.section02.absrtractclass;

public class SmartPhone extends Product{

    public SmartPhone() {

    }

    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드 호출함");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 pringSmartPhone 메소드 호출함");
    }
}
