package com.ohgiraffers.section03.interfaceImplements;

public class Application {

    public static void main(String[] args) {

        /**
         * 인터페이스
         * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
         * 추상메소드와 상수필드(public static final)만 가질 수 있는 클래스의 변형체를 말한다.
         */

        Interproduct interproduct = new iterProduct();



        Interproduct interproduct = new iterProduct();

        InterProduct interProduct = new Product();
        interproduct.nonStaticMethod();
        interProduct.abstMethod();

        interProduct.defaultMethod();
        InterProduct.staticMethod();







    }
}
