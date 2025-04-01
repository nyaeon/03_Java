package com.ohgiraffers.section05.statickeyword;

public class Application {
    public static void main(String[] args) {
        
        /*
         * static
         * : 프로그램이 실행될 때 정적 메모리 영역 (static 영역 또는 클래스 영역)에 
         *   할당하는 키워드이다. 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
         *   대표적인 예로 싱글톤(Singleton) 객체가 있다.
         */
        
        // StaticFieldTest 객체 생성
        StaticFieldTest st1 = new StaticFieldTest();
        StaticFieldTest st2 = new StaticFieldTest();

        // non-static 필드와 static 필드 출력
        System.out.println("non-static field (st1): " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        // 필드 값 증가
        st1.increaseNonStaticCount();
        st1.increaseStaticCount();  // st1 객체를 통해 static 필드 값 증가

        // 필드 값 출력
        System.out.println("non-static field (st1): " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        // 필드 값 증가
        st2.increaseNonStaticCount();
        st2.increaseStaticCount();  // st2 객체를 통해 static 필드 값 증가

        // 필드 값 출력
        System.out.println("non-static field (st2): " + st2.getNonStaticCount());
        System.out.println("static field: " + StaticFieldTest.getStaticCount());

        System.out.println("-------------------------------------");
        DepartmentStore store = new DepartmentStore();
        store.getStockCount();
        store.buyProduct(3);
        store.getStockCount();
        OverseasDirectPurchase oversea = new OverseasDirectPurchase();
    }
}
