package com.ohgiraffers.section02.abstractlass;

public class SmartPhone extends Product {

    // 부모객체가 추상 메소드를 사용하는 경우 자식 객체에서 오버라이딩 해줘서 인식을 시켜줘야한다.
    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드를 호출함...");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함 ...");
    }
}
