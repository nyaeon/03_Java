package com.ohgiraffers.section02.functionalinterface;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {
        // Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)

        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));
    }

}
