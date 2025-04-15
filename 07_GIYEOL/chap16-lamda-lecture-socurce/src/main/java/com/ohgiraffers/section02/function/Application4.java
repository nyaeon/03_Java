package com.ohgiraffers.section02.function;

import com.sun.source.tree.UnaryTree;

import javax.naming.BinaryRefAddr;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {

        /***
         * OPerator : FUnction과 같이 applyXXX() 메소드를 가짐
         * 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴함
         */
        BinaryOperator<String> binaryOperator = (String str1, String str2) -> str1 +str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        UnaryOperator<String> unaryOperator = (String str) -> str + "world";
        System.out.println(unaryOperator.apply("hello"));


    }
}
