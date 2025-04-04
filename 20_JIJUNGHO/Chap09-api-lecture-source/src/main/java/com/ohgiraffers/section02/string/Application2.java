package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {

        /*
         * 문자열 객체를 만드는 방법
         * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.
         * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
         * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        // 원래의 주소값은 변경되지 않았지만, 오버라이딩을 통해 임의로 변경해준것
        // str1,2,3,4의 hashCode 값이 똑같은 이유 : hashCode 값을 오버라이딩 해줬기 때문
        System.out.println("str1의 hashCode : " + str1.hashCode());
        System.out.println("str2의 hashCode : " + str2.hashCode());
        System.out.println("str3의 hashCode : " + str3.hashCode());
        System.out.println("str4의 hashCode : " + str4.hashCode());

        // 원본 주소값 출력
        System.out.println("identityHashCode : " + System.identityHashCode(str1));
        System.out.println("identityHashCode : " + System.identityHashCode(str2));
        System.out.println("identityHashCode : " + System.identityHashCode(str3));
        System.out.println("identityHashCode : " + System.identityHashCode(str4));

        // 원본은 유지한채로 새로운 인스턴스가 생성된다.
        str2 += "mysql";
        System.out.println(str1 == str2);

        System.out.println("Str1.equals(str3) : " + str1.equals(str3));
        System.out.println("Str1.equals(str4) : " + str1.equals(str4));

    }
}
