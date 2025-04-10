package com.ohgiraffers.api.string;

public class StringTest {

    public static void main(String[] args) {
        StringProcess sp = new StringProcess();
        String result = sp.preChar("hello world");
        System.out.println(result);

        System.out.println(sp.charSu("application car cable", 'c'));
    }
}
