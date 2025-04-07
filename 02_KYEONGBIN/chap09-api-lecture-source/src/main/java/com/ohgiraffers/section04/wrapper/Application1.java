package com.ohgiraffers.section04.wrapper;

import java.util.HashMap;
import java.util.Map;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 래퍼 클래스(Wrapper Class)란?
         * - 기본 타입(int, double 등)을 객체로 다뤄야 할 때 사용하는 클래스예요.
         * - 기본 타입과 대응되는 래퍼 클래스가 있어요:
         *   byte -> Byte, short -> Short, int -> Integer, long -> Long
         *   float -> Float, double -> Double, char -> Character, boolean -> Boolean
         */

        /*
         * 박싱(Boxing)과 언박싱(UnBoxing)
         * - 기본 타입을 래퍼 클래스 객체로 변환하는 걸 **박싱(Boxing)**
         * - 래퍼 클래스 객체를 기본 타입으로 변환하는 걸 **언박싱(UnBoxing)**
         */

        int intValue = 20;

        // 박싱(정수 -> Integer 객체로 변환)
        Integer boxingNumber1 = Integer.valueOf(intValue); // 명시적 박싱

        // 언박싱(Integer 객체 -> 정수로 변환)
        int unBoxingNumber1 = boxingNumber1.intValue(); // 명시적 언박싱

        // 오토박싱 (자동 변환)
        Integer boxingNumber2 = intValue;

        // 오토 언박싱 (자동 변환)
        int unBoxingNumber2 = boxingNumber2;

        /*
         * Integer 객체 비교
         * - `Integer.valueOf(숫자)`로 생성된 객체는 같은 값을 가지더라도 다른 객체로 취급됨
         * - `Integer`를 직접 대입한 경우(-128~127 범위) 같은 객체로 취급될 수 있음 (자바 내부 캐싱 때문)
         */
        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int 와 Integer 비교 : " + (inum == integerNum1)); // true (기본 타입 비교)
        System.out.println("int 와 Integer 비교 : " + (inum == integerNum3)); // true (기본 타입 비교)
        System.out.println("Integer 와 Integer 비교 : " + (integerNum1 == integerNum2)); // false (서로 다른 객체)
        System.out.println("Integer 와 Integer 비교 : " + (integerNum3 == integerNum4)); // true (내부 캐싱된 같은 객체)

        /*
         * Map 사용 예제 (HashMap)
         * - Map은 키-값 쌍으로 데이터를 저장하는 자료구조
         * - Integer를 키로, String을 값으로 저장하는 HashMap 예제
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(2, "bye");
        System.out.println(map.get(1)); // 키 1에 해당하는 값("hi") 출력
    }
}