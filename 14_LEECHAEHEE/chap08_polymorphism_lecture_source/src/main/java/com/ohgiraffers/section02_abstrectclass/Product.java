package com.ohgiraffers.section02_abstrectclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    // 추상 클래스는 생성자도 가질 수 있다
    // 하지만 직접적으로 인스턴스를 생성할 수 없다.
    public Product() {}

    public void nonStaticMethod() {
        System.out.println("Product의 nonStaticMethod 호출함...");
    }

    public static void staticMethod() {
        System.out.println("Product의 StaticMethod 호출함...");
    }

    public abstract void abstMethod(); // 추상 메소드
}
