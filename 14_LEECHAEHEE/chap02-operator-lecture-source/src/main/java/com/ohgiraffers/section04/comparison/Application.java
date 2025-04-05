package com.ohgiraffers.section04.comparison;

public class Application {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 20;

        System.out.println(iNum1 == iNum2);
        System.out.println(iNum1 != iNum2);
        System.out.println(iNum1 >= iNum2);
        System.out.println(iNum1 > iNum2);
        System.out.println(iNum1 <= iNum2);
        System.out.println(iNum1 < iNum2);
        // 문자값 비교는 결국 숫자 비교와 동일

        // 논리값 비교 - 같다와 같지 않다만 가능
        boolean isNumber1 = true;
        boolean isNumber2 = false;
        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber2 != isNumber1);

        // 문자열값 비교 - 값 자체가 아닌 주소값을 비교함
        String str3 = "java";
        String str4 = "java";
        System.out.println(str3 == str4);
        System.out.println(str3 != str4);
    }


}
