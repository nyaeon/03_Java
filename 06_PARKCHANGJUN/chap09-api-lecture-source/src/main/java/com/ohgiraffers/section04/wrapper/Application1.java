package com.ohgiraffers.section04.wrapper;

import java.util.HashMap;
import java.util.Map;

public class Application1 {

    public static void main(String[] args) {

        /**
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
         **/

        /**
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고하며,
         * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
         **/

        int intValue = 20; // 정수형 변수 선언 및 초기화
//        Integer boxingNumber1 = new integer(intValue);
        // static 메소드 int -> Integer
        Integer boxingNumber1 = Integer.valueOf(intValue); // 클래스명.메소드명 이므로 static method

        int unBoxingNumber1 = boxingNumber1.intValue(); // Integer => int

        Map<Integer, String> map = new HashMap<>(); // 클래스 타입으로만 쓰기로 약속이 되어 있기 때문에 int는 사용 불가. 왜 사용 안되는지 다시 한번 확인해보기
        map.put(1, "hi");
        map.put(2, "bye");

        System.out.println(map.get(1));

        // 오토박싱
        Integer boxingNumber2 = intValue;

        // 오토언박싱
        int unBoxingNumber2 = boxingNumber2;

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20); // integerNum1 - 주소값
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1)); // 여기서는 값 비교라 같다고 나옴.
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));

        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2));
        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3));
        System.out.println("integer와 integer 비교 : " + (integerNum2 == integerNum3));


    }
}
