package com.ohgiraffers.section04.wrapper;

public class Application2 {

    public static void main(String[] args) {

       // parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing 이라고 한다.
        byte b = Byte.parseByte("1");
        System.out.println(b);

        short s = Short.parseShort("2");//클래스명.메소드명 = static메소드 ctrl+shitf +i로 확인가능
        int i = Integer.parseInt("4");//문자열을 숫자로 바꾸는 이거를 제일 많이 씀.
        long l = Long.parseLong("8"); //8L은 안됨. L이 붙으면 안됨
        float f = Float.parseFloat("3.14");//3.14f는 됨
        double d = Double.parseDouble("8.0");
        boolean bool = Boolean.parseBoolean("true");

        char c = "abc".charAt(0); // 얘는 파싱이 없음.그래서 charAt()써야 함.

    }
}
