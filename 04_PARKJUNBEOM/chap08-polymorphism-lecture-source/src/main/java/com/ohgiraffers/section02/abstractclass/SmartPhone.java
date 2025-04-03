package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {

    public SmartPhone() {}

    @Override
    public void abstMethod() {  // 제정일 부여
        System.out.println("Product클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("smartPhone 클래스의 printSmartPhone 메소드 호출함...");

        Product product = new SmartPhone();
        product.abstMethod();
        product.nonStaticMethod();

        Product.StaticMethod();

        /*
        * 추상 클래스를 왜 쓰는가?
        * 추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여된다.
        * 따라서 여러 클래스들을 그룹화하여 필수 기능을 정의하여 강제성을 부여해 개발 시 일관된 인터페이스를 제공할 수 있다.
        * */
    }
}
