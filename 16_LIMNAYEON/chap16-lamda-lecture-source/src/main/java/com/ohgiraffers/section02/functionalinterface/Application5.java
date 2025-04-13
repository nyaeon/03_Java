package com.ohgiraffers.section02.functionalinterface;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {

        Predicate<Object> predicate = obj -> obj instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("Hello"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));

    }
}
