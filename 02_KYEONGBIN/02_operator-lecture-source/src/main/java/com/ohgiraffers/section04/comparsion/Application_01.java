package com.ohgiraffers.section04.comparison;

public class Application_01 {
    public static void main(String[] args) {

        // 정수형 변수 선언 및 초기화
        int iNum1 = 10;
        int iNum2 = 20;

        // 비교 연산자를 사용한 출력 (결과는 true 또는 false)
        System.out.println("iNum1 == iNum2 : " + (iNum1 == iNum2)); // 두 값이 같은지 비교 (false)
        System.out.println("iNum1 != iNum2 : " + (iNum1 != iNum2)); // 두 값이 다른지 비교 (true)
        System.out.println("iNum1 > iNum2  : " + (iNum1 > iNum2));  // iNum1이 iNum2보다 큰지 비교 (false)
        System.out.println("iNum1 < iNum2  : " + (iNum1 < iNum2));  // iNum1이 iNum2보다 작은지 비교 (true)
        System.out.println("iNum1 >= iNum2 : " + (iNum1 >= iNum2)); // iNum1이 iNum2보다 크거나 같은지 비교 (false)
        System.out.println("iNum1 <= iNum2 : " + (iNum1 <= iNum2)); // iNum1이 iNum2보다 작거나 같은지 비교 (true)

        System.out.println(); // 개행 (출력 줄바꿈을 위해 추가)

        // 논리값을 저장하는 boolean 변수 선언
        boolean isNumber1 = true;  // true는 1처럼 해석됨
        boolean isNumber2 = false; // false는 0처럼 해석됨

        // 논리값 비교 (==, != 연산자만 사용 가능)
        System.out.println("isNumber1 == isNumber2  : " + (isNumber1 == isNumber2)); // 두 값이 같은지 비교 (false)
        System.out.println("isNumber1 != isNumber2  : " + (isNumber1 != isNumber2)); // 두 값이 다른지 비교 (true)

        /*
        boolean 값은 크다(>), 작다(<) 같은 비교 연산을 사용할 수 없음
        System.out.println(isNumber1 > isNumber2);  // 오류 발생
        System.out.println(isNumber1 < isNumber2);  // 오류 발생
        */

        System.out.println(); // 개행

        // 문자열 비교 (문자열은 == 연산자로 비교하면 안 되는 경우가 있음)
        String str1 = "java"; // 문자열 리터럴 생성 (String 풀에 저장됨)
        String str2 = "java"; // 같은 문자열이므로 같은 참조값을 가짐

        System.out.println("str1 == str2 : " + (str1 == str2)); // 같은 참조값을 가지므로 true
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // 문자열 내용이 같은지 비교 (true)

        /*
        문자열 비교 시에는 반드시 equals() 메서드를 사용할 것
        str1과 str2가 같은 "java" 문자열을 가리키므로 == 연산자도 true를 반환하지만,
        new String("java") 로 생성한 경우 == 연산자는 false가 될 수 있음
        */
    }
}
