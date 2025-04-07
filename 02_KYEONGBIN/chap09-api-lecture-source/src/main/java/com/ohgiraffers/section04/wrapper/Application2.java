package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /*
         * parsing(파싱) : 문자열(String) 데이터를 숫자와 같은 기본 자료형으로 변환하는 과정
         *
         * 예시:
         * String str = "123";
         * int num = Integer.parseInt(str); // "123" → 123 (문자열을 숫자로 변환)
         */

        byte b = Byte.parseByte("1"); // 문자열 "1"을 byte 타입 숫자 1로 변환
        System.out.println(b);

        short s = Short.parseShort("2"); // 문자열 "2"를 short 타입 숫자 2로 변환
        System.out.println(s);

        int i = Integer.parseInt("4"); // 문자열 "4"를 int 타입 숫자 4로 변환
        System.out.println(i);

        long l = Long.parseLong("8"); // 문자열 "8"을 long 타입 숫자 8로 변환
        System.out.println(l);

        float f = Float.parseFloat("2.5f"); // 문자열 "2.5f"를 float 타입 숫자로 변환
        System.out.println(f);

        double d = Double.parseDouble("3.5"); // 문자열 "3.5"를 double 타입 숫자로 변환
        System.out.println(d);

        boolean bool = Boolean.parseBoolean("true"); // 문자열 "true"를 boolean 타입으로 변환
        System.out.println(bool);

        // char은 따로 parse 메서드가 없고, 문자열에서 특정 위치의 문자를 가져오는 방식으로 사용
        char c = "abc".charAt(0); // 문자열 "abc"의 첫 번째 문자 'a'를 가져옴
        System.out.println(c);
    }
}
