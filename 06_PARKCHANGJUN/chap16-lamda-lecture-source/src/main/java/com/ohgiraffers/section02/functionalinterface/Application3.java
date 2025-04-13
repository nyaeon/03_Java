package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    public static void main(String[] args) {

        // Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)

        Function<String, Integer> function = (String str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());
        // getClass, getName 등은 오브젝트 타입일 때 객체를 가지고 올 수 있다.

        BiFunction<String, String, Integer> biFunction
                = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "56789";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());
        // str2 = 12345 + 56789
    }
}
