package com.ohgiraffers.section02.abstactclass;

public class SmartPhone extends Product {

    public SmartPhone() {}

    // 사용하고 싶지 않더라도 재정의해줘야함. 강제성
    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메소드 호출함..");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
