package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    private int nonstaticfield;
    private static int staticfield;
    // private Static int staticfield;
    //추상 클래스는 생성자도 가질 수 있다
    //하지만 직접적으로 인스턴스를 생성할 수 없다
    public Product() {}
    public void nonstaticfield() {
        System.out.println("product electrostatically 호출");
    }
    //public static staticfield()// 원래 이거임
    public static void staticfield() {
        System.out.println("product static 메소드 호출");
    }
    public abstract void abstractMethod(); //추상메소드
}
