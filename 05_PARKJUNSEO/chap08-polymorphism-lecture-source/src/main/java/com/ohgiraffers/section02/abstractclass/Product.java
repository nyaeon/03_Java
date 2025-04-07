package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;
    private static int staticField;
    public Product() {}  // 추상클래스는 생성자를 가질 수 있으나 직접 인스턴스는 만들 수 없다.

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출함");
    }

    public abstract void abstractMethod();  // 추상 메소드


}
