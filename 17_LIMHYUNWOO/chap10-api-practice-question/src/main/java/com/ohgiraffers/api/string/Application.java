package com.ohgiraffers.api.string;

public class Application {
    public static void main(String[] args) {
        StringPorcess sp = new StringPorcess();
        String result  = sp.preChar("hellow world");
        System.out.println(result);

        int num = sp.charSu("application car cable",'c');
        System.out.println(num);
    }
}
