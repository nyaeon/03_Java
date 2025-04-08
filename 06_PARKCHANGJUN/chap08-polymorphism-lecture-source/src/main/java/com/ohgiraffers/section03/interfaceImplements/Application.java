package com.ohgiraffers.section03.interfaceImplements;

public class Application {

    public static void main(String[] args) {

        /**
         * 인터페이스
         * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
         * 추상메소드와 상수필드(public static final)만 가질 수 있는 클래스의 변형체를 말한다.
         */
//        InterProduct interProduct = new InterProduct();
        // 인터페이스는 뭔가 인스턴스를 생성하는 생성자 조차 가지고 있지 않기 때문에 혼자 생성 불가능
        // 컨트롤 쉬프트 i
        InterProduct interProduct = new Product(); // 혼자 생성할수는 없지만 상위타입으로는 사용가능하다. 즉, 다형성을 받은것
        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        interProduct.defaultMethod();
        InterProduct.staticMethod(); // 클래스명.메소드명

        // 상수필드(public static fianl) 접근도 인터페이스명.필드명
        System.out.println(interProduct.MAX_NUM);
        System.out.println(interProduct.MIN_NUM);
    }
}
