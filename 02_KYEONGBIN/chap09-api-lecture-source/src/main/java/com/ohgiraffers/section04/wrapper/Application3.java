package com.ohgiraffers.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {

        /*
         * parsing과 반대로, 기본 자료형 값을 문자열(String)로 변환할 수도 있어요!
         *
         * 변환 방법:
         * 1. valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환 (객체로 감싼 후)
         *    → toString()을 사용해 문자열로 변환
         *
         * 2. String.valueOf() : 기본 자료형 값을 바로 문자열로 변환
         *
         * 3. "" + 값 : 문자열과 숫자를 더하면 자동으로 문자열로 변환됨 (가장 간단한 방법!)
         */

        // valueOf() + toString() 방식
        String b = Byte.valueOf((byte) 1).toString();    // byte → Byte → String
        String s = Short.valueOf((short) 2).toString();  // short → Short → String
        String i = Integer.valueOf(3).toString();        // int → Integer → String
        String l = Long.valueOf(4L).toString();         // long → Long → String
        String f = Float.valueOf(5.0f).toString();      // float → Float → String
        String d = Double.valueOf(6.0).toString();      // double → Double → String
        String bl = Boolean.valueOf(true).toString();  // boolean → Boolean → String
        String c = Character.valueOf('A').toString();  // char → Character → String

        // String.valueOf() 방식 (더 간단함)
        String str = String.valueOf(10);  // int → String
        String str2 = String.valueOf(3.14);  // double → String

        // 가장 간단한 방법: "" + 값
        String str3 = "" + 123; // 숫자에 빈 문자열을 더하면 자동으로 String 변환됨
        String str4 = "" + 3.14;
        String str5 = "" + true;

        // 결과 출력
        System.out.println("b : " + b);
        System.out.println("s : " + s);
        System.out.println("i : " + i);
        System.out.println("l : " + l);
        System.out.println("f : " + f);
        System.out.println("d : " + d);
        System.out.println("bl : " + bl);
        System.out.println("c : " + c);
        System.out.println("str : " + str);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
        System.out.println("str5 : " + str5);
    }
}
