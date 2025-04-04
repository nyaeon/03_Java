package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {

    public SmartPhone() {
    }



    @Override
    public void abstractMethod() {    // 부모가 추상클래스면 자식 클래스는 반드시 오버라이딩 해야 함
        System.out.println("Product 클래스의 abstractMethod 메소드를 호출함");
    }

    public void printSmartPhone() {
        System.out.println();
    }

}
