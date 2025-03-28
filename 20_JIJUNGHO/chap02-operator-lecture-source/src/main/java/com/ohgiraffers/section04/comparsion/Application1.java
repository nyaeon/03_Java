package com.ohgiraffers.section04.comparsion;

public class Application1 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 20;

        System.out.println(iNum1 == iNum2); // false
        System.out.println(iNum1 != iNum2); // true
        System.out.println(iNum1 >= iNum2); // fasle
        System.out.println(iNum1 > iNum2); // fasle
        System.out.println(iNum1 <= iNum2); // true
        System.out.println(iNum1 < iNum2); // true

        // 문자값의 비교는 결국은 숫자값의 비교와 동일

        // 논리값 비교는 ==, != 만 비교 가능
        boolean isNumber1 = true;
        boolean isNumber2 = false;

        System.out.println("isNumber1과 isNumber2가 같은지 비교 : " + (isNumber1 == isNumber2));
        System.out.println("isNumber1과 isNumber2가 같지 않은지 비교 : " + (isNumber1 != isNumber2));

        // System.out.println("isNumber1이 isNumber2보다 큰지 비교 : " + (isNumber1 > isNumber2));
        // System.out.println("isNumber1이 isNumber2보다 크거나 같은지 비교 : " + (isNumber1 >= isNumber2));
        // System.out.println("isNumber1이 isNumber2보다 작은지 비교 : " + (isNumber1 < isNumber2));
        // System.out.println("isNumber1이 isNumber2보다 작은거나 같은지 비교 : " + (isNumber1 <= isNumber2));

        // 문자열값 비교 ==, != 만 비교 가능
        // 참조문자열이기 때문에 주소값과 주소값의 비교
        String str3 = "java";
        String str4 = "java";

        System.out.println(str3 == str4); // true
        System.out.println(str3 != str4); // false
    }
}
