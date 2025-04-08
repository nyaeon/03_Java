package com.ohgiraffers.section05.statickeyword;

import com.ohgiraffers.section04.parameter.Departmentstore;
import com.ohgiraffers.section04.parameter.Overseasdirectpurchase;

public class Application {
    public static void main(String[] args) {
        /*
         *static
         * :프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에
         * 할당하는 키워드. 여러 인스턴스가 공유해서 사용할 목적의 공간임
         * 대표적인 예로 싱클톤 객체가 있다.
         */
        Staticfieldtest st1 = new Staticfieldtest();
        System.out.println("non-staticfieldtest: " + st1.getNonstaticcount());
        System.out.println("staticfieldtest: " + st1.getStaticcount());

        st1.incrementNonstaticcount();
        st1.incrementStaticcount();
        System.out.println("non-staticfieldtest: " + st1.getNonstaticcount());
        System.out.println("staticfieldtest: " + st1.getStaticcount());

        Staticfieldtest st2 = new Staticfieldtest();
        System.out.println("new-staticfieldtest: " + st2.getNonstaticcount());
        System.out.println("new staticfieldtest: " + st2.getStaticcount());

        System.out.println("======================================");
        Departmentstore store = new Departmentstore();
        store.getstockcount();
        store.buyproduct(3);
        store.getstockcount();
        Overseasdirectpurchase overseas = new Overseasdirectpurchase();
        overseas.buydirectpurchase(10);
        store.getstockcount();

    }
}
