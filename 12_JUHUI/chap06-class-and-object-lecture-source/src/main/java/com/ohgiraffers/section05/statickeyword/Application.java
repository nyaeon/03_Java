package com.ohgiraffers.section05.statickeyword;

public class Application {

    public static void main(String[] args) {

        /*
         * static
         * : 프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에
         * 할당되는 키워드다. 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
         * 대표적인 예로 싱글톤(singleton)객체가 있다.
         */
        StaticFieldTest st1 = new staticFiledTest();

        st1.
        System.out.println("non-static field : " + st1.getNonStaticCount());
        System.out.println("static field : " + st1.getNStaticCount());

        staticFiledTest st2 = new staticFiledTest();
        System.out.println("new non-static field : " + st2.getNonStaticCount());
        System.out.println("new static field : " + st2.getStaticCount());

        System.out.println("=================================");
        DepartmentStore store = new DepartmentStore();

        store.getStockCount();
        store.buyProduct();
        store.getStockCount();

        OverseasDirectPurchase overseas = new OverseasDirectPurchase();
        overseas.buyDirectPurchase(10);
        store.getStockCount();


    }


