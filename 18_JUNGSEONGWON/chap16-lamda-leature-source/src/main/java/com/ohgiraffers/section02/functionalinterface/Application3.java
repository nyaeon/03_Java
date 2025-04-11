package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    // Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)

    public static void main(String[] args){

        // 파싱한다는 것은 문자열의 형태를 정수 형태로 바꿔준다고 하는 것이다.
        Function<String, Integer> function = (str) ->Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());
        System.out.println("===============================================================");
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "56789";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());
    }

    public static class Application4 {

    }
}
