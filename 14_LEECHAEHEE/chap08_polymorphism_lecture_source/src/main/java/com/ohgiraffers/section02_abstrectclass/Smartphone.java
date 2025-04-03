package com.ohgiraffers.section02_abstrectclass;

public class Smartphone extends Product {

    @Override
    public void abstMethod() {
        System.out.println("Product의 abstMethod를 오버라이딩한 메소드 호춣함...");
    }

    public void printSmartphone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함..");
    }
}
