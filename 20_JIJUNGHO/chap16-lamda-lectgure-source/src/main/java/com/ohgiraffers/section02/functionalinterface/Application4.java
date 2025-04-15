package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {
        //Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.

        // 똑같은 타입 2개를 가지고, 결과값의 타입도 똑같이 준다.
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello ", "world"));

        // 하나의 입력을 받아서 같은 타입의 결과를 반환
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));

    }

}
