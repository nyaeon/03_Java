package com.ohgiraffers.section04.comparsion;

public class Application1 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 10;

        System.out.println(iNum1 == iNum2);
        System.out.println(iNum1 != iNum2);
        System.out.println(iNum1 >= iNum2);
        System.out.println(iNum1 > iNum2);
        System.out.println(iNum1 < iNum2);
        System.out.println(iNum1 <= iNum2);

        // 문자값의 비교는 결국은 숫자값 비교와 동일

        // 논리값 비교
        boolean isNumber1 = true;
        boolean isNumber2 = false;

        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber1 != isNumber2);

//        System.out.println(isNumber1 > isNumber2);
//        System.out.println(isNumber1 >= isNumber2);
//        System.out.println(isNumber1 < isNumber2);
//        System.out.println(isNumber1 <= isNumber2);

        // 문자열값 비교
        String str3 = "java";
        String str4 = "java";

        System.out.println(str3 == str4);
        System.out.println(str3 != str4);

    }
}
