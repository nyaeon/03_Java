package com.ohgiraffers.section04.wrapper;

import java.util.HashMap;
import java.util.Map;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
         * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
         * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도(Object 클래스의 메소드를 쓸 수 있다)록 하는 클래스를 래퍼클래스(Wrapper class)
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
        */

        /*
         * 박싱(Boxing)과 언박싱(UnBoxing)                    Map을 사용할때 파라미터에 왼쪽엔 클래스가 들어가는데 그럴때 주로 사용 int변수를 Integer라는 클래스로 래핑해서 사용
         * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고하며,
         * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
        */
        int intValue = 20;
        String str = "hello";
//        Integer boxingNumber1 = new Integer(intValue);
        Integer boixingNumber1 = Integer.valueOf(intValue); // static 메소드 int -> Integer

        int unBoixingNumber1 = boixingNumber1.intValue(); // Integer - > int

        Map<Integer , String> map = new HashMap<>();
        map.put(1,"hi");
        map.put(2,"bye");

        // 오토박싱
        Integer boixingNumber2 = intValue;

        // 오토언박싱
        int unBoixingNumber2 = boixingNumber2.intValue();

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2= Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));
        System.out.println("Integer 와 Integer 비교 : " + (integerNum2 == integerNum1));
        System.out.println("Integer 와 Integer 비교 : " + (integerNum2 == integerNum3));
        System.out.println("Integer 와 Integer 비교 : " + (integerNum2 == integerNum4));

    }
}
