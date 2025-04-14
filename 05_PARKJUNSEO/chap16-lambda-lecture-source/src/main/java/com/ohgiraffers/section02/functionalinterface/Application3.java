package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {

        // Function : 매개변수와 반환 값이 있는 applyXXX() 메소드

        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());

        BiFunction<String, String, Integer> bifunction
                = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);

        String str1 = "12345";
        String str2 = "56789";
        System.out.println(bifunction.apply(str1, str2));
        System.out.println(bifunction.apply(str1, str2) + " : " + bifunction.apply(str1, str2).getClass().getName());

    }
}
