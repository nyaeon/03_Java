package com.ohgiraffers.section04.wrapper;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        /*
         * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
         * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
         * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스(Wrapper class)
         * 라고 한다.
         *
         * 기본타입      래퍼클래스
         * byte          Byte
         * short         Short
         * int           Integer
         * long          Long
         * float         Float
         * double        Double
         * char          Character
         * boolean       Boolean
         * */

        /*
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고하며,
         * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
         * */
        int intValue = 20;
//        Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber1 = Integer.valueOf(intValue); // static 메소드 int -> Integer
        int unboxingNumber = boxingNumber1.intValue(); // Integer => int

        // 오토박싱
        Integer boxingNumber2 = intValue;
        // 오토언박싱
        int unboxingNumber2 = boxingNumber2;

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));

        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum2));
        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum3));
        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum4));


    }
}
