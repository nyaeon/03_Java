package com.ohgiraffers.section05.statickeyword;

public class Application {
    public static void main(String[] args) {
        /*
        * static
        * : 프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스영역)
        *   할당하는 키워드이다. 여러 인스턴스가 공유해서 사용할 목적의 공간이ek.
        *   대표적인 예로 싱글톤(singleton) 객체가 있다.
        * */

        StaticFieldTest st1 = new StaticFieldTest();
        System.out.println("non-static field : "+ st1.getNonStaticCount());
        System.out.println("static field : "+ st1.getStaticCount());

        st1.increaseNonStaticCount();
        st1.increaseStaticCount();

        System.out.println("non-static field : "+ st1.getNonStaticCount());
        System.out.println("static field : "+ st1.getStaticCount());

        StaticFieldTest st2 = new StaticFieldTest();

        System.out.println("new non-static field : "+ st2.getNonStaticCount());
        System.out.println("new static field : "+ st2.getStaticCount());

        System.out.println("=========================");

        DepartmentStore store = new DepartmentStore();
        OverseasDirectPurchase overseas = new OverseasDirectPurchase();
        overseas.buyDirectPurchase(3);
        store.getStockCount();
    }
}
