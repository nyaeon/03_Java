package com.ohgiraffers.section02.abstractclass;

public class Smartphone extends product {


    @Override
    public void abstMethod() {
        System.out.println("Product 클래서의 abstMethod를 오버라딩한 메소드 호출함.");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");


    }
}
