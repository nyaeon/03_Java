package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /*
         * Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다.
         *            차이점은 매개변수로 연산을 한 후 동일타입으로 리턴한다.
         */
        // String : 인자 값
        // 강제성을 해야하는 것은 추상메소드
        // static은 강제성을 부여 할 필요 없다.
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        UnaryOperator<String> unaryOperator = (str) -> str + " world!";
        System.out.println(unaryOperator.apply("hello"));
    }

}
