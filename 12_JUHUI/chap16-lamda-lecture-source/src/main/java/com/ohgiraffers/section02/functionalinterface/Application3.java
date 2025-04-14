package com.ohgiraffers.section02.functionalinterface;

import java.util.SimpleTimeZone;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    public static void main(String[] args) {

        //Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)

        Function<String, Integer> function = (str)  -> Integer.parseInt(str);//(파싱)문자열에 있는걸 정수로 바꾸겠다.
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());//getClass().getName()는 오브젝트 타입에서만 사용가능

        // 두 값을 더 해 정수값을 받겠다
        BiFunction<String, String, Integer> biFunction
                = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "5678";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());

    }
}
