package com.ohgiraffers.section04;

public class Application2 {

    public static void main(String[] args) {

        // parsing : 문자열 (String) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
        // 문자열 => 기본자료형
        byte b = Byte.parseByte("1");
        System.out.println(b);
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");   // 8L은 안됨
        float f = Float.parseFloat("4.0");  // 3.14f는 됨
        double d = Double.parseDouble("8.0");
        boolean bool = Boolean.parseBoolean("true");
        char c = "abc".charAt(0);

    }
}
