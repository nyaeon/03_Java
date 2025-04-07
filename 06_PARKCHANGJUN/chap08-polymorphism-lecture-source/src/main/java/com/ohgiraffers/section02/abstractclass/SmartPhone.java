package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product /*, java.util.Date*/ {
    // JAVA는 하나 밖에 상속을 못한다.(단일 상속만 가능)

    public SmartPhone() {
    }

    @Override
    public void abstMethod() {
        System.out.println("Product클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }

}
