package com.ohgiraffers.api.string;

public class StringTest {

    public static void main(String[] args) {

        StringProcess sp = new StringProcess();
        String result = sp.preChar("hello world");
        System.out.println("String 후 : " + result);

        int num = sp.charSu("application car cable", 'c');
        System.out.println(num);
    }
}
