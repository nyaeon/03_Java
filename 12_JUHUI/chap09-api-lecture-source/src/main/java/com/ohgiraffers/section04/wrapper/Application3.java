package com.ohgiraffers.section04.wrapper;

public class Application3 {

    public static void main(String[] args) {

        // parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요
        // 기본자료형을 문자열로 바꾸는 작업

        /*
         * valueOf() : 기본자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
         * toString() : 필드값을 문자열로 반환하는 메소드
         */
        String b = Byte.valueOf((byte) 1).toString(); //1은 int인데 byte라 안됨.강제 형변환시켜줘야함.
        String s = Short.valueOf((short) 1).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(1L).toString();
        String f = Float.valueOf(3.14f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        String str = String.valueOf(10);

        String str2 = "" + 123; // 젤 쉬운 방법 "(쌍따옴표) 두개 붙이면 문자열로 됨.

        // i[0] : 책1
        // i[1] : 책2
        // i[2] : 책3
        // i[3] : 책4

        for(int j=0;j<5;j++) {
            System.out.println("i[" + j + "] : 책" + (j +1));
        }
    }
}
