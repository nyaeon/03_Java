package com.ohgiraffers.section02.abstractclass;

// 추상클래스로 바꿈
public abstract class Product {

    private int nonStaticField;
    private static int staticField;
    // 추상클래스는 기본 생성자도 가질 수 있다.
    // 하지만 직접적으로 인스턴스를 생성할 수 없다.
    public Product() {} // 기본생성자

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }

    public static void staticMethod() /*메소드 헤드*/ {
        System.out.println("Product 클래스의 staticMethod 호출함..."); /*메소드 바디*/
    }

    public abstract void abstMethod(); // 추상메소드. 이걸 주석하면 오류가 없는데 주석안하면 오류가 나옴. 강제성을 부여해야 없어짐


}
