package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {

        /*
         *  String과 StringBuilder의 차이점
         *
         *  🔸 String (문자열)
         *    - 한 번 만든 문자열은 **절대 바뀌지 않는(불변)** 특징을 가지고 있어요.
         *    - 문자열을 +로 붙이면 **기존 문자열이 바뀌는 게 아니라**, **새로운 문자열 객체**를 새로 만들어요.
         *    - 그래서 문자열을 자주 바꾸면 **매번 새 객체를 만들기 때문에 비효율적(느림)**이에요.
         *    - 하지만 자주 **읽기만 하고 안 바꾸는 경우**에는 오히려 효율적이에요.
         *
         *  🔸 StringBuilder
         *    - **바뀔 수 있는(가변)** 문자열이에요.
         *    - append() 메서드로 문자열을 붙이면, **기존 객체에 바로 수정**돼요.
         *    - 새로운 객체를 만들지 않기 때문에, 문자열을 **자주 바꾸는 상황에서는 빠르고 효율적**이에요.
         *
         * ✅ 결론:
         *    - 문자열을 **계속 바꾸고 붙일 일이 많으면 StringBuilder**를 쓰세요!
         *    - 문자열을 **변경하지 않고 읽기만 한다면 String**도 괜찮아요.
         */

        StringBuilder sb = new StringBuilder("java");

        System.out.println("Sb : " + sb.toString());

        System.out.println("sb's hashCode() : " + sb.hashCode());

        sb.append("mysql");
        System.out.println("Sb : " + sb.toString());
        System.out.println("sb's hashCode() : " + sb.hashCode());

        String str = "hello";
        System.out.println(str.hashCode());

        str += "world";
        System.out.println(str.hashCode());




    }

}
