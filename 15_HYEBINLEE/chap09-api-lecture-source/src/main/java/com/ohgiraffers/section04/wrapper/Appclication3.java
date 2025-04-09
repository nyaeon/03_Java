package com.ohgiraffers.section04.wrapper;

public class Appclication3 {

    public static void main(String[] args) {

        // parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요

        /*
        * valueOf() : 기본자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
        * toString() : 필드값을ㄹ 문자열로 반환하는 메소드
        * */

        String b = Byte.valueOf((byte)1).toString() ;
        String s = Short.valueOf((short)1).toString() ;
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();


        for (int j = 0; j < 5; j++) {
            System.out.println();
        }



    }
}
