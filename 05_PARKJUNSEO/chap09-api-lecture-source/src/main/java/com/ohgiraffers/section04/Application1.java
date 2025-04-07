package com.ohgiraffers.section04;

import java.util.HashMap;
import java.util.Map;

public class Application1 {

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

//      Integer boxingNumber1 = new Integer(intValue);

        Integer boxingNumber1 = Integer.valueOf(intValue);    // static 메소드 int라는 기본 타입 => Integer라는 래퍼 타입으로 변환해줌
        // (이렇게 해야 함)

        int unboxingNumber1 = boxingNumber1.intValue();          // Integer => int

//      Map<>에는 클래스 타입만 들어올 수 있기 때문에 Integer 등을 넣어서 써야 한다.

        // 오토박싱
        Integer boxingNumber2 = intValue;

        // 오토 언박싱
        Integer unboxingNumber2 = boxingNumber2;

        int inum = 20;

        Integer integerNum1  = Integer.valueOf(20);
        Integer integerNum2  = Integer.valueOf(20);
        Integer integerNum3  = 20;
        Integer integerNum4  = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));           // 둘이 타입이 다름. 근데 true가 나오는 건 값 비교를 한다는 뜻
        System.out.println("int와 Integer 비교 : " + (integerNum1 == integerNum2));    // true 값 비교 한다는 뜻
        System.out.println("int와 Integer 비교 : " + (integerNum1 == integerNum3));    // true 값 비교 한다는 뜻
        System.out.println("int와 Integer 비교 : " + (integerNum1 == integerNum4));    // true 값 비교 한다는 뜻




    }
}
