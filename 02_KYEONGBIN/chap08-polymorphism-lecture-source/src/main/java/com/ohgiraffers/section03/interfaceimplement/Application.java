package com.ohgiraffers.section03.interfaceimplement;

public class Application {
    public static void main(String[] args) {

        /*
        인터페이스
        여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
        추상메소드와 상수필드 (public static)만 가질 수 있는 클래스의 변형제를 맗나다.
         */

//        interProduct interProduct = new interProduct() {}

        interProduct interProduct = new Product() {}; // 혼자 생성할 수는 없지만 상위타입으로는 사용 가능하다.
        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        interProduct.defaultMethod();
//        interProduct.staticMethod();

        // 상수필드 (public static final) 접근도 인터페이스명.필드명 으로 한다.
        System.out.println(interProduct.MAX_NUM);
        System.out.println(interProduct.MIN_NUM);
    }

}