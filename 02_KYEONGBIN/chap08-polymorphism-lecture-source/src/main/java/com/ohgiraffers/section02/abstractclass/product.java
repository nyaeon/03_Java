package com.ohgiraffers.section02.abstractclass;

public abstract class product {
    
    private int nonStaticfield;
    private static int staticField;
    
    // 푸상 클래스는 생성자도 가질 수 있다.
    // 하지만 직접적으로 인스턴스를 생성할 수 없다
    public product() {}
    
    
    public void nonStaticMethod() {
        System.out.println("Product클래스의 nonStaticMethod 호출함...");
    }
    
    public void staticMethod() {
        System.out.println("Product 클래스의 staticmehod 호출함");
    }

    public abstract void abstMethod (); // 추상 메서드  {} 없음...
}
