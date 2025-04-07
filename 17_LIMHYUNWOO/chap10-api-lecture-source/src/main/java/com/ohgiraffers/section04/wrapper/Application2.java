package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {
        // parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing 이라고 한다.
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8"); //8L은 안됨
        float f = Float.parseFloat("4.0f"); //4.0f는 됨
        double d = Double.parseDouble("34.0");
        boolean bll = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);



    }
}
