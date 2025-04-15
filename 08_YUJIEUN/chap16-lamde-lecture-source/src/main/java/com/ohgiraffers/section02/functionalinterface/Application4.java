package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Operater : Function과 똑갗이 applyXXX() 메소드를 가지고 있다.
        *            차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
        * */

        BinaryOperator<String> binaryOperator = (String str1,String str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Hello", "World"));


        UnaryOperator<String> unaryOperator = (String str) -> str +"world!";
        System.out.println(unaryOperator.apply("hello"));

    }
}
