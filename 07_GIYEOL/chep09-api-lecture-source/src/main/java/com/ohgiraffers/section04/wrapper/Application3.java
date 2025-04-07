package com.ohgiraffers.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {
        //pasring 과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요
        /***
         * valueof() : 기본 자료형 값을 wrapper 클래스 타입으로 변환 시키는 메소드
         * toString() ; 필드값을 문자열로 반환하는 메소드
         *
         */
        String b = Byte.valueOf((byte ) 1).toString();
        String s = Short.valueOf((short) 2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        String str= String.valueOf(10);

        String str2 = "" + 123;


        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
        System.out.println(c);
        System.out.println(str);


    }
}
